package com.test.value;

public class HelloWorld {
	
	//Swift s = null;
	String s1 = null;
	
	public void  test() {
		
		
		String name = "Sandip"; // crating one objcet;
		String name1 = new String("Sandip");
		
		System.out.println(name.equals(name1));
		
		name = name.concat(" Patra");
		
	}
 public static void main(String[] args) {
	System.out.println("Helloworld");
	
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
