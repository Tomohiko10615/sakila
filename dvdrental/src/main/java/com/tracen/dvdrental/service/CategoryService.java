package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Category;
import com.tracen.dvdrental.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category getCategory(Long categoryId) {
		return categoryRepository.findById(categoryId).orElse(null);
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
}
