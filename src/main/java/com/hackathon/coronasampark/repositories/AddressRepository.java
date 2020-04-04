package com.hackathon.coronasampark.repositories;

import com.hackathon.coronasampark.entities.AddressEntity;
import com.hackathon.coronasampark.entities.PeopleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {
    List<AddressEntity> getByTaluka(String taluka);
    List<AddressEntity> getByPincode(Integer pincode);
    List<AddressEntity> getByArea(String area);
    List<AddressEntity> getByDistrict(String district);
    List<AddressEntity> getByCity(String city);
    List<AddressEntity> getByState(String state);
    List<AddressEntity> getByCountry(String country);
}
