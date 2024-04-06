package com.naivedh.paynpark.service.Impl;

import com.naivedh.paynpark.model.Garage;
import com.naivedh.paynpark.repository.GarageRepository;
import com.naivedh.paynpark.service.GarageService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class GarageServiceImpl implements GarageService {
  private final GarageRepository garageRepository;

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
