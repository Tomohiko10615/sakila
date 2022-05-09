package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long>{

}
