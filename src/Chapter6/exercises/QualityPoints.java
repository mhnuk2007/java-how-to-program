package Chapter6.exercises;
/*
    6.28 Write a method qualityPoints that inputs a student’s average and returns 4 if
    it’s 90–100, 3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate
    the method into an application that reads a value from the user and displays the result.
 */

import java.util.Scanner;

public class QualityPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the student's average score
        System.out.print("Enter the student's average score: ");
        double averageScore = input.nextDouble();

        // Call the qualityPoints method and display the result
        int points = qualityPoints(averageScore);
        System.out.println("The quality points for the average score " + averageScore + " is: " + points);

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // Method to calculate quality points based on average score
    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) {
            return 4; // Grade point for scores between 90 and 100
        } else if (average >= 80 && average < 90) {
            return 3; // Grade point for scores between 80 and 89
        } else if (average >= 70 && average < 80) {
            return 2; // Grade point for scores between 70 and 79
        } else if (average >= 60 && average < 70) {
            return 1; // Grade point for scores between 60 and 69
        } else {
            return 0; // Grade point for scores below 60
        }
    }
}
