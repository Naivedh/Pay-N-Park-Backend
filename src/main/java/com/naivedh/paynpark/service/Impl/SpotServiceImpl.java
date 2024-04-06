package com.naivedh.paynpark.service.Impl;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import com.naivedh.paynpark.repository.SpotRepository;
import com.naivedh.paynpark.service.SpotService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotServiceImpl implements SpotService {
  private final SpotRepository spotRepository;

  @Override
  public List<Spot> getSpotbyGaradeId (UUID garageId){
    return spotRepository.findSpotByGarageIdAndOccupied(garageId, false);
  }

  @Override
  public Spot addSpot(Spot spot) {
    return spotRepository.save(spot);
  }

  @Override
  public List<Spot> getSpotbyGaradeIdAndVehicleType (UUID garageId, VehicleType vehicleType ){
    return spotRepository.findSpotByGarageIdAndVehicleTypeAndOccupied(garageId, vehicleType, false);
  }

  @Override
  public List<Spot> getSpotbyGaradeIdAndSpotId (UUID garageId, UUID spotId ){
    return spotRepository.findSpotBySpotIdAndGarageIdAndOccupied(spotId, garageId, false);
  }

}
