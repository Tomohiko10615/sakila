package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{

}
