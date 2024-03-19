package com.naivedh.paynpark.repository;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SpotRepository extends CrudRepository<Spot, Integer> {

  List<Spot> findSpotByGarageIdAndOccupied(Integer garageId, boolean occupied);
  List<Spot> findSpotByGarageIdAndVehicleTypeAndOccupied(Integer garageId, VehicleType vehicleType, boolean occupied);

  List<Spot> findSpotBySpotIdAndGarageIdAndOccupied(Integer spotId, Integer garageId, boolean occupied);

}
