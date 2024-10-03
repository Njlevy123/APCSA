/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number.format2;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;
import java.util.Random;

public class NumberFormat2 {



  
public class SchoolStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Calculate percentage of girls and boys
        System.out.print("Enter the total number of students at the school: ");
        int totalStudents = scanner.nextInt();
        System.out.print("Enter the number of girls at the school: ");
        int numberOfGirls = scanner.nextInt();

        int numberOfBoys = totalStudents - numberOfGirls;
        double percentageGirls = (double) numberOfGirls / totalStudents * 100;
        double percentageBoys = (double) numberOfBoys / totalStudents * 100;

        System.out.printf("Percentage of Girls: %.2f%%\n", percentageGirls);
        System.out.printf("Percentage of Boys: %.2f%%\n", percentageBoys);

        // Task 2: Convert Dollars to British Pounds
        System.out.print("Enter the total amount of money in Dollars and Cents (e.g. 100.50): ");
        double dollars = scanner.nextDouble();
        double exchangeRate = 0.83;
        double pounds = dollars * exchangeRate;

        // Manually formatting the output to show Pounds
        System.out.printf("Converted amount in British Pounds: £%.2f (Exchange rate: 1 USD = %.2f GBP)\n", pounds, exchangeRate);

        // Task 3: Format Pi to specified decimal places
        System.out.print("Enter an integer from 0 to 15 for the number of decimal places for Pi: ");
        int decimalPlaces = scanner.nextInt();
        if (decimalPlaces < 0 || decimalPlaces > 15) {
            System.out.println("Invalid input. Please enter a number between 0 and 15.");
        } else {
            String piFormatted = String.format("%." + decimalPlaces + "f", Math.PI);
            System.out.println("Pi to " + decimalPlaces + " decimal places: " + piFormatted);
        }

        // Task 4: Generate a random number
        Random random = new Random();
        long randomNumber = 100_000_000 + (long)(random.nextDouble() * (999_999_999_999_999_999L - 100_000_000));
        System.out.println("Random number generated: " + randomNumber);

        scanner.close();
    }
}
}

