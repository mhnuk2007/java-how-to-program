package chapter5.exercises;

import java.util.Scanner;

/*
    5.17 (Calculating Sales) An online retailer sells five products whose retail prices
    are as follows:
    Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5,
    $6.87. Write an application that reads a series of pairs of numbers as follows:
        a) product number
        b) quantity sold
    Your program should use a switch statement to determine the retail price for each
    product. It should calculate and display the total retail value of all products sold.
    Use a sentinel-controlled loop to determine when the program should stop looping and
    display the final results.
*/

public class CalculateSale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalRetailValue = 0.0;

        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;

        System.out.println("Enter -1 to stop.");

        System.out.print("Enter product number (1-5): ");
        int productNumber = input.nextInt();

        while (productNumber != -1) {
            System.out.print("Enter quantity sold: ");
            int quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    totalRetailValue += product1 * quantitySold;
                    break;
                case 2:
                    totalRetailValue += product2 * quantitySold;
                    break;
                case 3:
                    totalRetailValue += product3 * quantitySold;
                    break;
                case 4:
                    totalRetailValue += product4 * quantitySold;
                    break;
                case 5:
                    totalRetailValue += product5 * quantitySold;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                    break;
            }

            System.out.print("\nEnter product number (1-5 or -1 to exit): ");
            productNumber = input.nextInt();
        }

        System.out.printf("Total Retail Value: $%.2f%n", totalRetailValue);
        input.close();
    }
}
