package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.entities.PeopleEntity;
import com.hackathon.coronasampark.repositories.PeopleRepository;
import com.hackathon.coronasampark.service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Slf4j
@Service
public class PeopleServiceImpl implements PeopleService {
    @Inject
    PeopleRepository peopleRepository;

    @Override
    public ResponseEntity<?> getAllPeoples() {
        return new ResponseEntity<>(peopleRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSinglePeople(Integer id) {
        return new ResponseEntity<>(peopleRepository.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> savePeople(PeopleEntity peopleEntity) {
        return new ResponseEntity<>(peopleRepository.save(peopleEntity),HttpStatus.OK);
    }
}
