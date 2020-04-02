package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.entities.ContactEntity;
import org.springframework.http.ResponseEntity;

public interface ContactService {
    ResponseEntity<?> getAllContacts();

    ResponseEntity<?> getSingleContact(Integer uuid);

    ResponseEntity<?> saveContact(ContactEntity peopleEntity);
}
