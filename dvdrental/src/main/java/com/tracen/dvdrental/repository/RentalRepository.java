package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

}
