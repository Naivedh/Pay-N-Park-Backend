package com.naivedh.paynpark.api;

import com.naivedh.paynpark.enums.VehicleType;
import com.naivedh.paynpark.model.Spot;
import com.naivedh.paynpark.service.SpotService;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/spots")
public class SpotController {
  private final SpotService spotService;
  @Autowired
  public SpotController(SpotService spotService) {
    this.spotService = spotService;
  }

  @GetMapping
  public ResponseEntity<List<Spot>> getSpotbyGaradeId(@RequestParam Integer garageId){
    return ResponseEntity.ok(spotService.getSpotbyGaradeId(garageId));
  }

  @GetMapping(value = "/vehicle")
  public ResponseEntity<List<Spot>> getSpotbyGarageIdAndVehicleType(@RequestParam Integer garageId, VehicleType vehicleType){
    return ResponseEntity.ok(spotService.getSpotbyGaradeIdAndVehicleType(garageId, vehicleType));
  }

  @PostMapping
  public ResponseEntity<Spot> addSpot(@Valid @NotNull @RequestBody Spot spot){
    return ResponseEntity.ok(spotService.addSpot(spot));
  }

}
