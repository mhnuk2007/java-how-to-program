package chapter6.exercises;

/*
    6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
    whether an integer is even. The method should take an integer argument and return true if the integer is even and false otherwise.
    Incorporate this method into an application that inputs a sequence of integers (one at a time) and determines whether each is even or odd.
 */

import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or 0 to exit): ");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.println(
                    isEven(number)
                            ? number + " is even."
                            : number + " is odd."
            );
            System.out.println(); // Extra line for better readability
        }

        input.close();
    }

    // Method to determine if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
