package com.tracen.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracen.dvdrental.entity.City;
import com.tracen.dvdrental.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@PostMapping("/save")
	public ResponseEntity<City> saveCity(@RequestBody City city) {
		return ResponseEntity.ok(cityService.saveCity(city));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<City> getCity(@PathVariable("id") Long cityId) {
		City city = cityService.getCity(cityId);
		if (city == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(city);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<City>> getAllCities() {
		List<City> cities = cityService.getAllCities();
		if (cities.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(cities);
	}

}
