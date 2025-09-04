// Base class (Parent)
class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void displayInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Car class (Child)
class Car extends Vehicle {
    int numberOfDoors;

    Car(int speed, int fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity); // Reuse parent properties
        this.numberOfDoors = numberOfDoors;
    }

    void showCarFeatures() {
        displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}

// Bike class (Child)
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(int speed, int fuelCapacity, boolean hasCarrier) {
        super(speed, fuelCapacity);
        this.hasCarrier = hasCarrier;
    }

    void showBikeFeatures() {
        displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// Truck class (Child)
class Truck extends Vehicle {
    int loadCapacity; // in tons

    Truck(int speed, int fuelCapacity, int loadCapacity) {
        super(speed, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    void showTruckFeatures() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(180, 50, 4);
        Bike bike = new Bike(120, 15, true);
        Truck truck = new Truck(100, 150, 10);

        System.out.println("=== Car Details ===");
        car.start();
        car.showCarFeatures();

        System.out.println("\n=== Bike Details ===");
        bike.start();
        bike.showBikeFeatures();

        System.out.println("\n=== Truck Details ===");
        truck.start();
        truck.showTruckFeatures();
    }
}