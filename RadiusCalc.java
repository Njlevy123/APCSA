/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    // Carry out calculations for circular items
    // such as a circle, a sphere, a cone, a cylinder
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Scanner object for user input
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a cylinder (pi r^2 h)");  // Fixed typo: 'column' changed to 'cylinder'
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        
        if (i == 1) {
            cCalc(s);  // Passing scanner object to method
        } else if (i == 2) {
            sCalc(s);  // Passing scanner object to method
        } else if (i == 3) {
            cCalc2(s);  // Passing scanner object to method
        } else if (i == 4) {
            cCalc3(s);  // Passing scanner object to method
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 4.");
        }
    }
    
    // Calculates the volume of a cylinder (pi r^2 h)
    public static void cCalc3(Scanner s){
        System.out.println("Enter the radius and then height of your cylinder");
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;  // Fixed the missing height variable and corrected the formula
        System.out.println("The volume of the cylinder is: " + result);
    }
    
    // Calculates the volume of a cone (pi r^2 h / 3)
    public static void cCalc2(Scanner s) {
        System.out.println("Enter the radius and then height of your cone");
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h / 3.0;  // Added proper division and corrected the formula
        System.out.println("The volume of the cone is: " + result);
    }
    
    // Calculates the area of a circle (pi r^2)
    public static void cCalc(Scanner s){
        System.out.println("Enter the radius of your circle");
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println("The area of the circle is: " + result);
    }
    
    // Calculates the volume of a sphere (4/3 pi r^3)
    public static void sCalc(Scanner s){
        System.out.println("Enter the radius of your sphere");
        int r = s.nextInt();
        double result = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);  // Fixed integer division issue and added floating point division
        System.out.println("The volume of the sphere is: " + result);
    }
}
