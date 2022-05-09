package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

}
