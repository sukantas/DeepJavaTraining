package com.java.generic;

import java.util.List;

public class MyGeneric<T> {

	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	
	 public  < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	 
	 public  void printString(String [] s){
		 
		 for(String s1 : s) {
			  System.out.println(s);
		 }
	 }
	 
	 public  void printInt(Integer [] s){
		 
		 for(Integer s1 : s) {
			  System.out.println(s);
		 }
		 
	 
 }
		
}
