/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascal;

/**
 *
 * @author nlevy2025
 */
import java.util.Arrays;

public class Pascal {
    
    // Recursive method to calculate the numba
    public static int binomialCoefficient(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }
        // Recursive case
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Method to print the 9 line of Pascal's Triangle
    public static void printNthLine(int n) {
        int[] line = new int[n + 1];  // Array to store the Nth line
        
        // Fill the array with numbas
        for (int k = 0; k <= n; k++) {
            line[k] = binomialCoefficient(n, k);
        }
        
        // Print the line
        System.out.println(Arrays.toString(line));
    }
    
    public static void main(String[] args) {
        int n = 5;  // For example, print the 5th line of Pascal's Triangle
        printNthLine(n);
    }
}
