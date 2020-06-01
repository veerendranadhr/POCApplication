package com.bt.core.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsTest {

	public static void main(String[] args) {

		List list=new  ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(7);
		
		System.out.println(list);
		
		
		Set<Integer> set = new HashSet<Integer>(); 
        set.add(3); 
        set.add(5); 
        set.add(6); 
        set.add(2); 
        set.add(3); 
        
        
     //   set.addAll(list);
        System.out.println(set);
        
        
        set.removeAll(list);
        
        
        System.out.println(set);
        
        set.addAll(list);
        System.out.println(set);
		
	//	Set set=new Sorted();
        
        
        SortedSet<Integer> sortedset = new TreeSet<>();
        sortedset.addAll(list);
        System.out.println(sortedset);
        
        
        
        
	}

}
