package com.gulcu.murat.service;

import java.util.List;
import java.util.Optional;

import com.gulcu.murat.entities.Person;

public interface PersonService {

	Optional<Person> findById(Long id);
	List<Person> findByName(String name);
	List<Person> findBySurname (String surname);
	Person savePerson(Person person);
	Iterable<Person> findAll();
	
}
