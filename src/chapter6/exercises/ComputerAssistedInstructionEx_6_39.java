package chapter6.exercises;
/*
    6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program
    of Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An
    option of 1 means addition problems only, 2 means subtraction problems only, 3 means
    multiplication problems only, 4 means division problems only and 5 means a random
    mixture of all these types.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionEx_6_39 {
    public static void main(String[] args) {
        // Create a SecureRandom object for generating random numbers
        SecureRandom random = new SecureRandom();
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input the difficulty level
        System.out.print("Enter the difficulty level (1 = single-digit, 2 = two-digit, 3 = three-digit, ...): ");
        int difficultyLevel = input.nextInt();

        // Ask the user to select the type of problem
        System.out.println("Select the type of problem to study:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Random mixture of all");
        System.out.print("Enter your choice (1-5): ");
        int problemType = input.nextInt();

        // Start an infinite loop to allow multiple students to try
        while (true) {
            // Call the askQuestion method to display and check the question
            askQuestion(random, input, difficultyLevel, problemType);

            // Ask the user if they want to try again for a new student
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

    // Method to ask the arithmetic question
    private static void askQuestion(SecureRandom random, Scanner input, int difficultyLevel, int problemType) {
        // Variables to track the number of correct and incorrect answers
        int correctCount = 0;
        int incorrectCount = 0;

        // Start a loop to ask questions 10 times
        for (int i = 0; i < 10; i++) {
            // Calculate the upper limit based on the difficulty level
            int upperLimit = (int) Math.pow(10, difficultyLevel) - 1;

            // Generate two random integers based on the difficulty level
            int num1 = 1 + random.nextInt(upperLimit); // Random number within difficulty range
            int num2 = 1 + random.nextInt(upperLimit); // Random number within difficulty range

            int correctAnswer = 0;
            String operator = "";

            // Based on the problem type, generate the correct answer and operator
            switch (problemType) {
                case 1: // Addition
                    correctAnswer = num1 + num2;
                    operator = "+";
                    break;
                case 2: // Subtraction
                    correctAnswer = num1 - num2;
                    operator = "-";
                    break;
                case 3: // Multiplication
                    correctAnswer = num1 * num2;
                    operator = "*";
                    break;
                case 4: // Division (ensure num2 is not zero)
                    while (num2 == 0) {
                        num2 = 1 + random.nextInt(upperLimit); // Regenerate num2 if zero
                    }
                    correctAnswer = num1 / num2;
                    operator = "/";
                    break;
                case 5: // Random mixture
                    int operationChoice = 1 + random.nextInt(4);
                    switch (operationChoice) {
                        case 1: // Addition
                            correctAnswer = num1 + num2;
                            operator = "+";
                            break;
                        case 2: // Subtraction
                            correctAnswer = num1 - num2;
                            operator = "-";
                            break;
                        case 3: // Multiplication
                            correctAnswer = num1 * num2;
                            operator = "*";
                            break;
                        case 4: // Division (ensure num2 is not zero)
                            while (num2 == 0) {
                                num2 = 1 + random.nextInt(upperLimit); // Regenerate num2 if zero
                            }
                            correctAnswer = num1 / num2;
                            operator = "/";
                            break;
                    }
                    break;
            }

            // Display the arithmetic question to the user
            System.out.printf("How much is %d %s %d? ", num1, operator, num2);

            // Start a loop to ask the user for an answer until it's correct
            while (true) {
                int answer = input.nextInt(); // Get the user's answer

                // Check if the answer is correct
                if (answer == correctAnswer) {
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
