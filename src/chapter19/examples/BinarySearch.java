package chapter19.examples;

import java.util.Arrays;

public class BinarySearch {

    // Manual binary search implementation
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 10, 30, 34, 51, 52, 56, 77, 93}; // Already sorted array
        int key = 51;

        // Using custom binary search
        int result = binarySearch(data, key);
        if (result != -1) {
            System.out.println("Custom Binary Search: Element found at index: " + result);
        } else {
            System.out.println("Custom Binary Search: Element not found");
        }

        // Using Java built-in binary search
        int index = Arrays.binarySearch(data, key);
        if (index >= 0) {
            System.out.println("Arrays.binarySearch: Element found at index: " + index);
        } else {
            System.out.println("Arrays.binarySearch: Element not found");
        }
    }
}
