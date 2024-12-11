/*
Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area
*/
import java.util.*;

class Shape
{
	Scanner sc=new Scanner(System.in);
	
		
	void calculateArea()
	{
		System.out.println("calculateArea() Executed ");
	}
}
class Circle extends Shape
{
	float r, area;
	void calculateArea()
	
	{
		System.out.println("Enter Radius");
		r=sc.nextInt();
		
		area=(float)(3.14*r*r);
		System.out.println("Area of circle "+area);
	}
}
class Rectangle extends Shape
{
	int l,w;
	float area;
	void calculateArea()
	{
		System.out.println("Enter Length :");
		l=sc.nextInt();
		System.out.println("Enter Width :");
		w=sc.nextInt();
		
		area=l*w;
		System.out.println("Area of Rectangle: "+area);
	}
}
class Triangle extends Shape
{
	int b,h;
	float area;
	void calculateArea()
	{
		System.out.println("Enter Breadth :");
		b=sc.nextInt();
		System.out.println("Enter Height :");
		h=sc.nextInt();
		
		area=0.5f*b*h;
		System.out.println("Area of Triangle: "+area);
	}
}

class Practical4
{
	public static void main(String args[])
	{
		Shape Circle=new Circle();
		Shape Rectangle=new Rectangle();
		Shape Triangle=new Triangle();
		System.out.println("Circle: ");
		Circle.calculateArea();
		System.out.println("Rectangle: ");
		Rectangle.calculateArea();
		System.out.println("Triangle: ");
		Triangle.calculateArea();
	}
}
