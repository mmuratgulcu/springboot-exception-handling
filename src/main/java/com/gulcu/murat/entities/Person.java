package com.gulcu.murat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Person {

	@Id
	@SequenceGenerator(name = "person_gen",sequenceName = "person_seq",allocationSize = 1)
	@GeneratedValue(generator = "person_gen",strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String surname;

	public Person() {
		
	}

	public Person(String name, String surname) {
		this(null,name,surname);
	}
	
	public Person(Long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	
}
