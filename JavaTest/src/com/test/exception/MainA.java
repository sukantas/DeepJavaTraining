package com.test.exception;

public class MainA {

	public static void main(String[] args) {
		
		
		MainB b = new MainB();
		try {
			b.sayError();
		} catch (Exception e) {
			System.out.println("Main error:"+ e.getMessage());
		}
		
		

	}

}
