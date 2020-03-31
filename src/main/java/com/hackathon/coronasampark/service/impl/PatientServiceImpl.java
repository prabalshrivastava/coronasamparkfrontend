package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.repositories.PatientRepository;
import com.hackathon.coronasampark.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {
    @Inject
    PatientRepository patientRepository;
}
