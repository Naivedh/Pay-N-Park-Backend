package com.naivedh.paynpark.service;

import com.naivedh.paynpark.model.Reservation;
import com.naivedh.paynpark.model.Spot;
import com.naivedh.paynpark.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

  private final ReservationRepository reservationRepository;
  private final SpotService spotService;

  @Autowired
  public ReservationService(ReservationRepository reservationRepository,
      SpotService spotService) {
    this.reservationRepository = reservationRepository;
    this.spotService = spotService;
  }

  public Optional<Reservation> getReservationById(Integer reservationId){
    return reservationRepository.findById(reservationId);
  }

  public List<Reservation> getReservations(){
    return (List<Reservation>) reservationRepository.findAll();
  }

  public  Reservation addReservation(Reservation reservation){
    List<Spot> spots = spotService.getSpotbyGaradeIdAndSpotId(reservation.getGarageId(), reservation.getSpotId());
    Spot reserveSpot = spots.get(0);
    reserveSpot.setOccupied(true);
    spotService.addSpot(reserveSpot);
    return reservationRepository.save(reservation);
  }
}
