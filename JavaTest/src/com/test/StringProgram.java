package com.test;

public class StringProgram {

	public static void main(String[] args) {
		String name = "Sandip"; // crating one objcet;
		name = name + " Patra"; // creating another object;
		
		System.out.println(name);
		
		
		StringBuffer sbName= new StringBuffer("Sandip"); //creating one object;
		sbName.append(" Patra");
		System.out.println(sbName);
		
		
		
		
		name = name.concat(" Patra");
	}
	
	private void updateName(String name) {

       StringBuffer sbName= new StringBuffer("Sandip"); //creating one object;
		sbName.append(name);
		System.out.println(sbName);

	}
}
