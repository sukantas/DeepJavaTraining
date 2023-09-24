package com.java.generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	
	abstract void draw() ;
	void redme() {
		System.out.println("Color red");
	}
}

class Rec extends Shape {

	@Override
	void draw() {
		System.out.println("I am REC");
		
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("I am Circle");
		
	}
	
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("I am Triangle");
		
	}
	
}






public class GenericTest {

	public static void main(String[] args) {
		List<Rec> list1=new ArrayList<Rec>(); 
		Rec r1 = new Rec();
		Rec r2 = new Rec();
		list1.add(r1);
		list1.add(r2);
		drawShape(list1);
		
		List<Circle> list2=new ArrayList<Circle>(); 
		Circle c1 = new Circle();
		list2.add(c1);
		drawShape(list2);
		
		List<Triangle> list3=new ArrayList<Triangle>();  
		drawShape(list3);
	}
	
	public static void drawShape(List<? extends Shape> lists) {
		for(Shape l : lists) {
			l.draw();
		}
	}
	
	

}
