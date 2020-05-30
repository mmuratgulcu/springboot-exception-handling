package com.gulcu.murat.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gulcu.murat.dao.PersonRepository;
import com.gulcu.murat.entities.Person;
import com.gulcu.murat.exception.EntityNotFoundException;
import com.gulcu.murat.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	private final PersonRepository personRepository;

	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	

	@Override
	public Optional<Person> findById(Long id) {
		Optional<Person> person = personRepository.findById(id);
		if(person.isEmpty()==true) {
			throw new IllegalArgumentException(id+" numaralı kullanıcı bulunamamaktadır.");
		}
		return person;
	}

	@Override
	public List<Person> findByName(String name) {
		List<Person> persons = personRepository.findByName(name);
		if(persons.isEmpty() == true) {
			throw new EntityNotFoundException(name+" isimli kayıt bulunamamıştır.");
		}
		return persons;
	}

	@Override
	public List<Person> findBySurname(String surname) {
		List<Person> persons = personRepository.findBySurname(surname);
		if(persons.isEmpty() == true) {
			throw new RuntimeException(surname+" isimli kayıt bulunamamıştır.");
		}
		return persons;
	}


	@Override
	public Person savePerson(Person p) {
	
		Person person = personRepository.save(p);
		if(person == null) {
			throw new IllegalArgumentException("Kayıt işlemi gerçekleştirilemedi");
		}
		return person;
	}


	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}
	
	
	
	
}
