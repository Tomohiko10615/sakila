package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Film;
import com.tracen.dvdrental.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;

	public Film saveFilm(Film film) {
		return filmRepository.save(film);
	}

	public Film getFilm(Long filmId) {
		return filmRepository.findById(filmId).orElse(null);
	}

	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}
	
	
}
