package com.gulcu.murat.api;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulcu.murat.entities.Person;
import com.gulcu.murat.service.impl.PersonServiceImpl;

@RestController
@RequestMapping("/api")
public class PersonController {

	private final PersonServiceImpl personService;

	public PersonController(PersonServiceImpl personService) {
		this.personService = personService;
	}
		
	@GetMapping("/person/all")
	public ResponseEntity<Iterable<Person>> findAll(){
		return ResponseEntity.ok(personService.findAll());
	}
	
	@GetMapping("/person/{id}")
	public ResponseEntity<Optional<Person>> findById(@PathVariable("id") Long id){
		return ResponseEntity.ok(personService.findById(id));
	}
	
	@GetMapping("/person/name")
	public ResponseEntity<List<Person>> findByName(@RequestParam(value = "name") String name){
		return ResponseEntity.ok(personService.findByName(name));
	}
	
	@GetMapping("/person/surname")
	public ResponseEntity<List<Person>> findBySurname(@RequestParam(value = "surname") String surname){
		return ResponseEntity.ok(personService.findBySurname(surname));
	}
	
	@PostMapping("person/save")
	public ResponseEntity<Person> save(@RequestBody Person person){
		return ResponseEntity.ok(personService.savePerson(person));
	}
	
}
