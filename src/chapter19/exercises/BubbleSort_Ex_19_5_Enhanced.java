package chapter19.exercises;
/*
Exercise 19.6: (Enhanced Bubble Sort) Make the following simple modifications to improve the performance of the bubble sort you developed in Exercise 19.5:
a) After the first pass, the largest number is guaranteed to be in the highest-numbered array
element; after the second pass, the two highest numbers are “in place”; and so on. Instead of making nine comparisons on every pass for a ten-element array, modify the
bubble sort to make eight comparisons on the second pass, seven on the third pass, and
so on.
b) The data in the array may already be in proper or near-proper order, so why make nine
passes if fewer will suffice? Modify the sort to check at the end of each pass whether any
swaps have been made. If there were none, the data must already be sorted, so the program should terminate. If swaps have been made, at least one more pass is needed.
 */

public class BubbleSort_Ex_19_5_Enhanced {
    // Enhanced Bubble Sort Method
    public static void bubbleSort(int[] data) {
        int size = data.length;

        // Outer loop for each pass
        for (int pass = 1; pass < size; pass++) {
            boolean swapped = false; // Track if any swaps are made this pass

            // Only compare up to the last unsorted element
            for (int i = 0; i < size - pass; i++) {
                if (data[i] > data[i + 1]) {
                    // Swap if elements are in wrong order
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }

            // Print array state after each pass
            System.out.printf("After pass %2d: %s%n", pass, java.util.Arrays.toString(data));

            // If no swaps occurred, array is sorted early
            if (!swapped) {
                System.out.println("Array already sorted. Terminating early.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90}; // Sample data
        System.out.println("Unsorted array: " + java.util.Arrays.toString(numbers));

        bubbleSort(numbers); // Perform enhanced bubble sort

        System.out.println("Sorted array:   " + java.util.Arrays.toString(numbers));
    }
}
