package com.test;

public class HelloWorld {
	
	Swift s = null;
	String s1 = null;
	
	public void  test() {
		Swift s = new Swift();
		String s1= s.name1;
		String s2 = s.name2;
	}
 public static void main(String[] args) {
	System.out.println("Helloworld");
	System.out.println();	
	long l = 10L;
	double d = 1000000000000000000000000000.1;
	int i = 4;
	byte b = 1;
	
	
	 
	long l1 = i;
	double d1 = i;
	
	int i3 = (int) d;
	System.out.println(i3);
	

}
}

//byte, short, int/char, long, float, double
