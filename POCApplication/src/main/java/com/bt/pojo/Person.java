package com.bt.pojo;

import java.util.List;



public class Person {

	
	private int id;
	private String name;
	private int age;
	private List<Item> items;
	
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public Person(int id, String name, int age, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
	
}
