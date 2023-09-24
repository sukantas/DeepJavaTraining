package com.java.setTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeHashSet {


	public static void main(String[] args) {
		
		TreeSet<String> data = new TreeSet<String>();
		// TODO Auto-generated method stub
		
		data.add("JavaTpoint");   
        data.add("Set");   
        data.add("Example");   
        data.add("Set");   
        data.add("Set"); 
       // data.add(null);
    
        System.out.println(data);   
        String c= data.ceiling("Set");
        
        System.out.println(c);   
        
        
        TreeSet<Integer> hdata = new TreeSet<Integer>();
        
        hdata.add(11);   
        hdata.add(1);  
        hdata.add(1);  
        hdata.add(122);   
        hdata.add(100);   
         
        Integer i = hdata.ceiling(101);
        Integer f = hdata.floor(100);
    
        System.out.println(hdata);
        System.out.println(i);
        System.out.println(f);
        
      

	}



}
