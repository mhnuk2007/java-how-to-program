package chapter19.examples;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    // perform a binary search on the data
    public static int binarySearch(int[] data, int key) {
        int low = 0;  // low end of the search area
        int high = data.length - 1;  // high end of the search area
        int middle = (low + high) / 2; // middle element
        int location = -1;  // return value; -1 if not found

        do {
            // print current range of elements
            System.out.println(remainingElements(data, low, high));

            // print a line with '*' aligned under the middle element
            for (int i = 0; i < middle; i++) {
                System.out.print("    "); // 4 spaces for alignment (same as %4d)
            }
            System.out.println("   *"); // aligned asterisk

            if (key == data[middle]) {
                location = middle; // match found
            } else if (key < data[middle]) {
                high = middle - 1; // search lower half
            } else {
                low = middle + 1; // search upper half
            }
            middle = (low + high + 1) / 2; // recalculate middle
        } while (low <= high && location == -1);

        return location;
    }

    // method to output a slice of the array
    public static String remainingElements(int[] data, int low, int high) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < low; i++) {
            temp.append("    "); // skip elements not in current range
        }

        for (int i = low; i <= high; i++) {
            temp.append(String.format("%4d", data[i])); // format with fixed width
        }

        return String.format("%s%n", temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[15]; // create array

        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        Arrays.sort(data); // sort array for binary search

        System.out.printf("Sorted Array: %n%s%n%n", Arrays.toString(data));

        // prompt user
        System.out.print("Please enter an integer to search (-1 to quit): ");
        int searchInt = input.nextInt();

        while (searchInt != -1) {
            int location = binarySearch(data, searchInt);
            if (location == -1) {
                System.out.printf("%d was not found.%n%n", searchInt);
            } else {
                System.out.printf("%d was found at index %d.%n%n", searchInt, location);
            }

            System.out.print("Please enter an integer to search (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
