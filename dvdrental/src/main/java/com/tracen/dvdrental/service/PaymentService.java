package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Payment;
import com.tracen.dvdrental.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public Payment savePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public Payment getPayment(Long paymentId) {
		return paymentRepository.findById(paymentId).orElse(null);
	}

	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}
}
