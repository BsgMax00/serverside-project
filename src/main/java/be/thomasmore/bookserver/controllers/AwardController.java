package be.thomasmore.bookserver.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.thomasmore.bookserver.model.dto.AwardDTO;
import be.thomasmore.bookserver.model.dto.AwardDetailedDTO;
import be.thomasmore.bookserver.services.AwardService;

@RestController
@RequestMapping("/api/awards")
@Slf4j
public class AwardController {
    @Autowired
    private AwardService awardService;

    @Operation(summary = "find all awards that are stored in the database")
    @GetMapping("")
    public Iterable<AwardDTO> findAll() {
        log.info("##### findAll awards");
        return awardService.findAll();
    }

    @Operation(summary = "get 1 award from the database",
            description = "award with id is fetched from database - returns detailed info. ")
    @GetMapping("{id}")
    public AwardDetailedDTO findOne(@PathVariable int id) {
        log.info(String.format("##### findOne award %d", id));
        return awardService.findOne(id);
    }
}
