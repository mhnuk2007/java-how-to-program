package chapter19.examples;

import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSortTest {
    // Sort array using Bubble Sort
    public static void bubbleSort(int[] data) {
        int size = data.length;

        for (int i = 1; i < size; i++) {
            // Outer loop: number of passes
            boolean swapped = false;
            for (int j = 0; j < size-i; j++) {
                // Swap if out of order
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    swapped = true;
                }

            }
            // Print current pass
            System.out.printf("After pass %2d: %s%n", i, Arrays.toString(data));
            // Optimization: Stop if already sorted
            if (!swapped) {
                break;
            }


        }
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + random.nextInt(90);
        }

            System.out.printf("Unsorted array: %s%n%n", Arrays.toString(data));
            // Sort the array
            bubbleSort(data);
            System.out.printf("Sorted array: %s%n", Arrays.toString(data));

        }

    }

