package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");
	    
	   
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    map.put(1,"xyz");
	    map.put(1,"xyz1");
	    //Traversing Map  
	  //  Set set=map.entrySet();//Converting to Set so that we can traverse
	    
	  //  Iterator itr=set.iterator();  
		/*
		 * while(itr.hasNext()){
		 * 
		 * //Converting to Map.Entry so that we can get key and value separately
		 * Map.Entry entry=(Map.Entry)itr.next();
		 * System.out.println(entry.getKey()+" "+entry.getValue());
		 * System.out.println(map.get(entry.getKey())); System.out.println(itr.next());
		 * }
		 * 
		 * for(Map.Entry m:map.entrySet()){
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */
	    
	    //map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	    //  .stream()  
	      //Sorted according to the provided Comparator  
	    //  .sorted(Map.Entry.comparingByValue())  
	      //Performs an action for each element of this stream  
	   //   .forEach(System.out::println);  
	    
	  //  map.entrySet().stream().forEach(System.out::println);
	    System.out.println("Iterating Hashmap...");  
	    for(Map.Entry m:map.entrySet()){
			 System.out.println(m.getKey()+" "+m.getValue()); }
	    
	}
}
