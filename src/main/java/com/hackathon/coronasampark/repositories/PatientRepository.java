package com.hackathon.coronasampark.repositories;

import com.hackathon.coronasampark.entities.PatientInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends CrudRepository<PatientInfoEntity, UUID> {
}
