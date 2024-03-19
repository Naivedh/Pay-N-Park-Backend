package com.naivedh.paynpark.api;

import com.naivedh.paynpark.model.Garage;
import com.naivedh.paynpark.service.GarageService;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/v1/garage")
public class GarageController {
  private final GarageService garageService;

  @Autowired
  public GarageController(GarageService garageService) {
    this.garageService = garageService;
  }
  @GetMapping
  public ResponseEntity<List<Garage>> findGarage(){
    return ResponseEntity.ok(garageService.findGarage());
  }

  @GetMapping(value="/garageByZipcode")
  public ResponseEntity<List<Garage>> findGarageByZipcode(@RequestParam String zipcode){
    return ResponseEntity.ok(garageService.findGarageByZipcode(zipcode));
  }


  @PostMapping
  public ResponseEntity<Garage> addGarage(@Valid @NotNull @RequestBody Garage garage) {
    return ResponseEntity.ok(garageService.addGarage(garage));
  }
}
