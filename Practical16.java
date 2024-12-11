/*
16. Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes
*/

interface Drawable {
    void draw();  
}


class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Class Rectangle implementing the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Class Triangle implementing the Drawable interface
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}


public class Practical16 {
    public static void main(String[] args) {
        // Create objects of Circle, Rectangle, and Triangle
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();
        
        // Call the draw() method for each shape
        circle.draw();      // Output: Drawing a Circle.
        rectangle.draw();   // Output: Drawing a Rectangle.
        triangle.draw();    // Output: Drawing a Triangle.
    }
}
