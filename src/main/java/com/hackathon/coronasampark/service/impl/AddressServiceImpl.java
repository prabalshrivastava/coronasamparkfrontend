package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.repositories.AddressRepository;
import com.hackathon.coronasampark.repositories.StateRepository;
import com.hackathon.coronasampark.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Objects;

@Slf4j
@Service
public class AddressServiceImpl implements AddressService {
    @Inject
    AddressRepository addressRepository;

    @Inject
    StateRepository stateRepository;

    @Override
    public ResponseEntity<?> getAllAddress() {
        return new ResponseEntity<>(addressRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSingleAddress(Integer id) {
        return new ResponseEntity<>(addressRepository.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> saveAddress(AddressEntity addressEntity) {
        return new ResponseEntity<>(addressRepository.save(addressEntity), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getPincodeAreaCityDistrictStateCountryByTaluka(String taluka) {
        return new ResponseEntity<>(addressRepository.getByTaluka(taluka), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getAreaCityDistrictStateCountryByPincode(Integer pincode) {
        return new ResponseEntity<>(addressRepository.getByPincode(pincode), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getCityDistrictStateCountryByArea(String area) {
        return new ResponseEntity<>(addressRepository.getByArea(area), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getCityStateCountryByDistrict(String district) {
        return new ResponseEntity<>(addressRepository.getByDistrict(district), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getStateCountryByCity(String city) {
        return new ResponseEntity<>(addressRepository.getByCity(city), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getCountryByState(String state, Integer stateId) {
        return new ResponseEntity<>(addressRepository.getByState(state), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getTalukaByPincode(Integer pincode) {
        return new ResponseEntity<>(addressRepository.getByPincode(pincode), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getPincodeByArea(String area) {
        return new ResponseEntity<>(addressRepository.getByArea(area), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getAreaByDistrict(String district) {
        return new ResponseEntity<>(addressRepository.getByDistrict(district), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getDistrictByCity(String city) {
        return new ResponseEntity<>(addressRepository.getByCity(city), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getCityByState(String state, Integer stateId) {
        return new ResponseEntity<>(addressRepository.getByState(state), HttpStatus.OK);
    }

    @Override
    public Object getGeoByStateOrDistrictOrTaluka(Integer state, Integer districtId, Integer talukaId, Boolean extent) {
        if (extent)
            return stateRepository.getGeoByStateAndDistrictAndTaluka(state, districtId, talukaId);
        else
            return stateRepository.getGeoByStateAndDistrictAndTalukaExtent(state, districtId, talukaId);
    }

    @Override
    public Object getGeoByStateOrDistrict(Integer state, Integer districtId,Boolean extent) {
        if (extent)
            return stateRepository.getGeoByStateAndDistrict(state, districtId);
        else
            return stateRepository.getGeoByStateAndDistrictExtent(state, districtId);

    }

    @Override
    public Object getGeoByState(Integer state, Boolean extent) {
        if (extent)
            return stateRepository.getGeoByState(state);
        else
            return stateRepository.getGeoByStateExtent(state);
    }

    @Override
    public ResponseEntity<?> getStateByCountry(String country) {
        return new ResponseEntity<>(addressRepository.getByCountry(country), HttpStatus.OK);
    }
}
