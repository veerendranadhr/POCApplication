package com.bt.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.bt.pojo.Item;
import com.bt.pojo.Person;

@Repository
public class PersonRepository {

	 Set<Person> list= new LinkedHashSet();
	
	private  Set<Person> allData(){
		
		Person person= new Person();
		person.setId(10);
		person.setName("Raja");
		person.setAge(50);
		
		ArrayList listOfItems=new ArrayList<Item>();
		Item item=new Item();
		item.setId(5555);
		item.setItemName("car");
		item.setItemPrice(600000);
		listOfItems.add(item);
		
		Item item2=new Item();
		item2.setId(5556);
		item2.setItemName("watch");
		item2.setItemPrice(6000);
		listOfItems.add(item2);
		
		person.setItems(listOfItems);
		list.add(person);
		
		Person person2= new Person();
		person2.setId(13);
		person2.setName("Ram");
		person2.setAge(53);
		

		ArrayList listOfItemsperson2=new ArrayList<Item>();
		Item itemperson2=new Item();
		itemperson2.setId(5555);
		itemperson2.setItemName("car");
		itemperson2.setItemPrice(600000);
		listOfItemsperson2.add(itemperson2);
		person2.setItems(listOfItemsperson2);
		
		list.add(person2);
		
		Person person3= new Person();
		person3.setId(15);
		person3.setName("vijay");
		person3.setAge(66);
		list.add(person3);
		return list;
	}
	
	public Set<Person> findAll() {

		return allData().stream().sorted(Comparator.comparingInt(Person::getId)).collect(Collectors.toSet());
	}

	public Set<Person> save(Person newPerson) {
		list.add(newPerson);
		return findAll();
	}

	public Set<Person> saveUpdatePerson(Person person) {
		list.remove(person);
		
		
		
		list.add(person);

	/*	
		for(Person per:list) {
			if(per.getId()==person.getId()) {
				per=person;
			}
		}
		*/
		return findAll();
	}

}
