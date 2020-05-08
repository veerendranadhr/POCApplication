package com.bt;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.bt.pojo.Person;

@SpringBootTest(classes = PocApplication.class)
public class IntegrationTestPerson {

	@LocalServerPort
    private int port;
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	
    @Test
    public void testAllPersons(){
    	System.out.println("working *****************************************");
    	
    	Person perosn=restTemplate
        .getForObject("http://localhost:" + 8080 + "/persons/10/id", Person.class);
    	
    	System.out.println(perosn.getName());
    	System.out.println(perosn.getId());
    	System.out.println(perosn.getAge());
    	System.out.println("***********asfaf");
    	
        Assert.assertEquals(
                this.restTemplate
                    .getForObject("http://localhost:" + 8080 + "/persons/10/id", Person.class).getId(),10);
    }
	
}
