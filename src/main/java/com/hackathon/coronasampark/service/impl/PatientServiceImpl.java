package com.hackathon.coronasampark.service.impl;

import com.hackathon.coronasampark.dto.request.AddressRequest;
import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.entities.PatientInfoEntity;
import com.hackathon.coronasampark.repositories.AddressRepository;
import com.hackathon.coronasampark.repositories.PatientRepository;
import com.hackathon.coronasampark.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {
    @Inject
    PatientRepository patientRepository;

    @Inject
    AddressRepository addressRepository;

    @Override
    public ResponseEntity<?> getAllPatients(AddressRequest addressRequest) {

        List<AddressEntity> address;
        address = addressRepository.getByTaluka(addressRequest.getTaluka());
        if (Objects.isNull(address)) {
            address = addressRepository.getByPincode(addressRequest.getPincode());
        }
        if (Objects.isNull(address)) {
            address = addressRepository.getByArea(addressRequest.getArea());
        }
        if (Objects.isNull(address)) {
            address = addressRepository.getByCity(addressRequest.getCity());
        }
        if (Objects.isNull(address)) {
            address = addressRepository.getByDistrict(addressRequest.getDistrict());
        }
        if (Objects.isNull(address)) {
            address = addressRepository.getByState(addressRequest.getState());
        }
        if (Objects.isNull(address)) {
            address = addressRepository.getByCountry(addressRequest.getCountry());
        }
        return new ResponseEntity<>(patientRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSinglePatient(Integer uuid) {
        return new ResponseEntity<>(patientRepository.findById(uuid), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> savePatientInfo(PatientInfoEntity patientInfoEntity) {
        return new ResponseEntity<>(patientRepository.save(patientInfoEntity), HttpStatus.OK);
    }
}
