package com.bt;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bt.pojo.Item;
import com.bt.pojo.Person;
import com.bt.repository.PersonRepository;
import com.bt.service.PersonService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PersonUnitTest {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	PersonService personService;
	
	
    private PersonRepository repository;

	
    @Autowired
    private WebApplicationContext context;
	
	@Before
 	public void setup() {
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
 	}
	
	@Test
	public void contextLoads() throws Exception {
		
		
		Set<Person> list= new LinkedHashSet();

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
		
		
		Mockito.when(personService.findAll()).thenReturn(list);
		
		MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/persons")
				.accept(MediaType.APPLICATION_JSON)
				)
		.andReturn();
		
		System.out.println(mvcResult);
		System.out.println(mvcResult.toString());
		
		Mockito.verify(personService).findAll();
	}
}
