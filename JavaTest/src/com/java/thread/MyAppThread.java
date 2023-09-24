package com.java.thread;

public class MyAppThread extends Thread  {
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			MyAppThread t1=new MyAppThread();  
		//t1.start();  
			t1.run();
			t1.run();
		 }  

}
