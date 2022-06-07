package com.example.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String firstname;
		
	@Column(nullable = false)
	private String lastname;
		
	@Column(nullable = false)
	private String street;
		
	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String zipcode;
		
	@Column(nullable = false)
	private String country;
		
		
}
