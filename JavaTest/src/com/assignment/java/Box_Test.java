//1. Create a class called Box having following properties:
//a. Three instance variables for three dimensions
//b. Three constructors – one with no argument, one
//with one argument and another with three arguments
//c. A method to calculate volume of the Box
package com.assignment.java;

public class Box_Test {
	public static void main(String[] args) {
		Box ob1=new Box();
		Box ob2=new Box();
		Box ob3=new Box();
		ob1.display();
		ob2.display();
		ob3.display();
		

	}

}
class Box{
	double lenth,breadth,hight;
	
	Box(){
		lenth=3.0;
		breadth=5.0;
		hight=4.0;
	}
	Box(double a){
		lenth=a;
		breadth=a;
		hight=a;
	}
	Box(double l, double b, double h){
	lenth=l;
	breadth=b;
	hight=h;
	}
	void display() {
		double c=lenth*breadth*hight;
		System.out.println("Volume of the box is: "+c);
	}
}

