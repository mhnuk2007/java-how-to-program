package chapter19.examples;
// Fig. 19.5: InsertionSortTest.java
// Sorting an array with insertion sort.

import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest {
    // sort array using insertion sort
    public static void insertionSort(int[] data) {
        // loop over data.length - 1 elements
        for (int next = 1; next < data.length; next++) {
            int insert = data[next]; // value to insert
            int moveItem = next; // location to place element

            // search for place to put current element
            while (moveItem > 0 && data[moveItem - 1] > insert) {
                // shift element one slot to the right
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }
            // place inserted element
            data[moveItem] = insert;
            // output pass of algorithm
            printPass(data, next, moveItem);

        }


    }

    // print a pass of the algorithm
    public static void printPass(int[] data, int pass, int index) {

        // output elements till swapped item
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                System.out.printf("%d* ", data[i]); // indicate swapped item
            }
        }
        System.out.printf("%d* ", data[index]); // indicate swap

        // finish outputting array
        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.printf("%n "); // for alignment

        // indicate amount of array that’s sorted
        for (int i = 0; i <= pass; i++)
            System.out.print("-- ");
        System.out.println();
    }

    public static void main(String[] args)
 {
         SecureRandom generator = new SecureRandom();

         int[] data = new int[10]; // create array

         for (int i = 0; i < data.length; i++) {// populate array
             data[i] = 10 + generator.nextInt(90);
         }
         System.out.printf("Unsorted array:%n%s%n%n",
                 Arrays.toString(data)); // display array


         System.out.printf("Sorted array:%n%s%n%n",
                 Arrays.toString(data)); // display array
         }
 } // end class InsertionSortTest