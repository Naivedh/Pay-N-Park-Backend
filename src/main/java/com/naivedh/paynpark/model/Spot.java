package com.naivedh.paynpark.model;

import com.naivedh.paynpark.enums.VehicleType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "garageSpots")
@Data
@NoArgsConstructor
public class Spot {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID spotId;
  @NonNull
  private UUID garageId;
  @Enumerated(EnumType.STRING)
  private VehicleType vehicleType;
  @Column(name = "occupied", columnDefinition = "boolean default false")
  private boolean occupied;
}
