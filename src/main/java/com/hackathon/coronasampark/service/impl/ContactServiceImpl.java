package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.entities.ContactEntity;
import com.hackathon.coronasampark.repositories.ContactRepository;
import com.hackathon.coronasampark.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Slf4j
@Service
public class ContactServiceImpl implements ContactService {
    @Inject
    ContactRepository contactRepository;

    @Override
    public ResponseEntity<?> getAllContacts() {
        return new ResponseEntity<>(contactRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSingleContact(Integer id) {
        return new ResponseEntity<>(contactRepository.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> saveContact(ContactEntity contactEntity) {
        return new ResponseEntity<>(contactRepository.save(contactEntity),HttpStatus.OK);
    }
}
