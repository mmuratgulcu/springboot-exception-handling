package com.gulcu.murat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

	/*
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Assert.notNull(personRepository,"App Context sounlu, customerRepository mevcut değil!!!!");
		Assert.isTrue(personRepository.count() == 0,"Tablo boş olmalıydı!!!");
		
		personRepository.save(new Person("Murat","Gülcü"));
		personRepository.save(new Person("Yasin","Akpınar"));
		personRepository.save(new Person("Furkan","Koç"));	
		
		Iterable<Person> persons = personRepository.findAll();
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
	*/

}
