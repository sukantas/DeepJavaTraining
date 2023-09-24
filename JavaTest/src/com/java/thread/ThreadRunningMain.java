package com.java.thread;

public class ThreadRunningMain {

	public static void main(String[] args) {
		//for (int i =0 ; i<10; i++) {
		Thread t = new Thread(new ThreadRunning());
		t.setName("my thread"+1);
		t.start();
		//}

	}

	
}
