package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Actor;
import com.tracen.dvdrental.repository.ActorRepository;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;

	public Actor saveActor(Actor actor) {
		return actorRepository.save(actor);
	}

	public Actor getActor(Long actorId) {
		return actorRepository.findById(actorId).orElse(null);
	}

	public List<Actor> getAllActors() {
		return actorRepository.findAll();
	}
	
	
}
