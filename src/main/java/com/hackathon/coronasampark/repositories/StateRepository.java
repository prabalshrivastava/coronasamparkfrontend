package com.hackathon.coronasampark.repositories;

import com.hackathon.coronasampark.entities.PeopleEntity;
import com.hackathon.coronasampark.entities.StateEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends CrudRepository<StateEntity, Integer> {
    @Query(nativeQuery = true,value = "select ST_AsGeoJSON(t.geom) from corona_sampark.ind_adm1 t where id_1=:state")
    String getGeoByState(@Param("state") Integer state);

    @Query(nativeQuery = true,value = "select Cast(ST_Extent(t.geom) as varchar) as extent from corona_sampark.ind_adm1 t where id_1=:state")
    Object getGeoByStateExtent(@Param("state") Integer state);
}
