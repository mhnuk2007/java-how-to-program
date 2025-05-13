package chapter6.examples;
// Fig. 6.7: RollDie.java
// Roll a six-sided die 6,000,000 times.

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        // Create a SecureRandom object for generating random numbers
        SecureRandom randomNumbers = new SecureRandom();
        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        // tally count for 6,000,000 rolls of die
        for (int roll = 1; roll <= 6000000; roll++) {
            // generate a random number between 1 and 6
            int face = 1 + randomNumbers.nextInt(6);
            // determine face value and increment appropriate counter
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);

    }
}
