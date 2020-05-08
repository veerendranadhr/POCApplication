package com.bt.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.pojo.Person;
import com.bt.repository.PersonRepository;
import com.bt.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	
	 @Autowired
	  private PersonRepository repository;

	
	public Set<Person> findAll() {
		
	    return repository.findAll();
	}


	public Person findByPersonId(int id) {

		return repository.findByPersonId(id);
	}


	@Override
	public Set<Person> save(Person newEmployee) {
		return repository.save(newEmployee);
	}


	@Override
	public Set<Person> saveUpdatePerson(Person person) {

		return repository.saveUpdatePerson(person);
	}

}
