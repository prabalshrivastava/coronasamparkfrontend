package com.hackathon.coronasampark.repositories;

import com.hackathon.coronasampark.entities.PatientInfoEntity;
import com.hackathon.coronasampark.entities.PeopleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<PeopleEntity, Integer> {
}
