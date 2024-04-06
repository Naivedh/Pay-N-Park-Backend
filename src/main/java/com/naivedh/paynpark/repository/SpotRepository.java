package com.naivedh.paynpark.repository;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotRepository extends CrudRepository<Spot, UUID> {

  List<Spot> findSpotByGarageIdAndOccupied(UUID garageId, boolean occupied);
  List<Spot> findSpotByGarageIdAndVehicleTypeAndOccupied(UUID garageId, VehicleType vehicleType, boolean occupied);

  List<Spot> findSpotBySpotIdAndGarageIdAndOccupied(UUID spotId, UUID garageId, boolean occupied);

}
