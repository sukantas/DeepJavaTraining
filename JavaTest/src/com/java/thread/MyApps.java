package com.java.thread;

import java.util.Calendar;
import java.util.Date;

public class MyApps implements Runnable {
	
	public static MyApps tt;
	
	public static Thread t1 ;
	public static Thread t2 ;
	
	
	public static void main(String[] args) {
		
		tt = new MyApps();
		t1 = new Thread(tt);
		t2 = new Thread(tt);
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		time();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void time() {
		System.out.println("my time:"+new Date());
	}
	
	public void cal() {
		System.out.println("my time:"+ Calendar.DAY_OF_MONTH);
	}
	

}
