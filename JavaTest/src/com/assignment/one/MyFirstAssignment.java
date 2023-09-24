package com.assignment.one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MyFirstAssignment {

	public static void main(String[] args) {
	       LinkedList<String> li= new LinkedList<String>();
	       Scanner sc1= new Scanner(System.in);
	       System.out.println("Enter the three names...");
        String name5= sc1.nextLine();
	       li.add(name5);
	       String name6= sc1.nextLine();
	       li.add(name6);
	       String name7= sc1.nextLine();
	       li.add(name7);
	       //li.add("Sandip");
	      // li.add("Rahul");
	      // li.add("bittu");
	       System.out.println("In the list Students are present--");
	      
	       Iterator<String> itr=li.iterator();  
	       while(itr.hasNext()){  
	        System.out.println(itr.next());
	    	  
	       }
	       Scanner sc= new Scanner(System.in);
	       
	           
	      
	       System.out.println("Enter the name at beginning:");
	       String name= sc.nextLine();
	       
	       li.addFirst(name);
	       System.out.println("After Insert of name at the beginning--");
	       Iterator<String> it=li.iterator();  
	       while(it.hasNext()){  
	        System.out.println(it.next());  
	       }  
	       
	       
	       System.out.println("Enter the name at end:");
	       String name2= sc.nextLine();
	       li.addLast(name2);
	       System.out.println("Insert name at the End--");
	       Iterator<String> i= li.iterator();
	       while(i.hasNext()) {
	    	   System.out.println(i.next());
	    	   
	      
	      
	       }
	       System.out.println("Insert any position");
	       System.out.println("1. add name for beginning.");
		      System.out.println("2. add name for end.");
		      System.out.println("What's your choice...");
		      Scanner c= new Scanner(System.in);
		      int num=c.nextInt();
		      if (num==1) {
		    	  System.out.println("Enter the name:");
			       String name3= sc.nextLine();
			       
			       li.addFirst(name3);
			       System.out.println("After Insert of name at the beginning--");
			       Iterator<String> it1=li.iterator();  
			       while(it1.hasNext()){  
			        System.out.println(it1.next()); 
		    	  
		      }    
		    	  
	     
}
		      else {
		    	  System.out.println("Enter the name:");
			       String name3= sc.nextLine();
			       li.addLast(name3);
			       System.out.println("Insert name at the End--");
			       Iterator<String> i1= li.iterator();
			       while(i1.hasNext()) {
			    	   System.out.println(i1.next());
		      }

	
	 }
}


		
			
		
		

	}


