package chapter4.Exercises;
/*
    4.21 (Find the Largest Number) The process of finding the largest value is used
    frequently in computer applications. For example, a program that determines the
    winner of a sales contest would input the number of units sold by each salesperson.
    The salesperson who sells the most units wins the contest. Write a pseudocode program,
    then a Java application that inputs a series of 10 integers and determines and prints
     the largest integer. Your program should use at least the following three variables:
        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers
        have been input and to determine when all 10 numbers have been processed).
        b) number: The integer most recently input by the user.
        c) largest: The largest number found so far.
 */
/*
Pseudocode:
        initialize counter to 1
        intialize largest to smallest possible integer or 0
        while counter is less than or equal to 10
            prompt user to enter an integer
            Input number
            if number is greater than the largest
                set largest to number
            increment counter
        display largest

 */

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ":");
            int number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.println("The largest number is: " + largest);
    }
}
