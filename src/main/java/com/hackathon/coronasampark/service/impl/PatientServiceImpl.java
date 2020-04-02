package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.entities.PatientInfoEntity;
import com.hackathon.coronasampark.repositories.PatientRepository;
import com.hackathon.coronasampark.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {
    @Inject
    PatientRepository patientRepository;

    @Override
    public ResponseEntity<?> getAllPatients() {
        return new ResponseEntity<>(patientRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSinglePatient(Integer uuid) {
        return new ResponseEntity<>(patientRepository.findById(uuid),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> savePatientInfo(PatientInfoEntity patientInfoEntity) {
        return new ResponseEntity<>(patientRepository.save(patientInfoEntity),HttpStatus.OK);
    }
}
