package com.naivedh.paynpark.service;

import com.naivedh.paynpark.model.Garage;
import java.util.List;

public interface GarageService {

  List<Garage> findGarage();

  List<Garage> findGarageByZipcode(String zipcode);

  Garage addGarage(Garage garage);
}
