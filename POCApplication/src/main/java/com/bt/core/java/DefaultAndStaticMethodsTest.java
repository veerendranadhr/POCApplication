package com.bt.core.java;

public class DefaultAndStaticMethodsTest implements DefaultMethodInterface {

	
	public static void main(String[] args) {
		System.out.println("Main method");
		DefaultMethodInterface.someStaticMethod();
		
		DefaultAndStaticMethodsTest defaultAndStaticMethodsTest=new DefaultAndStaticMethodsTest();
		defaultAndStaticMethodsTest.someDefaultMethod();
		
	//	int a=someAdditionMethod(5,6);
		
		System.out.println();
	}

	public void someDefaultMethod() {
		System.out.println(" Implementing the default method in its implementation class");
	}
	
	@Override
	public void someUnImplementedMethod() {
		
		System.out.println("Directly implementing this someUnImplementedMethod in its implementation class");
	}
}
