package chapter19.examples;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {

    // sort array using selection sort
    public static void selectionSort(int[] data) {

        // loop over data.length - 1 elements
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i; // first index of remaining array

            // loop to find index of smallest element
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[smallest]) {
                    smallest = index;
                }
            }

            // swap smallest element into position
            swap(data, i, smallest);

            // output pass of algorithm
            printPass(data, i + 1, i, smallest);
        }
    }

    // helper method to swap values in two elements
    public static void swap(int[] data, int first, int second) {
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    // print a pass of the algorithm
    public static void printPass(int[] data, int pass, int index, int smallest) {
        System.out.printf("After pass %2d: ", pass);

        // output elements
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                System.out.printf("%d* ", data[i]); // indicate swapped position
            } else {
                System.out.printf("%d ", data[i]);
            }
        }

        System.out.printf("%n             "); // alignment

        // indicate amount of array that's sorted
        for (int j = 0; j < pass; j++) {
            System.out.print("-- ");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));

        selectionSort(data); // sort array
        System.out.printf("Sorted array:%n%s%n", Arrays.toString(data));
    }
}
