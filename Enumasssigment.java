/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumasssigment;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;
public class Enumasssigment {

   
    // list them out
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    // list again but months
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
      
        System.out.println("Days of the Week:");
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + ": " + days[i]);
        }

        // Part 1b: Print Months of the Year
        System.out.println("\nMonths of the Year:");
        Month[] months = Month.values();
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + ": " + months[i]);
        }

        // Part 2: Get CCHS Username and Graduation Year
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your CCHS username (including graduation year): ");
        String username = scanner.nextLine();

        // Extract the year part (last 4 characters)
        String yearString = username.substring(username.length() - 4);
        Integer graduationYear = Integer.valueOf(yearString);

        // Calculate the year after graduation
        int yearAfterGraduation = graduationYear + 1;

        // Print results
        System.out.println("Your graduation year: " + graduationYear);
        System.out.println("The year after your graduation year will be: " + yearAfterGraduation);
        System.out.println("In computer language, you graduate in: " + Integer.toBinaryString(graduationYear));

        scanner.close();
    }
}
    
