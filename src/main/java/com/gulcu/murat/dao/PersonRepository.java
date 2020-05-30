package com.gulcu.murat.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gulcu.murat.entities.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {

	List<Person> findByName (String name);
	List<Person> findBySurname (String surname);
}
