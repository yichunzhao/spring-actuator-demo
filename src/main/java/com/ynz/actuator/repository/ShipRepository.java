package com.ynz.actuator.repository;

import com.ynz.actuator.domain.Ship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends CrudRepository<Ship,Integer> {

}
