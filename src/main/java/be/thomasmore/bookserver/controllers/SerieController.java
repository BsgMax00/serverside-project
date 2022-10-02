package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.converters.SerieDetailedDTOConverter;
import be.thomasmore.bookserver.model.dto.AuthorDTO;
import be.thomasmore.bookserver.model.dto.AuthorDetailedDTO;
import be.thomasmore.bookserver.model.dto.SerieDTO;
import be.thomasmore.bookserver.model.dto.SerieDetailedDTO;
import be.thomasmore.bookserver.services.AuthorService;
import be.thomasmore.bookserver.services.SerieService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/series")
@Slf4j
public class SerieController {

    @Autowired
    private SerieService serieService;

    @Operation(summary = "find all the series that are stored in the database ")
    @GetMapping("")
    public Iterable<SerieDTO> findAll() {
        log.info("##### findAll authors");
        return serieService.findAll();
    }

    @Operation(summary = "get 1 serie from the database.",
            description = "Serie with id is fetched from database - returns detailed info. ")
    @GetMapping("{id}")
    public SerieDetailedDTO findOne(@PathVariable int id) {
        log.info(String.format("##### findOne serie %d", id));
        return serieService.findOne(id);
    }
}
