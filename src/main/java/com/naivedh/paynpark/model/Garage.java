package com.naivedh.paynpark.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "garage")
@Data
@NoArgsConstructor
public class Garage {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID garageId;

  @NonNull
  private String zipcode;

  private Float compactRate;

  private Float regularRate;

  private Float largeRate;

  //TODO: Address or location
}
