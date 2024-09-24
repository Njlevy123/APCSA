/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phone4;

/**
 *
 * @author nlevy2025
 */
    import java.util.Random;
import java.util.Scanner;

public class Phone4 {

 
   

    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            String phoneNumber = generatePhoneNumber();
            System.out.println("Generated Phone Number: " + phoneNumber);
            System.out.print("Press 'p' to generate another phone number: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'p' || choice == 'P');

        scanner.close();
        
    }

    private static String generatePhoneNumber() {
        // Generate the area code 
        int areaCode = generateAreaCode();
        // Generate the second part  les  then 655
        int centralOfficeCode = random.nextInt(656);
        // Generate the last part of the number thing
        int subscriberNumber = random.nextInt(10000);

        // make it look like a numer
        
        return String.format("%03d-%03d-%04d", areaCode, centralOfficeCode, subscriberNumber);
    }

    private static int generateAreaCode() {
        // Generate the first digit (0-7)
        int firstDigit = random.nextInt(8);
        // Generate the next two digits (0-7)
        int secondDigit = random.nextInt(8);
        int thirdDigit = random.nextInt(8);

        // Combine the digits to form the area code
        return firstDigit * 100 + secondDigit * 10 + thirdDigit;
    }
}
