package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
