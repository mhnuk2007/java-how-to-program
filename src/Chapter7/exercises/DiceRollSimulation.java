package Chapter7.exercises;
/*
Exercise: 7.17 (Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
 */

import java.security.SecureRandom;

public class DiceRollSimulation {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom(); // Secure version of Random

        int rolls = 36_000_000; // Total number of rolls
        int[] sumFrequencies = new int[13]; // Index 2–12 will be used to count sums

        // Simulate rolling two dice for the specified number of rolls
        for (int i = 0; i < rolls; i++) {
            int die1 = 1 + random.nextInt(6); // Roll die 1 (values 1 to 6)
            int die2 = 1 + random.nextInt(6); // Roll die 2 (values 1 to 6)
            int sum = die1 + die2;           // Calculate the sum (2 to 12)

            sumFrequencies[sum]++;           // Increment frequency counter for this sum
        }

        // Display the frequencies in a table format
        System.out.printf("%-5s %10s%n", "Sum", "Frequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%-5d %10d%n", sum, sumFrequencies[sum]);
        }
    }
}