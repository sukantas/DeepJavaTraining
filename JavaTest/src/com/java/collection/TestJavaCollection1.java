package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestJavaCollection1 {

	public static void main(String args[]){  
		LinkedList<String> list=new LinkedList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		//Iterator itr=list.iterator();  
		/*
		 * while(itr.hasNext()){ System.out.println(itr.next()); }
		 */ 
		
		 for(int i = 0; i<list.size(); i++) {
		    	//System.out.println("1 my elements->"+list.get(i));
		 }
		 Iterator itr=list.iterator();  
		 ListIterator<String>  lit = list.listIterator();
			/*
			 * while (itr.hasNext()) { //System.out.println(itr.next());
			 * 
			 * }
			 */
		 
		 System.out.println(lit.next());
		 System.out.println(lit.next());
		 System.out.println(lit.previous());
		 list.add("ss");
		 System.out.println(lit.next());
	}
}
