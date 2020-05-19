package com.bt.core.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(126);
		list.add(123);
		list.add(1);	
		list.add(2);
		list.add(17);
		list.add(11);
		list.add(16);
		System.out.println("Printing all The list");
		System.out.println(list.toString());
		System.out.println();
		
		
		System.out.println("Foreach printing");
		list.stream().forEach(System.out::println);
		System.out.println();

		Consumer<Integer> consumer=i->{
			System.out.println("Square of the values of the "+i+" is "+i*i);
		};
		
		list.stream().forEach(consumer);
		System.out.println();
		
		ArrayList<Integer> evenList=(ArrayList<Integer>) list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Printing only even numbers in list by using Filter() which takes only predicate as argument ");
		System.out.println(evenList);
		System.out.println();
		
		int count=(int) list.stream().filter(i->i%2==0).count();
		System.out.println(count);
		
		
		ArrayList<Integer> greaterThan10List=(ArrayList<Integer>) list.stream().filter(i->i>10).collect(Collectors.toList());
		
		System.out.println("Printing only values greater than 10 in the list by using Filter() which takes only predicate as argument");
		System.out.println(greaterThan10List);
		System.out.println();
		
		
		ArrayList<Integer> addedPlus5List=(ArrayList<Integer>) list.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println("Adding +5 value to every value in the list by using map() method which takes function as argument");
		System.out.println(addedPlus5List);
		//System.out.println(listStream.toString());
		System.out.println();
		
		ArrayList<Integer> sortAscList=(ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(" Sorting the list by using sorted() method");
		System.out.println(sortAscList);
		System.out.println();
		
		
		ArrayList<Integer> sortDecendingListYTerinary=(ArrayList<Integer>) list.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		
		System.out.println(" Sorting the list by using sorted() method using Terinary Operators");
		System.out.println(sortDecendingListYTerinary);
		System.out.println();
		
		ArrayList<Integer> sortDecendingList=(ArrayList<Integer>) list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println(" Sorting the list by using sorted() method using CompareTo method");
		System.out.println(sortDecendingList);
		System.out.println();
		
		ArrayList<Integer> sortDecendingListExchange=(ArrayList<Integer>) list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println(" Sorting the list by using sorted() method using CompareTo method");
		System.out.println(sortDecendingList);
		System.out.println();
		
		System.out.println("Get Min val from List of integers");
		int minVal=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minVal);
		System.out.println();
		
		System.out.println("Get MaX val from List of integers");
		int maxVal=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxVal);
		System.out.println();
		
		
		
		
		ArrayList<String> students=new ArrayList();
		students.add("Adi");
		students.add("Ramu");
		students.add("Abhishek");
		students.add("Kavya");
		students.add("Madhu");
		students.add("Veena");
		
		System.out.println("Actual Students list in added in inserted format");
		System.out.println(students.toString());
		System.out.println();
		
		System.out.println("Sorted in natural sorting order");
		ArrayList<String> studentNaturalSort=(ArrayList<String>) students.stream().sorted().collect(Collectors.toList());
		System.out.println(studentNaturalSort);
		System.out.println();
		
		
		System.out.println("Sorted in overown reverse sorting method");
		ArrayList<String> studentSortIn =(ArrayList<String>) students.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(studentSortIn);
		System.out.println();

		
		System.out.println("Using comparator compare mathod overriding string length based sorting");
		Comparator<String> comparator=(s1,s2)->{
			int s1length=s1.length();
			int s2length=s2.length();
			if(s1length<s2length)return -1;
			else if(s1length>s2length) return +1;
			else return s1.compareTo(s2);
		};
		
		ArrayList<String> studentSortList=(ArrayList<String>) students.stream().sorted(comparator).collect(Collectors.toList());
		
		System.out.println(studentSortList+"   ***");
				
		ArrayList<String> studentSo=(ArrayList<String>) students.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(studentSortList);
		studentSortList.stream().forEach(System.out::println);
		System.out.println();
		

		System.out.println("Changing the Collection data into Array data and printing using Lambda Expressions");
		Integer[] intArray=list.stream().toArray(Integer[]::new);
		Stream.of(intArray).forEach(System.out::println);

	}

}
