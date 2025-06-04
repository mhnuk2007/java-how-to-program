package chapter16.exercises;
/*
16.17 (Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts
25 random integers from 0 to 100 in order into a LinkedList object. The program should
sort the elements, then calculate the sum of the elements and the floating-point average
of the elements.
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        // Insert 25 random integers into the list
        for (int i = 0; i < 25; i++) {
            int num = random.nextInt(101); // range: 0 to 100
            insertSorted(numbers, num);
        }

        // Print sorted list
        System.out.println("Sorted LinkedList:");
        System.out.println(numbers);

        // Calculate sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
    }

    // Helper method to insert number in sorted position
    private static void insertSorted(LinkedList<Integer> list, int value) {
        int index = 0;
        while (index < list.size() && list.get(index) < value) {
            index++;
        }
        list.add(index, value);
    }
}
