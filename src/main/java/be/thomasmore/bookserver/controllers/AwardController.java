package be.thomasmore.bookserver.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.thomasmore.bookserver.model.dto.AwardDTO;
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
}
