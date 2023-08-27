package com.test;

import java.io.Serializable;

public class Test1 {
	
	
	static final  int AA;
	
	static {AA =10;}
	
	
	
	public static void main(String[] args) throws Exception {
		Test1 t = new Test1();
		t.getName("ABC");
		try {
		//int i = 10/0;
		Swift s = new Swift();
		String ss =null;
		System.out.println(ss.charAt(10));
		
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("You are giving wrong calculations");
			System.exit(0);
		}
		finally {
			System.out.println("===End the calculation==");
		}
		
		
	}
	
	public String getName(String name) throws Exception {
		
		
		
		try {
		name.charAt(10);
		}catch (Exception e) {
			throw new Exception("wrong name passed");
		}
		return "ABC";
		
	}
	
	

}
