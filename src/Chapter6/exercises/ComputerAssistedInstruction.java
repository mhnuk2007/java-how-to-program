package Chapter6.exercises;
/*
    6.35 (Computer-Assisted Instruction) The use of computers in education is referred to
    as computer-assisted instruction (CAI). Write a program that will help an elementary
    school student learn multiplication. Use a SecureRandom object to produce two positive
    one-digit integers. The program should then prompt the user with a question, such as
    How much is 6 times 7?
    The student then inputs the answer. Next, the program checks the student’s answer. If
    it’s correct, display the message "Very good!" and ask another multiplication question.
    If the answer is wrong, display the message "No. Please try again." and let the student
    try the same question repeatedly until the student finally gets it right. A separate
    method should be used to generate each new question. This method should be called once
    when the application begins execution and each time the user answers the question
    correctly.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

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
            int answer = input.nextInt(); // Get the user's answer

            // Check if the answer is correct
            if (answer == num1 * num2) {
                System.out.println("Very good!"); // If correct, congratulate the user
                break; // Exit the loop to ask another question
            } else {
                System.out.println("No. Please try again."); // If incorrect, ask to try again
            }
        }
    }
}
