package chapter19.exercises;
/*
Exercise 19.10:
Implement a recursive sorting algorithm using the quicksort technique. The algorithm
should select the first element as the pivot, place it in its correct position in the
sorted array by partitioning, and then recursively sort the left and right subarrays.
The method should take the array, a starting index, and an ending index as arguments.
 */
import java.security.SecureRandom;
import java.util.Arrays;


public class QuickSortExample {

    // Recursive quicksort method
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);   // Left subarray
            quickSort(array, pivotIndex + 1, high); // Right subarray
        }
    }

    // Partition method based on the description in the question
    private static int partition(int[] array, int low, int high) {
        int pivot = array[low]; // first element as pivot
        int left = low + 1;
        int right = high;

        while (true) {
            // Move from right to left looking for element < pivot
            while (right >= left && array[right] >= pivot) {
                right--;
            }

            // Move from left to right looking for element > pivot
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            if (left > right) {
                break; // Pointers have crossed
            }

            // Swap array[left] and array[right]
            swap(array, left, right);
        }

        // Swap pivot with array[right] (its final position)
        swap(array, low, right);
        return right; // Return final pivot position
    }

    // Utility method to swap elements
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test quicksort
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] data = new int[10];

        // Populate array with random integers from 10 to 99
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + random.nextInt(90);
        }

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(data));

        // Perform quicksort
        quickSort(data, 0, data.length - 1);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(data));
    }
}
