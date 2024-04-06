package com.naivedh.paynpark.service.Impl;

import com.naivedh.paynpark.model.Reservation;
import com.naivedh.paynpark.model.Spot;
import com.naivedh.paynpark.repository.ReservationRepository;
import com.naivedh.paynpark.service.ReservationService;
import com.naivedh.paynpark.service.SpotService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

  private final ReservationRepository reservationRepository;
  private final SpotService spotService;

  @Override
  public Optional<Reservation> getReservationById(UUID reservationId) {
    return reservationRepository.findById(reservationId);
  }

  public List<Reservation> getReservations(){
    return (List<Reservation>) reservationRepository.findAll();
  }

  @Override
  public  Reservation addReservation(Reservation reservation){
    List<Spot> spots = spotService.getSpotbyGaradeIdAndSpotId(reservation.getGarageId(), reservation.getSpotId());
    Spot reserveSpot = spots.get(0);
    reserveSpot.setOccupied(true);
    spotService.addSpot(reserveSpot);
    return reservationRepository.save(reservation);
  }
}
