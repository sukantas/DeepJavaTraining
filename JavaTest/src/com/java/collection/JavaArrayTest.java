package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaArrayTest {
	
	public static void main(String[] args) {
		
		List<Integer>  list= new ArrayList<Integer>();
	
		
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(2);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(65);
		list.add(44);
		list.add(445);
		list.add(1);
		System.out.println(list);
		
	    Collections.sort(list);
	    
	    System.err.println(list);
	    
	  
	    
	    for(int a :list) {
	    	System.out.println("my elements->"+a);
	    }
	    
	  
		
	    for(int i = 0; i<list.size(); i++) {
	    	System.out.println("1 my elements->"+list.get(i));
	    }
		
	    
	    Iterator itr=list.iterator();  
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		
		
	}

}
