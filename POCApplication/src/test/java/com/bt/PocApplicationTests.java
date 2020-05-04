package com.bt;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bt.pojo.Item;
import com.bt.pojo.Person;

@SpringBootTest
class PocApplicationTests {

	@Test
	void contextLoads() {
	}
	/*
	@Test
	public void testAddPersonWithoutHeader_success() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8080+"/person/";
	    URI uri = new URI(baseUrl);
	
			Person person= new Person();
			person.setId(444);
			person.setName("TestIng_Raja");
			person.setAge(50);
			
			ArrayList listOfItems=new ArrayList<Item>();
			Item item=new Item();
			item.setId(55);
			item.setItemName("Car");
			item.setItemPrice(600000);
			listOfItems.add(item);
			
			Item item2=new Item();
			item2.setId(5556);
			item2.setItemName("watch");
			item2.setItemPrice(6000);
			listOfItems.add(item2);
			
			person.setItems(listOfItems);
	    
	 
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, person, String.class);
	     
	    
	    System.out.println("test value check");
	    //Verify request succeed
	 //   Assert.
	}
	*/
}
