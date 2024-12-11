/*
11. Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area. Implement dynamic binding for given case study.
*/

import java.util.Scanner;

// Abstract base class Shape
abstract class Shape {
    double dimension1, dimension2;

    // Method to input data
    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first dimension:");
        dimension1 = sc.nextDouble();
        System.out.println("Enter the second dimension:");
        dimension2 = sc.nextDouble();
    }

    abstract void computeArea();
}

class Triangle extends Shape {
    void computeArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    void computeArea() {
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Practical11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic binding
        Shape shape;

        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        int choice = sc.nextInt();

        if (choice == 1) {
            shape = new Triangle();
        } else if (choice == 2) {
            shape = new Rectangle();
        } else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        shape.inputData();
        shape.computeArea();
    }
}

	