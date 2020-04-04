package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.entities.AddressEntity;
import org.springframework.http.ResponseEntity;

public interface AddressService {
    ResponseEntity<?> getAllAddress();
    ResponseEntity<?> getSingleAddress(Integer uuid);
    ResponseEntity<?> saveAddress(AddressEntity peopleEntity);
    ResponseEntity<?> getPincodeAreaCityDistrictStateCountryByTaluka(String taluka);
    ResponseEntity<?> getAreaCityDistrictStateCountryByPincode(Integer pincode);
    ResponseEntity<?> getCityDistrictStateCountryByArea(String area);
    ResponseEntity<?> getCityStateCountryByDistrict(String district);
    ResponseEntity<?> getStateCountryByCity(String city);
    ResponseEntity<?> getCountryByState(String state);
    ResponseEntity<?> getTalukaByPincode(Integer pincode);
    ResponseEntity<?> getPincodeByArea(String area);
    ResponseEntity<?> getAreaByDistrict(String district);
    ResponseEntity<?> getDistrictByCity(String city);
    ResponseEntity<?> getCityByState(String state);
    ResponseEntity<?> getStateByCountry(String country);
    Object getGeoByState(Integer state, Boolean extent);
}
