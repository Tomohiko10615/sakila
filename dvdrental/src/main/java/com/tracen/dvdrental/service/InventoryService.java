package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Inventory;
import com.tracen.dvdrental.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;

	public Inventory saveInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}

	public Inventory getInventory(Long inventoryId) {
		return inventoryRepository.findById(inventoryId).orElse(null);
	}

	public List<Inventory> getAllInventories() {
		return inventoryRepository.findAll();
	}

}
