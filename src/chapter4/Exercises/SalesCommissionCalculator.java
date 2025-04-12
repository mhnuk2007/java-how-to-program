package chapter4.Exercises;
/*
    4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
    The salespeople receive $200 per week plus 9% of their gross sales for that week.
    For example, a salesperson who sells $5,000 worth of merchandise in a week receives
    $200 plus 9% of $5000, or a total of $650. You’ve been supplied with a list of the items
    sold by each salesperson. The values of these items are as follows:
        Item    Value
        1       239.99
        2       129.75
        3       99.95
        4       350.89
Develop a Java application that inputs one salesperson’s items sold for last week and
calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can
be sold.
 */

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        double totalSales = 0;

        System.out.println("Enter an item sold (1-4) or (-1 for quit): ");
        int item = input.nextInt();

        while (item != -1) {
            switch(item) {
                case 1:
                    totalSales += item1;
                    break;
                case 2:
                    totalSales += item2;
                    break;
                case 3:
                    totalSales += item3;
                    break;
                case 4:
                    totalSales+=item4;
                    break;
                default:
                    System.out.println("Invalid item number");

            }
            System.out.println("Enter an item sold (1-4) or (-1 for quit): ");
            item = input.nextInt();

        }
        double commission = 200 + 0.09 * totalSales;
        System.out.printf("Total Sales: $%.2f%n", totalSales);
        System.out.printf("Commission: $%.2f%n", commission);
    }
}
