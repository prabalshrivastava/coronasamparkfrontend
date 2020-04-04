package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.dto.request.AddressRequest;
import com.hackathon.coronasampark.entities.PatientInfoEntity;
import com.hackathon.coronasampark.service.PatientService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;


@RestController
@RequestMapping("/patient")
public class PatientController {
    @Inject
    PatientService patientService;
    //list of patients in pincode state city district
    //list of contact in pincode state city district
    //save contact -
    //tagging,uploads photo,(people contact address)
    //contact to contact relation(tagging himself to a contact)
    //order should be according to the near by person
    //tree structure will not have person on top of harry
    //LIST OF ALL CITIES TALUKAS


//    ind_adm0 - only india
//    ind_adm1 - only state
//    ind_adm2 - state and district
//    ind_adm3 - state and district and area


//    gid : geometriyid
//    id_0 : numerical country code
//    iso : country code
//    name_0 : country name
//    id_1 : state id
//    name_1 : state name
//    id_2 : city or district id
//    name_2 : city or district name
//    id_3 : area id
//    name_3 : area name


    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> filter(
            @ApiParam(value = "taluka", example = "") @RequestParam(value = "taluka") String taluka,
            @ApiParam(value = "pincode", example = "482001") @RequestParam(value = "pincode") Integer pincode,
            @ApiParam(value = "area", example = "Supatal") @RequestParam(value = "area") String area,
            @ApiParam(value = "district", example = "Jabalpur") @RequestParam(value = "district") String district,
            @ApiParam(value = "district", example = "Jabalpur") @RequestParam(value = "city") String city,
            @ApiParam(value = "state", example = "Madhya Pradesh") @RequestParam(value = "state") String state,
            @ApiParam(value = "country", example = "India") @RequestParam(value = "country") String country
    ) {
        AddressRequest addressRequest = new AddressRequest(taluka,pincode,area,district,city,state,country);
        return patientService.getAllPatients(addressRequest);
    }


    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPatient(@ApiParam(value = "patientId is used to identify the patient", required = true, defaultValue = "1")
                                        @PathVariable(value = "id") final Integer patientId) {
        return patientService.getSinglePatient(patientId);
    }

    @PostMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> savePatientInfo(@RequestBody @Valid PatientInfoEntity patientInfoEntity) {
        return patientService.savePatientInfo(patientInfoEntity);
    }

}
