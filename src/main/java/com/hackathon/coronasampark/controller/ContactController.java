package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.entities.ContactEntity;
import com.hackathon.coronasampark.service.ContactService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;


@RestController
@RequestMapping("/contact")
public class ContactController {
    @Inject
    ContactService contactService;

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllContacts() {
        return contactService.getAllContacts();
    }


    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getContact(@ApiParam(value = "contactId is used to identify the contact", required = true, defaultValue = "1")
                                            @PathVariable(value = "id") final Integer contactId) {
        return contactService.getSingleContact(contactId);
    }

    @PostMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveContact(@RequestBody @Valid ContactEntity contactInfoEntity) {
        return contactService.saveContact(contactInfoEntity);
    }
}
