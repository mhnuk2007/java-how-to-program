package chapter6.examples;
// Fig. 6.6: RandomIntegers.java
// Shifted and scaled random integers using SecureRandom.

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        // Create a SecureRandom object for generating random numbers
        SecureRandom randomNumbers = new SecureRandom();

        // Loop 20 times to simulate rolling a six-sided die
        for (int counter = 1; counter <= 20; counter++) {

            // Generate a random number between 1 and 6
            int face = 1 + randomNumbers.nextInt(6);

            // Display the random number
            System.out.printf("%d ", face);

            // Start a new line after every 5 numbers
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
