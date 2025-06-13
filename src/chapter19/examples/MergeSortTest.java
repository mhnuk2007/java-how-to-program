package chapter19.examples;

// MergeSortTest.java
// Sorting an array using merge sort with detailed output of the steps.

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest {

    // Initiates merge sort on the array
    public static void mergeSort(int[] data) {
        sortArray(data, 0, data.length - 1);
    }

    // Recursively splits and sorts subarrays, then merges them
    private static void sortArray(int[] data, int low, int high) {
        if (high - low >= 1) { // base case: 1 element
            int middle1 = (low + high) / 2;
            int middle2 = middle1 + 1;

            // Output split step
            System.out.printf("split: %s%n", subarrayString(data, low, high));
            System.out.printf("     : %s%n", subarrayString(data, low, middle1));
            System.out.printf("     : %s%n", subarrayString(data, middle2, high));

            // Recursive calls to sort both halves
            sortArray(data, low, middle1);
            sortArray(data, middle2, high);

            // Merge the sorted halves
            merge(data, low, middle1, middle2, high);
        }
    }

    // Merges two sorted subarrays into one
    private static void merge(int[] data, int left, int middle1, int middle2, int right) {
        int[] combined = new int[data.length]; // Temporary array
        int leftIndex = left;
        int rightIndex = middle2;
        int combinedIndex = left;

        // Output merging step
        System.out.printf("merge: %s%n", subarrayString(data, left, middle1));
        System.out.printf("merge: %s%n", subarrayString(data, middle2, right));

        // Merge the two halves into combined[]
        while (leftIndex <= middle1 && rightIndex <= right) {
            if (data[leftIndex] < data[rightIndex]) {
                combined[combinedIndex++] = data[leftIndex++];
            } else {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }

        // Copy any remaining elements from the left half
        while (leftIndex <= middle1) {
            combined[combinedIndex++] = data[leftIndex++];
        }

        // Copy any remaining elements from the right half
        while (rightIndex <= right) {
            combined[combinedIndex++] = data[rightIndex++];
        }

        // Copy combined[] back into original data[]
        for (int i = left; i <= right; i++) {
            data[i] = combined[i];
        }

        // Output merged result
        System.out.printf("      %s%n%n", subarrayString(data, left, right));
    }

    // Returns a string of a subarray, formatted and aligned
    private static String subarrayString(int[] data, int low, int high) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < low; i++) {
            builder.append("      "); // Align with empty spaces
        }

        for (int i = low; i <= high; i++) {
            builder.append(String.format("%4d  ", data[i]));
        }

        return builder.toString();
    }

    // Main method to demonstrate merge sort
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = new int[10];

        // Fill the array with random integers between 10 and 99
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));

        mergeSort(data); // Sort the array

        System.out.printf("Sorted array:%n%s%n", Arrays.toString(data));
    }
} // end class MergeSortTest
