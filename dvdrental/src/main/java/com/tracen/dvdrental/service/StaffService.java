package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Staff;
import com.tracen.dvdrental.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;

	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	public Staff getStaff(Long staffId) {
		return staffRepository.findById(staffId).orElse(null);
	}

	public List<Staff> getAllStaffs() {
		return staffRepository.findAll();
	}

}
