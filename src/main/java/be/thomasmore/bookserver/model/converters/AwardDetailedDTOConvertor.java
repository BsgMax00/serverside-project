package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.dto.AwardDetailedDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class AwardDetailedDTOConvertor {
     @Autowired
     private ModelMapper modelMapper;

     /**
     * @param award the entity from the db
     * @return AuthorDTO object to send to the client.
     */
    public AwardDetailedDTO convertToDto(Award award) {
        return modelMapper.map(award, AwardDetailedDTO.class);
    }
}
