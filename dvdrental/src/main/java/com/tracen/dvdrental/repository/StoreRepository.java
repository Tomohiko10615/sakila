package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
