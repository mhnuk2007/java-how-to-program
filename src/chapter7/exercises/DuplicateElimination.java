package chapter7.exercises;

/*
Exercise 7.12 (Duplicate Elimination)
Write an application that inputs five numbers, each between 10 and 100 inclusive.
Display each number only if it’s not a duplicate. Use the smallest array possible.
Display the complete set of unique values after each input.
*/

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 10 and 100: ");
            int number = input.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Invalid input. Please enter a number between 10 and 100.");
                continue;
            }

            // Check for duplicate
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count] = number;
                count++;
            } else {
                System.out.println("Duplicate value ignored.");
            }

            // Display unique numbers entered so far
            System.out.print("Unique numbers entered so far: ");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
