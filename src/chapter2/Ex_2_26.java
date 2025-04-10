package chapter2;
/*
    2.26 (Multiples) Write an application that reads two integers, determines whether
    the first is a multiple of the second and prints the result. [Hint: Use the
    remainder operator.]
 */

import java.util.Scanner;

public class Ex_2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
        input.close();

    }
}
