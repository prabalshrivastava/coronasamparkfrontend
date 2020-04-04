package com.hackathon.coronasampark.service;

import com.hackathon.coronasampark.dto.request.AddressRequest;
import com.hackathon.coronasampark.entities.PatientInfoEntity;
import org.springframework.http.ResponseEntity;

public interface PatientService {
    ResponseEntity<?> getAllPatients(AddressRequest addressRequest);

    ResponseEntity<?> getSinglePatient(Integer uuid);

    ResponseEntity<?> savePatientInfo(PatientInfoEntity patientInfoEntity);
}
