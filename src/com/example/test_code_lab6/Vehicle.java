package com.example.test_code_lab6;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the vehicle");
    }

    public void stop() {
        System.out.println("Stopping the vehicle");
    }

    public String toString() {
        return "Vehicle: " + brand;
    }
}

class Bicycle extends Vehicle {
    private int numberOfWheels;

    public Bicycle(String brand, int numberOfWheels) {
        super(brand);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void start() {
        System.out.println("Starting the Bicycle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Bicycle");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String brand, boolean hasHelmet) {
        super(brand);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void start() {
        System.out.println("Starting the Motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Motorcycle");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Starting the Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Car");
    }
}

