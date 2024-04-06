package com.naivedh.paynpark.service;

import com.naivedh.paynpark.model.Garage;
import com.naivedh.paynpark.repository.GarageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class GarageService {
  private final GarageRepository garageRepository;

  @Autowired
  public GarageService(GarageRepository garageRepository) {
    this.garageRepository = garageRepository;
  }
  public List<Garage> findGarage(){
    return (List<Garage>) garageRepository.findAll();
  }
  public List<Garage> findGarageByZipcode(@RequestParam String zipcode){
    return garageRepository.findGarageByZipcode(zipcode);
  }
  public Garage addGarage(@RequestBody Garage garage) {
    return garageRepository.save(garage);
  }

}
