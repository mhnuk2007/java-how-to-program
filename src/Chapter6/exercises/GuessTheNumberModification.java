package Chapter6.exercises;

/*
    6.31 (Guess the Number Modification) Modify the program of Exercise 6.30 to count the
    number of guesses the player makes. If the number is 10 or fewer, display Either you
    know the secret or you got lucky! If the player guesses the number in 10 tries, display
    Aha! You know the secret! If the player makes more than 10 guesses, display You should
    be able to do better! Why should it take no more than 10 guesses? Well, with each
    “good guess,” the player should be able to eliminate half of the numbers, then half
    of the remaining numbers, and so on.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = 1 + random.nextInt(1000); // Generate a random number between 1 and 1000
            System.out.println("I'm thinking of a number between 1 and 1000.");
            System.out.print("Try to guess it: ");

            int guess = -1; // Initialize guess to an invalid value
            int tries = 0;

            // Loop until the user guesses correctly
            while (guess != numberToGuess) {
                // Ensure valid input
                while (!input.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    input.next(); // Consume invalid input
                }

                guess = input.nextInt();
                tries++;

                // Check if the guess is too high, too low, or correct
                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                }
            }

            // When the guess is correct
            System.out.println("Congratulations! You guessed the number!");

            // Provide feedback on the number of tries
            if (tries <= 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else {
                System.out.println("You should be able to do better!");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false; // Exit the loop if the user doesn't want to play again
            }
        }

        // Close the scanner to prevent resource leaks
        input.close();
        System.out.println("Thank you for playing! Goodbye!");
    }
}
