package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.City;
import com.tracen.dvdrental.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public City saveCity(City city) {
		return cityRepository.save(city);
	}

	public City getCity(Long cityId) {
		return cityRepository.findById(cityId).orElse(null);
	}

	public List<City> getAllCities() {
		return cityRepository.findAll();
	}
	
}
