package com.hackathon.coronasampark.controller;

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

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllPatients() {
        return patientService.getAllPatients();
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
