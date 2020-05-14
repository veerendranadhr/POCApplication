package com.bt.core.java;

public interface DefaultMethodInterface {

	
	void someUnImplementedMethod();
	
	 public default void someDefaultMethod() {
		System.out.println(" some operations present in default method");
	}
	
	 static void someStaticMethod() {
			System.out.println(" some operations present in static method");	
		}

	 static int someAdditionMethod(int a,int b) {
		 return a+b;			
		}	 
	 
	 
	 //Directly static blocks are impossible to write in Interfaces
/*	 static {
		 System.out.println("");
	 }
	 */
}
