package chapter19.exercises;
/*
Exercise 19.9: (Recursive Binary Search)
Modify Fig. 19.3 to use recursive method recursiveBinarySearch to perform a binary search of the array.
*/

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearchTest {

    // Recursive method for binary search
    public static int recursiveBinarySearch(int[] data, int key, int low, int high) {
        if (low > high) {
            return -1; // base case: key not found
        }

        int middle = (low + high) / 2;

        // Display the current range and marker
        System.out.println(remainingElements(data, low, high));
        for (int i = 0; i < middle; i++) {
            System.out.print("    ");
        }
        System.out.println("   *");

        if (key == data[middle]) {
            return middle; // base case: key found
        } else if (key < data[middle]) {
            return recursiveBinarySearch(data, key, low, middle - 1); // search left half
        } else {
            return recursiveBinarySearch(data, key, middle + 1, high); // search right half
        }
    }

    // Format and return current segment of the array
    public static String remainingElements(int[] data, int low, int high) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < low; i++) {
            temp.append("    ");
        }

        for (int i = low; i <= high; i++) {
            temp.append(String.format("%4d", data[i]));
        }

        return String.format("%s%n", temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[15];

        // Populate and sort the array
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90); // 10–99
        }

        Arrays.sort(data);

        System.out.printf("Sorted Array:%n%s%n%n", Arrays.toString(data));

        System.out.print("Please enter an integer to search (-1 to quit): ");
        int searchKey = input.nextInt();

        while (searchKey != -1) {
            int location = recursiveBinarySearch(data, searchKey, 0, data.length - 1);
            if (location == -1) {
                System.out.printf("%d was not found.%n%n", searchKey);
            } else {
                System.out.printf("%d was found at index %d.%n%n", searchKey, location);
            }

            System.out.print("Please enter an integer to search (-1 to quit): ");
            searchKey = input.nextInt();
        }

        input.close();
    }
}
