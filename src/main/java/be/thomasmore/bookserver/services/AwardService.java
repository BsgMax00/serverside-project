package be.thomasmore.bookserver.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.dto.AwardDTO;
import be.thomasmore.bookserver.model.dto.AwardDetailedDTO;
import be.thomasmore.bookserver.model.converters.AwardDTOConverter;
import be.thomasmore.bookserver.model.converters.AwardDetailedDTOConvertor;
import be.thomasmore.bookserver.repositories.AwardRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AwardService {
    @Autowired
    private AwardRepository awardRepository;

    @Autowired
    private AwardDTOConverter awardDTOConverter;

    @Autowired
    private AwardDetailedDTOConvertor awardDetailedDTOConvertor;

    public List<AwardDTO> findAll() {
        final List<Award> awards = awardRepository.findAll();
        return awards.stream()
                .map(a -> awardDTOConverter.convertToDto(a))
                .collect(Collectors.toList());
    }

    public AwardDetailedDTO findOne(int id) {
        final Optional<Award> award = awardRepository.findById(id);
        if (award.isEmpty())
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    String.format("Award with id %d does not exist", id));
 
        return awardDetailedDTOConvertor.convertToDto(award.get());
    }
}
