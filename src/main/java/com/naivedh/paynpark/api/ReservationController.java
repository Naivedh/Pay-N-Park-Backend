package com.naivedh.paynpark.api;

import com.naivedh.paynpark.model.Reservation;
import com.naivedh.paynpark.service.ReservationService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/reservation")
public class ReservationController {

  private final ReservationService reservationService;

  @Autowired
  public ReservationController(ReservationService reservationService) {
    this.reservationService = reservationService;
  }

  @GetMapping(value="/id")
  public ResponseEntity<Reservation> getReservation(@RequestParam Integer reservationId){
    Optional<Reservation> reservation = reservationService.getReservationById(reservationId);
    return reservation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  //TODO: CHANGE BY USERID
  @GetMapping
  public ResponseEntity<List<Reservation>> getAllReservations(){
    return ResponseEntity.ok(reservationService.getReservations());
  }
  @PostMapping()
  public ResponseEntity<Reservation> addReservation(@Valid @NotNull @RequestBody Reservation reservation){
    return ResponseEntity.ok(reservationService.addReservation(reservation));
  }

}
