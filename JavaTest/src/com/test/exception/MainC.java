package com.test.exception;

public class MainC {
	
	public void sayError() throws ArithmeticException {
		try {
		int i = 1/0;
		System.out.println("Happy to see you");
		}catch (ArithmeticException a) {
			
			throw new ArithmeticException("wrong input divid by zero");
		}
		
	}

}
