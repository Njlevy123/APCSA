/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carsnboats;

/**
 *
 * @author nlevy2025
 */
// Base Vehicle class
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double speed; // Speed in mph
    
    public Vehicle(String make, String model, int year, double speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public String toString() {
        return "Vehicle Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph";
    }
}

// Car class
class Car extends Vehicle {
    private int doors;
    
    public Car(String make, String model, int year, double speed, int doors) {
        super(make, model, year, speed);
        this.doors = doors;
    }
    
    @Override
    public String toString() {
        return "Car Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph, Doors: " + doors;
    }
}

// Sedan class (subclass of Car)
class Sedan extends Car {
    private String trunkSize;
    
    public Sedan(String make, String model, int year, double speed, int doors, String trunkSize) {
        super(make, model, year, speed, doors);
        this.trunkSize = trunkSize;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Trunk Size: " + trunkSize;
    }
}

// SportsCar class (subclass of Car)
class SportsCar extends Car {
    private String engineType;
    
    public SportsCar(String make, String model, int year, double speed, int doors, String engineType) {
        super(make, model, year, speed, doors);
        this.engineType = engineType;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Engine Type: " + engineType;
    }
}

// Boat class
class Boat extends Vehicle {
    private double length; // Length in feet
    
    public Boat(String make, String model, int year, double speed, double length) {
        super(make, model, year, speed);
        this.length = length;
    }
    
    @Override
    public String toString() {
        return "Boat Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph, Length: " + length + " feet";
    }
}

// Yacht class (subclass of Boat)
class Yacht extends Boat {
    private int cabins;
    
    public Yacht(String make, String model, int year, double speed, double length, int cabins) {
        super(make, model, year, speed, length);
        this.cabins = cabins;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Cabins: " + cabins;
    }
}

// Speedboat class (subclass of Boat)
class Speedboat extends Boat {
    private boolean isLuxury;
    
    public Speedboat(String make, String model, int year, double speed, double length, boolean isLuxury) {
        super(make, model, year, speed, length);
        this.isLuxury = isLuxury;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Luxury: " + isLuxury;
    }
}

// Airplane class
class Airplane extends Vehicle {
    private int engines;
    
    public Airplane(String make, String model, int year, double speed, int engines) {
        super(make, model, year, speed);
        this.engines = engines;
    }
    
    @Override
    public String toString() {
        return "Airplane Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph, Engines: " + engines;
    }
}

// Jet class (subclass of Airplane)
class Jet extends Airplane {
    private String jetType;
    
    public Jet(String make, String model, int year, double speed, int engines, String jetType) {
        super(make, model, year, speed, engines);
        this.jetType = jetType;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Jet Type: " + jetType;
    }
}

// PropellerPlane class (subclass of Airplane)
class PropellerPlane extends Airplane {
    private String propellerType;
    
    public PropellerPlane(String make, String model, int year, double speed, int engines, String propellerType) {
        super(make, model, year, speed, engines);
        this.propellerType = propellerType;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Propeller Type: " + propellerType;
    }
}

// Motorcycle class (additional vehicle type)
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String make, String model, int year, double speed, boolean hasSidecar) {
        super(make, model, year, speed);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public String toString() {
        return "Motorcycle Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph, Sidecar: " + hasSidecar;
    }
}

// Bicycle class (additional vehicle type)
class Bicycle extends Vehicle {
    private String type; // Mountain, Road, etc.
    
    public Bicycle(String make, String model, int year, double speed, String type) {
        super(make, model, year, speed);
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Bicycle Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " mph, Type: " + type;
    }
}

public class CarsnBoats {
    public static void main(String[] args) {
        // Create some example objects for each vehicle type
        Vehicle sedan = new Sedan("Toyota", "Camry", 2023, 120, 4, "Large");
        Vehicle sportsCar = new SportsCar("Ferrari", "488", 2022, 211, 2, "V8");
        Vehicle yacht = new Yacht("Sunseeker", "Predator 55", 2020, 45, 55, 3);
        Vehicle speedboat = new Speedboat("Sea Ray", "SPX 190", 2021, 50, 19, true);
        Vehicle jet = new Jet("Boeing", "737", 2021, 550, 2, "Commercial");
        Vehicle propellerPlane = new PropellerPlane("Cessna", "172", 2019, 140, 1, "Single");
        Vehicle motorcycle = new Motorcycle("Harley Davidson", "Iron 883", 2024, 100, false);
        Vehicle bicycle = new Bicycle("Giant", "Defy", 2022, 30, "Road");
        
        // Print their details using toString() method
        System.out.println(sedan);
        System.out.println(sportsCar);
        System.out.println(yacht);
        System.out.println(speedboat);
        System.out.println(jet);
        System.out.println(propellerPlane);
        System.out.println(motorcycle);
        System.out.println(bicycle);
    }
}































































    
