/*
Implement Factory design pattern for the given context. Consider Car building process, which requires many steps from allocating accessories to final makeup. These steps should be written as methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory Pattern should be implemented.
*/
// Abstract base class: Car
abstract class Car {
    public Car() {
        prepareAccessories();
        buildBody();
        addEngine();
        paintCar();
    }

    abstract void prepareAccessories();
    abstract void buildBody();
    abstract void addEngine();
    abstract void paintCar();
}

// Subclass: Hatchback
class Hatchback extends Car {
    @Override
    void prepareAccessories() {
        System.out.println("Preparing accessories for Hatchback...");
    }

    @Override
    void buildBody() {
        System.out.println("Building body for Hatchback...");
    }

    @Override
    void addEngine() {
        System.out.println("Adding engine to Hatchback...");
    }

    @Override
    void paintCar() {
        System.out.println("Painting Hatchback...");
    }
}

// Subclass: Sedan
class Sedan extends Car {
    @Override
    void prepareAccessories() {
        System.out.println("Preparing accessories for Sedan...");
    }

    @Override
    void buildBody() {
        System.out.println("Building body for Sedan...");
    }

    @Override
    void addEngine() {
        System.out.println("Adding engine to Sedan...");
    }

    @Override
    void paintCar() {
        System.out.println("Painting Sedan...");
    }
}

// Subclass: SUV
class SUV extends Car {
    @Override
    void prepareAccessories() {
        System.out.println("Preparing accessories for SUV...");
    }

    @Override
    void buildBody() {
        System.out.println("Building body for SUV...");
    }

    @Override
    void addEngine() {
        System.out.println("Adding engine to SUV...");
    }

    @Override
    void paintCar() {
        System.out.println("Painting SUV...");
    }
}

// Factory class: CarFactory
class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "hatchback":
                return new Hatchback();
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}

// Test Factory Pattern
public class Practical25 {
    public static void main(String[] args) {
        System.out.println("Building a Hatchback:");
        Car hatchback = CarFactory.createCar("hatchback");

        System.out.println("\nBuilding a Sedan:");
        Car sedan = CarFactory.createCar("sedan");

        System.out.println("\nBuilding an SUV:");
        Car suv = CarFactory.createCar("suv");
    }
}

