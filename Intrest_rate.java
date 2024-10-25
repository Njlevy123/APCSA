/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intrest_rate;

/**
 *
 * @author nlevy2025
 */
  import java.util.Scanner;
public class Intrest_rate {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for an amount of money they want to borrow
        System.out.print("Enter the financial amount (e.g., $1,000,000): ");
        double amount = scanner.nextDouble();

        // ask how many months they want to repay
        System.out.print("Enter the number of months for repayment: ");
        int months = scanner.nextInt();

        // Create an instance of InterestRateCalculator
        InterestRateCalculator calculator = new InterestRateCalculator(amount, months);

        // Call the method to calculate payments
        calculator.calculatePayments();

        // Close the scanner
        scanner.close();
    }

    // InterestRateCalculator class
    public static class InterestRateCalculator {
        // Public constant for the interest rate
        public static final double RATE = 0.035; // 3.5% interest rate

        // Private variables to hold the financial amount and months
        private double amount;
        private int months;

        // Constructor to initialize the amount and months
        public InterestRateCalculator(double amount, int months) {
            this.amount = amount;
            this.months = months;
        }

        // Public method to calculate monthly payments with interest
        public void calculatePayments() {
            double remainingAmount = amount;
            double totalPaid = 0;

            System.out.printf("%-10s %-15s %-15s%n", "Month", "Payment", "Total Paid");
            
            for (int month = 1; month <= months; month++) {
                // Calculate interest for the current remaining amount
                double interest = remainingAmount * RATE / 12;
                // Calculate monthly payment (principal + interest)
                double monthlyPayment = (remainingAmount / (months - month + 1)) + interest;

                // Update total paid
                totalPaid += monthlyPayment;

                // Output the current month, payment, and total paid so far
                System.out.printf("%-10d $%-14.2f $%-14.2f%n", month, monthlyPayment, totalPaid);

                // Reduce the remaining amount for the next iteration
                remainingAmount -= (monthlyPayment - interest);
            }
        }
    }
}

