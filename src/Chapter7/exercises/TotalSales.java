package Chapter7.exercises;
/*
Exercise: (Total Sales) Use a two-dimensional array to solve the following problem: A company has
four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
from all the slips for last month is available. Write an application that will read all this information for
last month’s sales and summarize the total sales by salesperson and by product. All totals should be
stored in the two-dimensional array sales. After processing all the information for last month, display the results in tabular format, with each column representing a salesperson and each row representing a particular product. Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month. Your output should
include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.
 */

import java.util.Scanner;

public class TotalSales {
    // Constants representing number of products and salespersons
    public static final int PRODUCTS = 5;        // 5 products
    public static final int SALESPERSONS = 4;    // 4 salespersons

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array to store sales data
        // sales[product][salesperson] represents sales of a product by a salesperson
        double[][] sales = new double[PRODUCTS][SALESPERSONS];

        System.out.println("Enter sales data (salesperson product amount). Enter -1 to stop.");

        // Input loop to read sales data until user enters -1
        while (true) {
            System.out.print("Enter salesperson (1-4): ");
            int salesperson = input.nextInt();
            if (salesperson == -1) break;

            System.out.print("Enter product (1-5): ");
            int product = input.nextInt();
            if (product == -1) break;

            System.out.print("Enter sales amount: ");
            double amount = input.nextDouble();
            if (amount == -1) break;

            // Validate input
            if (salesperson < 1 || salesperson > 4 || product < 1 || product > 5 || amount < 0) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            // Add the sales amount to the appropriate cell (adjust for 0-based indexing)
            sales[product - 1][salesperson - 1] += amount;
        }

        // Print table header
        System.out.printf("%n%-12s", "Product");
        for (int i = 1; i <= SALESPERSONS; i++) {
            System.out.printf("Salesperson %d  ", i);
        }
        System.out.println("Total"); // Rightmost column for row total

        // Print table body with row totals (sales per product)
        for (int i = 0; i < PRODUCTS; i++) {
            System.out.printf("Product %-4d", i + 1);
            double rowTotal = 0;
            for (int j = 0; j < SALESPERSONS; j++) {
                System.out.printf("%14.2f", sales[i][j]);
                rowTotal += sales[i][j]; // Accumulate row total
            }
            System.out.printf("%10.2f%n", rowTotal); // Print row total
        }

        // Print column totals (sales per salesperson)
        System.out.printf("%-12s", "Total");
        for (int j = 0; j < SALESPERSONS; j++) {
            double colTotal = 0;
            for (int i = 0; i < PRODUCTS; i++) {
                colTotal += sales[i][j]; // Accumulate column total
            }
            System.out.printf("%14.2f", colTotal); // Print column total
        }

        System.out.println(); // End of table
    }
}
