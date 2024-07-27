package Projects;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Daily_Grocery_Store_Sales_Program {
    
    public static void main(String[] args) {
        // Call the intro function to display the program's purpose
        intro();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store sales data
        ArrayList<Double> sales = new ArrayList<>();
        
        // Array of days of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Prompt the user to enter sales for each day of the week
        for (String day : days) {
            System.out.print("Enter the number of store sales for " + day + ": $");
            double amount = scanner.nextDouble();
            sales.add(amount); // Store the sales amount in the list
        }

        // Calculate minimum, maximum, total, and average sales
        double min = sales.get(0); // Initialize minimum sales with the first value
        double max = sales.get(0); // Initialize maximum sales with the first value
        double total = 0; // Initialize total sales to zero

        // Iterate through the sales list to compute min, max, and total
        for (double sale : sales) {
            if (sale < min) {
                min = sale; // Update min if current sale is lower
            }
            if (sale > max) {
                max = sale; // Update max if current sale is higher
            }
            total += sale; // Accumulate total sales
        }

        // Calculate the average sales
        double average = total / sales.size();

        // Create a NumberFormat instance for formatting 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Display the results 
        System.out.printf("Minimum Sales: %s%n", currencyFormat.format(min));
        System.out.printf("Maximum Sales: %s%n", currencyFormat.format(max));
        System.out.printf("Total Sales: %s%n", currencyFormat.format(total));
        System.out.printf("Average Sales: %s%n", currencyFormat.format(average));

        // Close the scanner
        scanner.close();
    }

    // Function to display the introductory statement
    public static void intro() {
        System.out.println("Welcome to the Daily Grocery Store Sales Program!");
        System.out.println("\nThis program will help you input daily sales amounts for a week and");
        System.out.println("calculate the minimum, maximum, total, and average sales.");
        System.out.println("\nYou will be prompted to enter sales amounts for each day of the week.");
        System.out.println();
    }
}
