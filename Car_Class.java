/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car_class;

/**
 *
 * @author nlevy2025
 */

public class Car_Class {
    private String carBrand;
    private int enginePower; //HP
    private double maxSpeed; //MPH
    private double price; //the cost

    // Constructor
    public Car_Class(String carBrand, int enginePower, double maxSpeed, double price) {
        this.carBrand = carBrand;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    // set
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;}

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;}

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;}

    public void setPrice(double price) {
        this.price = price;}

    // Getters
    public String getCarBrand() {
        return carBrand;}

    public int getEnginePower() {
        return enginePower;}

    public double getMaxSpeed() {
        return maxSpeed;}

    public double getPrice() {
        return price;}

    //String method
    @Override
    public String toString() {
        return "Car Brand: " + carBrand +
                ", Engine Power: " + enginePower + " HP" +
                ", Max Speed: " + maxSpeed + " MPH" +
                ", Price: $" + price;}

    // Main method to use the class
    public static void main(String[] args) {
        // Creating car objects
        Car_Class vwBug = new Car_Class("VW Bug", 51, 73, 15000);
        Car_Class toyotaPrius = new Car_Class("Toyota Prius", 120, 120, 27000);
        Car_Class bmwI8 = new Car_Class("BMW i8", 360, 150, 150000);
        Car_Class teslaModel3 = new Car_Class("Tesla Model 3", 280, 160, 30000);

        // Printing out the car details
        System.out.println(vwBug);
        System.out.println(toyotaPrius);
        System.out.println(bmwI8);
        System.out.println(teslaModel3);
    }
}