/* 
Write a Java program to create a class Vehicle with a method called speedUp().Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently
*/
class Vehicle
{
	void speedUp()
	{
		System.out.println("Vehicle Spped ");
	}
}
class Car extends Vehicle
{
	void speedUp()
	{
		System.out.println("Car Spped: 80km/hr");
	}
}
class Bicycle extends Vehicle
{
	void speedUp()
	{
		System.out.println("Bicycle Spped:5km/hr ");
	}
}

class Practical3
{
	public static void main(String args[])
	{
		Vehicle Car=new Car();
		Car.speedUp();
		Vehicle Bicycle=new Bicycle();
		Bicycle.speedUp();
	}
}
