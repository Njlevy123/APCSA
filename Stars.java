/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars;

/**
 *
 * @author nlevy2025
 */
public class Stars {

    //-----------------------------------------------------------------
    // Prints different patterns using asterisk (star) characters.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        
        final int MAX_ROWS = 10;

        // first pattern
        System.out.println("a.");
        for (int row = MAX_ROWS; row >= 1; row--) { // Loop going down
            for (int star = 1; star <= row; star++) { // Print stars 
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        System.out.println(); // Blank line between patterns
        
        // second pattern
        System.out.println("b.");
        for (int row = 1; row <= MAX_ROWS; row++) { // Loop
            // Print spaces on right
            for (int space = 1; space <= MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            // Print stars equal to the row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        System.out.println(); // Blank line between the patterns

        // third pattern 
        System.out.println("c.");
        for (int row = MAX_ROWS; row >= 1; row--) { // loop
            // Print the spaces
            for (int space = 1; space <= MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            // Print stars 
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }
        System.out.println(); // blank line between patterns

        // fourth pattern 
        System.out.println("d.");
        // upper half of the diamond
        for (int row = 1; row <= MAX_ROWS / 2 + 1; row++) { // Loop for first rows 
            // Print leading spaces
            for (int space = 1; space <= MAX_ROWS / 2 - row + 1; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }
        
        // Lower half of the diamond
        for (int row = MAX_ROWS / 2; row >= 1; row--) { // Loop for bottom
            // print leading spaces
            for (int space = 1; space <= MAX_ROWS / 2 - row + 1; space++) {
                System.out.print(" ");
            }
            // print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println(); // move4 to the next line
        }
    }
}
