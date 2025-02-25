package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
