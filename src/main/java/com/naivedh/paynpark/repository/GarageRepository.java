package com.naivedh.paynpark.repository;

import com.naivedh.paynpark.model.Garage;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Garage, UUID> {

  List<Garage> findGarageByZipcode(String zipcode);

}
