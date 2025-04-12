package chapter4.Exercises;
/*
    4.23 (Find the Two Largest Numbers) Using an approach similar to that for
    Exercise 4.21, find the two largest values of the 10 values entered.
    [Note: You may input each number only once.]
 */

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ":");
            int number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
            counter++;
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}

