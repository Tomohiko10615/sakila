package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Store;
import com.tracen.dvdrental.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;

	public Store saveStore(Store store) {
		return storeRepository.save(store);
	}

	public Store getStore(Long storeId) {
		return storeRepository.findById(storeId).orElse(null);
	}

	public List<Store> getAllStores() {
		return storeRepository.findAll();
	}
}
