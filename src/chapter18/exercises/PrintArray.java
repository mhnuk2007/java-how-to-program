package chapter18.exercises;
/*
Exercise 18.16: (Print an Array) Write a recursive method printArray that displays all
the elements in an array of integers, separated by spaces.
 */

public class PrintArray {

    // Recursive method to print elements from index to end
    public static void printArray(int[] array, int index) {
        if (index == array.length) {
            // Base case: reached end of array, stop recursion
            return;
        }
        System.out.print(array[index] + " ");
        printArray(array, index + 1);  // Recursive call for next element
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        printArray(numbers, 0);  // Start printing from index 0
    }
}
