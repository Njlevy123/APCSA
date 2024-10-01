/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.math3;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;
public class Math3 {


     public static void main(String[] args) {
        // Generate a random integer 0 to 90
        int angle = (int) (Math.random() * 91);
        
        // Calculate sin cos and tan in degrees
        double sine = Math.round(Math.sin(Math.toRadians(angle)) * 1000.0) / 1000.0;
        double cosine = Math.round(Math.cos(Math.toRadians(angle)) * 1000.0) / 1000.0;
        double tangent = Math.round(Math.tan(Math.toRadians(angle)) * 1000.0) / 1000.0;

        //results
        System.out.printf("Number: %d Sine: %.3f Cosine: %.3f Tangent: %.3f%n", angle, sine, cosine, tangent);

        // Generate a random number for the radius of a circle
        double radius = 1.0 + (Math.random() * 19.0); 
        double area = Math.round(Math.PI * radius * radius * 100.0) / 100.0;
        double volume = Math.round((4.0 / 3.0) * Math.PI * Math.pow(radius, 3) * 100.0) / 100.0;

        // show area and volume
        System.out.printf("Radius: %.3f Area: %.3f Volume: %.3f%n", radius, area, volume);

        // Generate a random real number
        double highValue = 1000.0 + (Math.random() * (100000000.0 - 1000.0));
        double sqrtValue = Math.round(Math.sqrt(highValue) * 100000.0) / 100000.0;
        double logValue = Math.round(Math.log(highValue) * 100000.0) / 100000.0;
        double log10Value = Math.round(Math.log10(highValue) * 100000.0) / 100000.0;

        // Display big number answer thing

        System.out.printf("High Value: %.5f Square Root: %.5f Natural Log: %.5f Log10: %.5f%n", 
                          highValue, sqrtValue, logValue, log10Value);

        // Calculate mass required using E = mc^2
        double speedOfLight = 299792458; // in m/s
        double mass = highValue / (speedOfLight * speedOfLight); // in kg
        mass *= 1000; // Convert kg to grams

        // Round mass to user-defined decimal places
        System.out.print("Enter the number of decimal places for mass: ");
        Scanner scanner = new Scanner(System.in);
        int massDecimalPlaces = scanner.nextInt();
        double roundedMass = roundAvoid(mass, massDecimalPlaces);

        System.out.printf("Mass required (grams): %.3f%n", roundedMass);

        //put in exponent
        System.out.print("Enter a real number: ");
        double userValue = scanner.nextDouble();
        System.out.print("Enter an integer exponent: ");
        int exponent = scanner.nextInt();
        System.out.print("Enter the number of decimal places for the result: ");
        int resultDecimalPlaces = scanner.nextInt();

        double poweredValue = Math.pow(userValue, exponent);
        double roundedResult = roundAvoid(poweredValue, resultDecimalPlaces);

        System.out.printf("Result: %.3f%n", roundedResult);
        
        scanner.close();
    }

    //round to decimals
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}