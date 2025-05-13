package chapter6.exercises;
/*
    6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
    computer-assisted instruction systems monitor the student’s performance over a period
    of time. The decision to begin a new topic is often based on the student’s success with
    previous topics. Modify the program of Exercise 6.36 to count the number of correct and
    incorrect responses typed by the student. After the student types 10 answers, your
    program should calculate the percentage that are correct. If the percentage is lower
    than 75%, display "Please ask your teacher for extra help.", then reset the program
    so another student can try it. If the percentage is 75% or higher, display
    "Congratulations, you are ready to go to the next level!", then reset the program so
    another student can try it.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionEx_6_37 {
    public static void main(String[] args) {
        // Create a SecureRandom object for generating random numbers
        SecureRandom random = new SecureRandom();
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Start an infinite loop to allow multiple students to try
        while (true) {
            // Call the askQuestion method to display and check the question
            askQuestion(random, input);

            // Ask the user if they want to try another student
            System.out.print("Do you want to try again for a new student? (yes/no): ");
            String response = input.next();

            // If the user answers "no", exit the loop and end the program
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Thank you for practicing! Goodbye.");
                break; // Exit the outer loop to end the program
            }
        }
        // Close the Scanner object to free up resources
        input.close();
    }

    // Method to ask the multiplication question
    private static void askQuestion(SecureRandom random, Scanner input) {
        // Variables to track the number of correct and incorrect answers
        int correctCount = 0;
        int incorrectCount = 0;

        // Start a loop to ask questions 10 times
        for (int i = 0; i < 10; i++) {
            // Generate two random one-digit integers
            int num1 = 1 + random.nextInt(9); // Random number between 1 and 9
            int num2 = 1 + random.nextInt(9); // Random number between 1 and 9

            // Display the multiplication question to the user
            System.out.printf("How much is %d times %d? ", num1, num2);

            // Start a loop to ask the user for an answer until it's correct
            while (true) {
                int answer = input.nextInt(); // Get the user's answer

                // Check if the answer is correct
                if (answer == num1 * num2) {
                    // Randomly choose a response for a correct answer
                    int response = 1 + random.nextInt(4);
                    switch (response) {
                        case 1:
                            System.out.println("Very good!");
                            break;
                        case 2:
                            System.out.println("Excellent!");
                            break;
                        case 3:
                            System.out.println("Nice work!");
                            break;
                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    correctCount++; // Increment correct answer count
                    break; // Exit the loop to ask another question
                } else {
                    // Randomly choose a response for an incorrect answer
                    int response = 1 + random.nextInt(4);
                    switch (response) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 3:
                            System.out.println("Don't give up!");
                            break;
                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                    }
                    incorrectCount++; // Increment incorrect answer count
                }
            }
        }

        // Calculate the percentage of correct answers
        double percentageCorrect = (double) correctCount / 10 * 100;

        // Display the result based on the performance
        if (percentageCorrect >= 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
