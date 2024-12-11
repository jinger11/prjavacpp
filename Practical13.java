/*
13. Write a Java program to create a Animal interface with a method called bark() that
takes no arguments and returns void. Create a Dog class that implements Animal and
overrides speak() to print "Dog is barking".
*/
// Animal interface with a bark method
interface Animal {
    void bark();  // Abstract method that must be implemented by any class that implements Animal
}

// Dog class that implements the Animal interface
class Dog implements Animal {
    // Overriding the bark method to print "Dog is barking"
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to test the Dog class and the Animal interface
public class Practical13 {
    public static void main(String[] args) {
        // Create an instance of Dog
        Animal dog = new Dog();
        
        // Call the bark method
        dog.bark();  // Output: Dog is barking
    }
}
