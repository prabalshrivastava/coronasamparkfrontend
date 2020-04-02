package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.service.AddressService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;


@RestController
@RequestMapping("/address")
public class AddressController {
    @Inject
    AddressService addressService;

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllAddresss() {
        return addressService.getAllAddress();
    }


    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAddress(@ApiParam(value = "addressId is used to identify the address", required = true, defaultValue = "1")
                                            @PathVariable(value = "id") final Integer addressId) {
        return addressService.getSingleAddress(addressId);
    }

    @PostMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveAddress(@RequestBody @Valid AddressEntity addressEntity) {
        return addressService.saveAddress(addressEntity);
    }
}
