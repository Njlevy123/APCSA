/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wednesday;

/**
 *
 * @author nlevy2025
 */
public class Wednesday {
    public static void main(String[] args) {
        // Initialize the array with all 7 days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Print the days of the week, one per row
        System.out.println("Original Weekdays:");
        for (String day : weekDays) {
            System.out.println(day);
        }

        // Resize the array to 5 and copy just the weekdays (Monday to Friday)
        // Creating a new array with a size of 5 (for weekdays only)
        String[] weekdaysOnly = new String[5];

        // Copy the weekdays (Monday to Friday) from the original array to the new array
        System.arraycopy(weekDays, 0, weekdaysOnly, 0, 5);

        // Print the weekdays (Monday to Friday), one per row
        System.out.println("\nUpdated Weekdays (Monday to Friday):");
        for (String day : weekdaysOnly) {
            System.out.println(day);
        }
    }
}
