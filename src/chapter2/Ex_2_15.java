/*
    (Arithmetic) Write an application that asks the user to enter two integers,
    obtains them from the user and prints their sum, product, difference and quotient
    (division). Use the techniques
shown in Fig. 2.7
 */

package chapter2;

import java.util.Scanner;

public class Ex_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);

        input.close();
    }
}
