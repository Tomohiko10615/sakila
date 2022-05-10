package com.tracen.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracen.dvdrental.entity.Category;
import com.tracen.dvdrental.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/save")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		return ResponseEntity.ok(categoryService.saveCategory(category));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Long categoryId) {
		Category category = categoryService.getCategory(categoryId);
		if (category == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(category);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.getAllCategories();
		if (categories.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(categories);
	}
	
}
