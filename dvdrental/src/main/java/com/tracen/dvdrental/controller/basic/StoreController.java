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

import com.tracen.dvdrental.entity.Store;
import com.tracen.dvdrental.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@PostMapping("/save")
	public ResponseEntity<Store> saveStore(@RequestBody Store store) {
		return ResponseEntity.ok(storeService.saveStore(store));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Store> getStore(@PathVariable("id") Long storeId) {
		Store store = storeService.getStore(storeId);
		if (store == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(store);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Store>> getAllStores() {
		List<Store> stores = storeService.getAllStores();
		if (stores.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(stores);
	}

}
