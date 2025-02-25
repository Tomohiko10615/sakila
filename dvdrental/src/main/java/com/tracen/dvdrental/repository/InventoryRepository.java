package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
