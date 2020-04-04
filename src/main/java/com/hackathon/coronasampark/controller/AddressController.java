package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.service.AddressService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.Objects;


@RestController
@RequestMapping("/address")
public class AddressController {
    @Inject
    AddressService addressService;





    @GetMapping(value = "/getPincodeAreaCityDistrictStateCountryByTaluka",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPincodeAreaCityDistrictStateCountryByTaluka(@ApiParam(value = "taluka", required = true, defaultValue = "1") @RequestParam(value = "taluka") String taluka){
        return addressService.getPincodeAreaCityDistrictStateCountryByTaluka(taluka);
    }



    @GetMapping(value = "/getAreaCityDistrictStateCountryByPincode",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAreaCityDistrictStateCountryByPincode(@ApiParam(value = "pincode", required = true, defaultValue = "1") @RequestParam(value = "pincode") Integer pincode){
        return addressService.getAreaCityDistrictStateCountryByPincode(pincode);
    }



    @GetMapping(value = "/getCityDistrictStateCountryByArea",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCityDistrictStateCountryByArea(@ApiParam(value = "area", required = true, defaultValue = "1") @RequestParam(value = "area") String area){
        return addressService.getCityDistrictStateCountryByArea(area);
    }



    @GetMapping(value = "/getCityStateCountryByDistrict",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCityStateCountryByDistrict(@ApiParam(value = "district", required = true, defaultValue = "1") @RequestParam(value = "district") String district){
        return addressService.getCityStateCountryByDistrict(district);
    }



    @GetMapping(value = "/getStateCountryByCity",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStateCountryByCity(@ApiParam(value = "city", required = true, defaultValue = "1") @RequestParam(value = "city") String city){
        return addressService.getStateCountryByCity(city);
    }



    @GetMapping(value = "/getCountryByState",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCountryByState(@ApiParam(value = "state", required = true, defaultValue = "1") @RequestParam(value = "state") String state){
        return addressService.getCountryByState(state);
    }



    @GetMapping(value = "/getTalukaByPincode",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTalukaByPincode(@ApiParam(value = "pincode", required = true, defaultValue = "1") @RequestParam(value = "pincode") Integer pincode){
        return addressService.getTalukaByPincode(pincode);
    }



    @GetMapping(value = "/getPincodeByArea",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPincodeByArea(@ApiParam(value = "area", required = true, defaultValue = "1") @RequestParam(value = "area") String area){
        return addressService.getPincodeByArea(area);
    }



    @GetMapping(value = "/getAreaByDistrict",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAreaByDistrict(@ApiParam(value = "district", required = true, defaultValue = "1") @RequestParam(value = "district") String district){
        return addressService.getAreaByDistrict(district);
    }



    @GetMapping(value = "/getDistrictByCity",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getDistrictByCity(@ApiParam(value = "city", required = true, defaultValue = "1") @RequestParam(value = "city") String city){
        return addressService.getDistrictByCity(city);
    }



    @GetMapping(value = "/getCityByState",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCityByState(@ApiParam(value = "state", required = true, defaultValue = "1") @RequestParam(value = "state") String state){
        return addressService.getCityByState(state);
    }



    @GetMapping(value = "/getStateByCountry",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStateByCountry(@ApiParam(value = "country", required = true, defaultValue = "1") @RequestParam(value = "country") String country){
        return addressService.getStateByCountry(country);
    }

    @ResponseBody
    @GetMapping(value = "/getGeoByState")
    public String getGeoByState(@ApiParam(value = "stateId", required = true, defaultValue = "1") @RequestParam(value = "stateId") Integer stateId,@ApiParam(value = "extent", required = true, defaultValue = "true") @RequestParam(value = "extent") Boolean extent){
        Object returnObject = addressService.getGeoByState(stateId, extent);
        return Objects.isNull(returnObject)?"" : returnObject.toString();
    }
}
