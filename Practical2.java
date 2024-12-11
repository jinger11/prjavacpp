/*2. Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.*/
class Animal
{
	void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Bird extends Animal
{
	void sound()
	{
		System.out.println("parrot Bird Sound");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat mous");
	}
}
class Practical2
{
	public static void main(String args[])
	{
		Animal Bird=new Bird();
		Animal Cat=new Cat();
		Bird.sound();
		Cat.sound();
	}
}