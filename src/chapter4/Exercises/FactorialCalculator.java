package chapter4.Exercises;
/*
    4.37 (Factorial) The factorial of a nonnegative integer n is written as n!
    (pronounced “n factorial”) and is defined as follows
    n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1) and
    n! = 1 (for n = 0)
    For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
        a) Write an application that reads a nonnegative integer and computes and
        prints its factorial.
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();
        int factorial = 1;


        if(n<0){
            System.out.println("Invalid input. Please enter a nonnegative integer");
            return;
            } else if (n==0) {
            System.out.println("The factorial of 0 is 1");
            return;
        }
        while (n>0){
            factorial *= n;
            n--;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
