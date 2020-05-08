package com.bt.service;

import java.util.Set;

import com.bt.pojo.Person;

public interface PersonService {

	
	public Set<Person> findAll();
	
	public Person findByPersonId(int id);

	public Set<Person> save(Person newEmployee);

	public Set<Person> saveUpdatePerson(Person person);
	
}
