package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.entities.PatientInfoEntity;
import org.springframework.http.ResponseEntity;

public interface PatientService {
    ResponseEntity<?> getAllPatients();

    ResponseEntity<?> getSinglePatient(Integer uuid);

    ResponseEntity<?> savePatientInfo(PatientInfoEntity patientInfoEntity);
}
