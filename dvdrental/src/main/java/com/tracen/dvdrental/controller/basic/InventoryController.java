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

import com.tracen.dvdrental.entity.Inventory;
import com.tracen.dvdrental.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/save")
	public ResponseEntity<Inventory> saveInventory(@RequestBody Inventory inventory) {
		return ResponseEntity.ok(inventoryService.saveInventory(inventory));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Inventory> getInventory(@PathVariable("id") Long inventoryId) {
		Inventory inventory = inventoryService.getInventory(inventoryId);
		if (inventory == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(inventory);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Inventory>> getAllInventories() {
		List<Inventory> inventories = inventoryService.getAllInventories();
		if (inventories.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(inventories);
	}

}
