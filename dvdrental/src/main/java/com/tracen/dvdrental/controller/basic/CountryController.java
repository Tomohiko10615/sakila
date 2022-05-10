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

import com.tracen.dvdrental.entity.Country;
import com.tracen.dvdrental.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@PostMapping("/save")
	public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
		return ResponseEntity.ok(countryService.saveCountry(country));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> getCountry(@PathVariable("id") Long countryId) {
		Country country = countryService.getCountry(countryId);
		if (country == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(country);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> countries = countryService.getAllCountries();
		if (countries.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(countries);
	}
	
}
