package com.naivedh.paynpark.service;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import java.util.List;
import java.util.UUID;

public interface SpotService {

  List<Spot> getSpotbyGaradeIdAndVehicleType(UUID garageId, VehicleType vehicleType);

  List<Spot> getSpotbyGaradeId(UUID garageId);

  Spot addSpot(Spot spot);

  List<Spot> getSpotbyGaradeIdAndSpotId(UUID garageId, UUID spotId);
}
