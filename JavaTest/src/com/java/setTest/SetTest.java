package com.java.setTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> data = new LinkedHashSet<String>();
		// TODO Auto-generated method stub
		
		data.add("JavaTpoint");   
        data.add("Set");   
        data.add("Example");   
        data.add("Set");   
        data.add("Set"); 
        data.add(null);
    
        System.out.println(data);   
        
        Set<Integer> hdata = new HashSet<Integer>();
        
        hdata.add(11);   
        hdata.add(1);  
        hdata.add(1);  
        hdata.add(122);   
        hdata.add(100);   
         
    
        System.out.println(hdata);
        
       String input[] = {"abc", "cde", "efg", "abc", "xyz", "tfg", "xyz"};
       String output[] = {}; // "abc", "cde", "efg","xyz", "tfg"

	}

}
