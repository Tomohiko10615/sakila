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

import com.tracen.dvdrental.entity.Address;
import com.tracen.dvdrental.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping("/save")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
		return ResponseEntity.ok(addressService.saveAddress(address));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable("id") Long addressId) {
		Address address = addressService.getAddress(addressId);
		if (address == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(address);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Address>> getAllAdresses() {
		List<Address> addresses = addressService.getAllAddresses();
		if (addresses.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(addresses);
	}
	
}
