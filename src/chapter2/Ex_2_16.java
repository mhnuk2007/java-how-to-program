package chapter2;
/*
    2.16 (Comparing Integers) Write an application that asks the user to enter two
    integers, obtains them from the user and displays the larger number followed by
    the words "is larger". If the numbers are equal, print the message
    "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */

import java.util.Scanner;

public class Ex_2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println();
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
        input.close();
    }
}
