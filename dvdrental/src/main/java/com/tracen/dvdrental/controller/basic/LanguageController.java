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

import com.tracen.dvdrental.entity.Language;
import com.tracen.dvdrental.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {

	@Autowired
	private LanguageService languageService;
	
	@PostMapping("/save")
	public ResponseEntity<Language> saveLanguage(@RequestBody Language language) {
		return ResponseEntity.ok(languageService.saveLanguage(language));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Language> getLanguage(@PathVariable("id") Long languageId) {
		Language language = languageService.getLanguage(languageId);
		if (language == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(language);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Language>> getAllLanguages() {
		List<Language> languages = languageService.getAllLanguages();
		if (languages.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(languages);
	}
}
