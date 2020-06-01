package com.bt.designpatterns;

public class InnerClassSingleTon {

	private InnerClassSingleTon()  
	  { 
	    // private constructor 
	  } 
	  
	  // Inner class to provide instance of class 
	  private static class BillPughSingleton 
	  { 
	    private static final InnerClassSingleTon INSTANCE = new InnerClassSingleTon(); 
	  } 
	  
	  public static InnerClassSingleTon getInstance()  
	  { 
	    return BillPughSingleton.INSTANCE; 
	  } 
	  
	   public void showInnerSingleTonMessage(){
		      System.out.println("Want to create showInnerSingleTonMessage object");
		   }
}
