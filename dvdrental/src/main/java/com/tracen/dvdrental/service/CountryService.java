package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Country;
import com.tracen.dvdrental.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;

	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}

	public Country getCountry(Long countryId) {
		return countryRepository.findById(countryId).orElse(null);
	}

	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	

}
