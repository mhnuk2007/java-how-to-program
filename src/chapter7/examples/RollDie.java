package chapter7.examples;

// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch.

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom(); // Secure random number generator
        int[] frequency = new int[7]; // Array of frequency counters (index 1–6 used)

        // Roll the die 6,000,000 times
        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + randomNumbers.nextInt(6); // Generate number from 1 to 6
            ++frequency[face]; // Increment corresponding frequency index
        }

        // Print table header
        System.out.printf("%s%10s%n", "Face", "Frequency");

        // Output each face and its frequency
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
} // end class RollDie
