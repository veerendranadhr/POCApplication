package com.bt.controller.rest;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bt.pojo.Person;
import com.bt.repository.PersonRepository;

@RestController
public class PersonController {


	  @Autowired
	  private PersonRepository repository;

	
	  @GetMapping("/persons")
	  public Set<Person> all() {
	    return repository.findAll();
	  }
	  
	  @GetMapping("/onlyPerson/{id}/id")
	  public Person returnByPersonId(@PathVariable int id) {
		  System.out.println("id value  : "+ id);
	    return repository.findByPersonId(id);
	  }
	  
	  @PostMapping("/person")
	  public Set<Person> newEmployee(@RequestBody Person newEmployee) {
		 
	    return repository.save(newEmployee);
	  }
	
	  @PutMapping(value = "/updatePerson", consumes = "application/json", produces = "application/json")
	  public Set<Person> updatePerson(@RequestBody Person person, HttpServletResponse response) {
		 
			    response.setHeader("Location", ServletUriComponentsBuilder.fromCurrentContextPath()
			      .path("/findPerson/" + person.getId()).toUriString());
			     
			    return repository.saveUpdatePerson(person);
			}
	 
		 
	  @DeleteMapping(value = "/deletePerson/{id}/id")
	  public int deletePerson(@PathVariable int id) {
			   System.out.println("*********************** delete operation "+ id);
				    return repository.deletePersonById(id);
		}
	 
	 
}
