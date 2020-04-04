package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.entities.PeopleEntity;
import org.springframework.http.ResponseEntity;

public interface PeopleService {
    ResponseEntity<?> getAllPeoples();

    ResponseEntity<?> getSinglePeople(Integer id);

    ResponseEntity<?> savePeople(PeopleEntity peopleEntity);
}
