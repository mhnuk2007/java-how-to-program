package chapter7.exercises;
/*
Exercise: 7.11 Write statements that perform the following one-dimensional-array operations:
a) Set the 10 elements of integer array counts to zero.
b) Add one to each of the 15 elements of integer array bonus.
c) Display the five values of integer array bestScores in column format.
 */

public class ArrayOperations {
    public static void main(String[] args) {
        // Part (a) - Set the 10 elements of integer array counts to zero
        int[] counts = new int[10]; // Creating an array of 10 integers

        // Set each element of the array to zero (already initialized to zero by default)
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // Part (b) - Add one to each of the 15 elements of integer array bonus
        int[] bonus = new int[15]; // Creating an array of 15 integers

        // Add 1 to each element in the array
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1; // or bonus[i] = bonus[i] + 1;
        }

        // Part (c) - Display the five values of integer array bestScores in column format
        int[] bestScores = {85, 92, 75, 88, 99}; // Example array with 5 elements

        // Display each score in a new line (column format)
        System.out.println("The values of bestScores in column format:");
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);
        }
    }
}