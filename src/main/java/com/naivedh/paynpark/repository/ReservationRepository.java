package com.naivedh.paynpark.repository;

import com.naivedh.paynpark.model.Reservation;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, UUID> {

}
