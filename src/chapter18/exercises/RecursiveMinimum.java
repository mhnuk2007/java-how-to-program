package chapter18.exercises;
/*
Exercise 18.18: (Find the Minimum Value in an Array) Write a recursive method recursiveMinimum that
determines the smallest element in an array of integers. The method should return when it receives
an array of one element.
 */

public class RecursiveMinimum {

    // Recursive method to find the minimum element in the array
    public static int recursiveMinimum(int[] array, int size) {
        if (size == 1) {
            // Base case: array has one element, so return it
            return array[0];
        } else {
            // Recursively find the minimum in the first size-1 elements
            int min = recursiveMinimum(array, size - 1);
            // Compare last element with the minimum found so far
            return (array[size - 1] < min) ? array[size - 1] : min;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 5, 1, 9, 7, 2};

        int minValue = recursiveMinimum(numbers, numbers.length);
        System.out.printf("The minimum value in the array is: %d%n", minValue);
    }
}
