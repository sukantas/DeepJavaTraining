package com.java.collection;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Sandip");
		Student s2 = new Student(1, "Sandip");
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));

	}

}
