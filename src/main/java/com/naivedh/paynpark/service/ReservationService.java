package com.naivedh.paynpark.service;

import com.naivedh.paynpark.model.Reservation;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReservationService {

  Optional<Reservation> getReservationById(UUID reservationId);

  List<Reservation> getReservations();

  Reservation addReservation(Reservation reservation);
}
