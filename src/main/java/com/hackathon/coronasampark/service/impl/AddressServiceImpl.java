package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.repositories.AddressRepository;
import com.hackathon.coronasampark.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Slf4j
@Service
public class AddressServiceImpl implements AddressService {
    @Inject
    AddressRepository addressRepository;

    @Override
    public ResponseEntity<?> getAllAddress() {
        return new ResponseEntity<>(addressRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSingleAddress(Integer uuid) {
        return new ResponseEntity<>(addressRepository.findById(uuid),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> saveAddress(AddressEntity addressEntity) {
        return new ResponseEntity<>(addressRepository.save(addressEntity),HttpStatus.OK);
    }
}
