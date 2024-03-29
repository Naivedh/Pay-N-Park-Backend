package com.naivedh.paynpark.service;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import com.naivedh.paynpark.repository.SpotRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotService {
  private final SpotRepository spotRepository;
  @Autowired
  public SpotService(SpotRepository spotRepository) {
    this.spotRepository = spotRepository;
  }

  public List<Spot> getSpotbyGaradeId (Integer garageId){
    return spotRepository.findSpotByGarageIdAndOccupied(garageId, false);
  }

  public List<Spot> getSpotbyGaradeIdAndVehicleType (Integer garageId, VehicleType vehicleType ){
    return spotRepository.findSpotByGarageIdAndVehicleTypeAndOccupied(garageId, vehicleType, false);
  }

  public List<Spot> getSpotbyGaradeIdAndSpotId (Integer garageId, Integer spotId ){
    return spotRepository.findSpotBySpotIdAndGarageIdAndOccupied(spotId, garageId, false);
  }

  public Spot addSpot(Spot spot){
    return spotRepository.save(spot);
  }

}
