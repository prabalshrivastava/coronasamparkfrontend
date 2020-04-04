package com.hackathon.coronasampark.repositories;

import com.hackathon.coronasampark.entities.PatientInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<PatientInfoEntity, Integer> {

}
