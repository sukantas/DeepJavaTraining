package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String args[]){  
		  
		  LinkedList<String> ll=new LinkedList<String>();  
		           ll.add("Ravi");  
		           ll.add("Vijay");  
		           ll.add("Ajay");  
		           ll.add("Ajay2");
		           ll.add("Ajay3");
		           ll.add("Ajay4");
		           //Traversing the list of elements in reverse order  
		           Iterator i=ll.descendingIterator();  
		           //Iterator i=ll.iterator();  
		           while(i.hasNext())  
		           {  
		               System.out.println(i.next());  
		           }  
		             
		 }  

}
