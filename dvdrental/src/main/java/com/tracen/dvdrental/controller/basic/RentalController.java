package com.tracen.dvdrental.controller.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracen.dvdrental.entity.Rental;
import com.tracen.dvdrental.service.RentalService;

@RestController
@RequestMapping("/rental")
public class RentalController {
	
	@Autowired
	private RentalService rentalService;
	
	@PostMapping("/save")
	public ResponseEntity<Rental> saveRental(@RequestBody Rental rental) {
		return ResponseEntity.ok(rentalService.saveRental(rental));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rental> getRental(@PathVariable("id") Long rentalId) {
		Rental rental = rentalService.getRental(rentalId);
		if (rental == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(rental);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Rental>> getAllRentals() {
		List<Rental> rentals = rentalService.getAllRentals();
		if (rentals.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(rentals);
	}

}
