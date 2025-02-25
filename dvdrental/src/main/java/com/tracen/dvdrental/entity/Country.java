package com.tracen.dvdrental.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;
	
	@NotEmpty
	private String country;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastUpdate;
}
