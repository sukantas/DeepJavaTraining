package com.java.thread;

public class ThreadRunning implements Runnable {

	@Override
	public void run() {
		System.out.println("My thread name:"+ Thread.currentThread().getName());
		
		try {
			
			Thread.sleep(1000);
			
			for(int i=0;i<100;i++) {
				System.out.println("hi");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("My thread END:"+ Thread.currentThread().getName());
		
	}

}
