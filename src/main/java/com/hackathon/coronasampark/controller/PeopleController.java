package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.entities.PeopleEntity;
import com.hackathon.coronasampark.service.PeopleService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;


@RestController
@RequestMapping("/people")
public class PeopleController {
    @Inject
    PeopleService peopleService;

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllPeoples() {
        return peopleService.getAllPeoples();
    }


    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPeople(@ApiParam(value = "peopleId is used to identify the people", required = true, defaultValue = "1")
                                            @PathVariable(value = "id") final Integer peopleId) {
        return peopleService.getSinglePeople(peopleId);
    }

    @PostMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> savePeople(@RequestBody @Valid PeopleEntity peopleEntity) {
        return peopleService.savePeople(peopleEntity);
    }
}
