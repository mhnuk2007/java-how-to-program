package chapter2;
/*
    2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers
    and determines and prints the number of negative numbers input, the number of
    positive numbers input and the number of zeros input.
 */

import java.util.Scanner;

public class Ex_2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        num4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        num5 = input.nextInt();

        // Check num1
        if (num1 > 0)
            positiveCount++;
        else if (num1 < 0)
            negativeCount++;
        else
            zeroCount++;

        // Check num2
        if (num2 > 0)
            positiveCount++;
        else if (num2 < 0)
            negativeCount++;
        else
            zeroCount++;

        // Check num3
        if (num3 > 0)
            positiveCount++;
        else if (num3 < 0)
            negativeCount++;
        else
            zeroCount++;

        // Check num4
        if (num4 > 0)
            positiveCount++;
        else if (num4 < 0)
            negativeCount++;
        else
            zeroCount++;

        // Check num5
        if (num5 > 0)
            positiveCount++;
        else if (num5 < 0)
            negativeCount++;
        else
            zeroCount++;

        // Print the results
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}
