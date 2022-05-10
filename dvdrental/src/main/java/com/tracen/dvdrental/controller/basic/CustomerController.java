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

import com.tracen.dvdrental.entity.Customer;
import com.tracen.dvdrental.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.saveCustomer(customer));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long customerId) {
		Customer customer = customerService.getCustomer(customerId);
		if (customer == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(customer);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		if (customers.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(customers);
	}
}
