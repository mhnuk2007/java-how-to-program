package Chapter7.exercises;
/*
Exercise 7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.
 */

import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        // Array to hold counters for each salary range
        int[] salaryRanges = new int[9];

        Scanner input = new Scanner(System.in);

        // Input loop
        while (true) {
            System.out.print("Enter salesperson's weekly gross sales (or -1 to end): ");
            double grossSales = input.nextDouble();

            if (grossSales == -1) {
                break;
            }

            // Calculate total salary
            int salary = 200 + (int) (0.09 * grossSales);

            // Determine the range index and increment
            if (salary >= 1000) {
                salaryRanges[8]++;
            } else {
                int index = (salary - 200) / 100;
                if (index >= 0 && index < 8) {
                    salaryRanges[index]++;
                }
            }
        }

        // Display results
        System.out.println("\nSalary Range\t\tNumber of Salespeople");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == 8) {
                System.out.printf("$1,000 and over\t\t%d%n", salaryRanges[i]);
            } else {
                int lower = 200 + i * 100;
                int upper = lower + 99;
                System.out.printf("$%d–$%d\t\t\t%d%n", lower, upper, salaryRanges[i]);
            }
        }
    }
}