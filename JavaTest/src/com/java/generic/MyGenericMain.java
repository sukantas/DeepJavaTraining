package com.java.generic;

import com.test.Swift;

public class MyGenericMain {

	public static void main(String[] args) {
		
		MyGeneric<String> myg = new MyGeneric<String>();
		myg.add("Sandip");
		
		System.out.println(myg.get());
		
		MyGeneric<Integer> imyg = new MyGeneric<Integer>();
		imyg.add(123);
		
		System.out.println(imyg.get());
		
		MyGeneric<Swift> ismyg = new MyGeneric<Swift>();
		Swift st = new Swift();
		
		ismyg.add(st);
		
		System.out.println(ismyg.get().getSpeed1());
		
		
		MyGeneric<String> newG = new MyGeneric<String>();
		
		 Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
		 String[] stringArray = { "ABC", "XYZ" }; 
		 Integer[] intArray = { 1, 3, 5 }; 
		 
		 newG.printArray(charArray);
		 newG.printArray(stringArray);
		 newG.printArray(intArray);
		
		 
		 //newG.printString(charArray); //compilar error
		 newG.printString(stringArray);
		 newG.printInt(intArray);

	}

}
