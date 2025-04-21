package chapter5.exercises;
/*
    5.16 (Bar Chart Printing Program) One interesting application of computers is to
    display graphs and bar charts. Write an application that reads five numbers between 1
    and 30. For each number that’s read, your program should display the same number of
    adjacent asterisks. For example, if your program reads the number 7, it should
    display *******. Display the bars of asterisks after you read all five numbers.
 */

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers between 1 and 30: ");

        for (int i = 1; i <= 5; i++) {
            int number = input.nextInt();
            if (number < 1 || number > 30) {
                System.out.println("Invalid input. Please enter a number between 1 and 30.");
                i--;
            } else {
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        input.close();
    }
}
