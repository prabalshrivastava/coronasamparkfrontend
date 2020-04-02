package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.entities.AddressEntity;
import org.springframework.http.ResponseEntity;

public interface AddressService {
    ResponseEntity<?> getAllAddress();

    ResponseEntity<?> getSingleAddress(Integer uuid);

    ResponseEntity<?> saveAddress(AddressEntity peopleEntity);
}
