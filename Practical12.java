/*
Design and develop a context for given case study and implement an interface for Vehicles Consider the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their own class in their own way.
*/

interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

// Class for Bicycle
class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear changed to: " + this.gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Bicycle speed reduced to: " + speed + " km/h");
    }
}

// Class for Bike
class Bike implements Vehicle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike gear changed to: " + this.gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Bike speed reduced to: " + speed + " km/h");
    }
}

// Class for Car
class Car implements Vehicle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car gear changed to: " + this.gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Car speed reduced to: " + speed + " km/h");
    }
}

public class Practical12
 {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Testing Bicycle:");
        bicycle.changeGear(2);
        bicycle.speedUp(15);
        bicycle.applyBrakes(5);

        System.out.println("\nTesting Bike:");
        bike.changeGear(3);
        bike.speedUp(30);
        bike.applyBrakes(10);

        System.out.println("\nTesting Car:");
        car.changeGear(4);
        car.speedUp(60);
        car.applyBrakes(20);
    }
}

