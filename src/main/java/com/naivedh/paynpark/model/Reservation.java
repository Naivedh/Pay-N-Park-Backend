package com.naivedh.paynpark.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer reservationId;

  @NonNull
  private Integer garageId;

  @NonNull
  private Integer spotId;

  private LocalDateTime startTime;

  private LocalDateTime endTime;
  @Column(name = "paid", columnDefinition = "boolean default false")
  private boolean paid;

}
