package chapter6.exercises;
/*
    6.36 (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI
    environments is student fatigue. This can be reduced by varying the computer’s
    responses to hold the student’s attention. Modify the program of Exercise 6.35 so
    that various comments are displayed for each answer as follows:
    Possible responses to a correct answer:
        Very good!
        Excellent!
        Nice work!
        Keep up the good work!
    Possible responses to an incorrect answer:
        No. Please try again.
        Wrong. Try once more.
        Don't give up!
        No. Keep trying.
    Use random-number generation to choose a number from 1 to 4 that will be used to select
    one of the four appropriate responses to each correct or incorrect answer. Use a switch
    statement to issue the responses.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionEx_6_36 {
    public static void main(String[] args) {
        // Create a SecureRandom object for generating random numbers
        SecureRandom random = new SecureRandom();
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Start an infinite loop to ask questions until the user opts out
        while (true) {
            // Call the askQuestion method to display and check the question
            askQuestion(random, input);

            // Ask the user if they want to try another question
            System.out.print("Do you want to try another question? (yes/no): ");
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
        // Generate two random one-digit integers
        int num1 = 1 + random.nextInt(9); // Random number between 1 and 9
        int num2 = 1 + random.nextInt(9); // Random number between 1 and 9

        // Display the multiplication question to the user
        System.out.printf("How much is %d times %d? ", num1, num2);

        // Start a loop to ask the user for an answer until it's correct
        while (true) {
            // Ensure valid integer input
            if (input.hasNextInt()) {
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
                }
            } else {
                // Handle invalid input (not an integer)
                System.out.println("Please enter a valid integer.");
                input.next(); // Clear the invalid input
            }
        }
    }
}
