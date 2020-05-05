package com.bt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bt.controller.rest.PersonController;
import com.bt.pojo.Item;
import com.bt.pojo.Person;
import com.bt.repository.PersonRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonTest {

	    private MockMvc mvc;
	    
	    @Autowired
	    private WebApplicationContext context;
	 
	    @Before
	 	public void setup() {
	 		mvc=MockMvcBuilders.webAppContextSetup(context).build();
	 	}
	    
	    private ObjectMapper mapper=new ObjectMapper();
	 /*	
	    @MockBean
	    private PersonRepository repository;
	  */  
	    
	    @Test
	    public void givenPerson()
	      throws Exception {
	         	        
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
	        
	        Set<Person> list = new HashSet<Person>();
	        Person perOne = new Person(1, "John", 20, listOfItems);
	        Person perTwo = new Person(2, "Alex", 22,null);
	         
	        list.add(perOne);
	        list.add(perTwo);
	         
//	        Mockito.when(repository.findAll()).thenReturn(list);
	        	     
	        RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/persons").accept(MediaType.APPLICATION_JSON);
	        
	        MvcResult mvcResult=mvc.perform(requestBuilder).andReturn();
	        
	        System.out.println(mvcResult.toString()+"***************************");
	        String data=mvcResult.getResponse().getContentAsString();
	       List<LinkedHashMap<String, Object>> listOb= mapper.readValue(data, List.class);
	        System.out.println(listOb.get(0).get("name"));
	        System.out.println(listOb.get(1).get("name"));
	        System.out.println(listOb.get(2).get("name"));
	     
	        
	        Assert.assertEquals("Raja", listOb.get(0).get("name"));
	//        given(repository.save(alex).willReturn(allEmployees);
	/*     
	        mvc.perform(get("/persons")
	          .contentType(MediaType.APPLICATION_JSON))
	          .andExpect(status().isOk())
	          .andExpect(jsonPath("$", hasSize(1)))
	          .andExpect(jsonPath("$[0].name", is(alex.getName())));
	          */
	    }	
	 
	    
	    @Test
	    public void given() throws Exception {
	        	     
	        RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/onlyPerson/10/id").accept(MediaType.APPLICATION_JSON);
	        
	        MvcResult mvcResult=mvc.perform(requestBuilder).andReturn();
	        
	        System.out.println(mvcResult.toString()+"***************************");
	        String data=mvcResult.getResponse().getContentAsString();
	       List<LinkedHashMap<String, Object>> listOb= mapper.readValue(data, List.class);
	        System.out.println(listOb.get(0).get("name"));
	        
	        System.out.println(listOb.get(0).get("id"));
	        System.out.println(listOb.get(0).get("age"));
	        System.out.println(listOb.get(0).get("items"));
	     
	        
	        Assert.assertEquals("Raja", listOb.get(0).get("name"));
	  //      Assert.assertEquals(10, listOb.get(0).get("id"));
	  //      Assert.assertEquals(50, listOb.get(0).get("age"));

	        

	    }	
	    
	    
	    
	
}
