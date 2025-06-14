package chapter19.exercises;
/*
Exercise 19.8: 19.8 (Recursive Linear Search) Modify Fig. 19.2 to use recursive method recursiveLinearSearch to perform a linear search of the array. The method should receive the search key and
starting index as arguments. If the search key is found, return its index in the array; otherwise, return
–1. Each call to the recursive method should check one index in the array.
 */

// Fig. 19.2 (Modified): LinearSearchTest.java
// Recursive linear search implementation.

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {

    // Recursive method to perform a linear search
    public static int recursiveLinearSearch(int[] data, int searchKey, int index) {
        // base case: reached end of array without finding key
        if (index >= data.length) {
            return -1;
        }

        // if the element at current index matches the search key
        if (data[index] == searchKey) {
            return index;
        }

        // recursive call to search the next index
        return recursiveLinearSearch(data, searchKey, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // create array

        // populate array with random values from 10 to 99
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("Array: %s%n%n", Arrays.toString(data)); // display array

        // get input from user
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchKey = input.nextInt();

        // loop until the user enters -1
        while (searchKey != -1) {
            // perform recursive linear search starting from index 0
            int position = recursiveLinearSearch(data, searchKey, 0);

            if (position == -1) {
                System.out.printf("%d was not found.%n%n", searchKey);
            } else {
                System.out.printf("%d was found at index %d.%n%n", searchKey, position);
            }

            // ask for next search key
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchKey = input.nextInt();
        }

        input.close();
    }
}
