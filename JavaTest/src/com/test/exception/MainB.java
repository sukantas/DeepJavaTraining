package com.test.exception;

public class MainB {
	
	public void sayError() throws Exception {
		MainC c = new MainC();
		c.sayError();
	}

}
