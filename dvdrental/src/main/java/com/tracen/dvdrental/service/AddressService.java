package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Address;
import com.tracen.dvdrental.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	public Address getAddress(Long addressId) {
		return addressRepository.findById(addressId).orElse(null);
	}

	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}
	
	
}
