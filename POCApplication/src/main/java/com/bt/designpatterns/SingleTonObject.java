package com.bt.designpatterns;

public class SingleTonObject {

	
	//create an object of SingleTonObject
	   private static SingleTonObject instance = new SingleTonObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleTonObject(){}

	   //Get the only object available
	   public static SingleTonObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Want to create single object");
	   }
}
