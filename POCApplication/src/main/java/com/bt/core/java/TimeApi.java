package com.bt.core.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeApi {

	public static void main(String[] args) {

		
		//Time api doesnt have a Thread safe environment so developers have to deal with concurrency issue while using date.
		//The new date-time API is immutable and does not have setter methods.
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		  System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date = currentTime.toLocalDate();
	      System.out.println("date1: " + date);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
	      

	      System.out.println("Month "+month);
	      System.out.println("day "+day);
	      System.out.println("seconds "+seconds);
			
	      
	      ZonedDateTime zoneddate = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
	      System.out.println("date1: " + zoneddate);
			
	      ZoneId id = ZoneId.of("Europe/Paris");
	      System.out.println("ZoneId: " + id);
			
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
	}

}
