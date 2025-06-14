package chapter19.exercises;
/*
Exercise 19.7: (Bucket Sort) A bucket sort begins with a one-dimensional array of positive integers to be
sorted and a two-dimensional array of integers with rows indexed from 0 to 9 and columns indexed
from 0 to n – 1, where n is the number of values to be sorted. Each row of the two-dimensional array is referred to as a bucket. Write a class named BucketSort containing a method called sort that operates as follows:
a) Place each value of the one-dimensional array into a row of the bucket array, based on
the value’s “ones” (rightmost) digit. For example, 97 is placed in row 7, 3 is placed in
row 3 and 100 is placed in row 0. This procedure is called a distribution pass.
b) Loop through the bucket array row by row, and copy the values back to the original array. This procedure is called a gathering pass. The new order of the preceding values in
the one-dimensional array is 100, 3 and 97.
c) Repeat this process for each subsequent digit position (tens, hundreds, thousands, etc.).
On the second (tens digit) pass, 100 is placed in row 0, 3 is placed in row 0 (because 3
has no tens digit) and 97 is placed in row 9. After the gathering pass, the order of the
values in the one-dimensional array is 100, 3 and 97. On the third (hundreds digit)
pass, 100 is placed in row 1, 3 is placed in row 0 and 97 is placed in row 0 (after the 3).
After this last gathering pass, the original array is in sorted order.
The two-dimensional array of buckets is 10 times the length of the integer array
being sorted. This sorting technique provides better performance than a bubble sort,
but requires much more memory—the bubble sort requires space for only one additional element of data. This comparison is an example of the space/time trade-off: The
bucket sort uses more memory than the bubble sort, but performs better. This version
of the bucket sort requires copying all the data back to the original array on each pass.
Another possibility is to create a second two-dimensional bucket array and repeatedly
swap the data between the two bucket arrays.
 */

import java.util.Arrays;

public class BucketSort {
    public static void sort(int[] data) {
        int max = findMax(data);
        int numDigits = getDigitCount(max);
        int n = data.length;

        // Declare the bucket: 10 rows (digits 0-9), and columns = array length
        int[][] buckets = new int[10][n];
        int[] bucketSizes = new int[10]; // keeps track of how many items are in each bucket

        int divisor = 1;

        for (int digit = 0; digit < numDigits; digit++) {
            // Reset bucket sizes for the new pass
            Arrays.fill(bucketSizes, 0);


            // Distribution pass
            for (int value : data) {
                int digitValue = (value / divisor) % 10;
                buckets[digitValue][bucketSizes[digitValue]++] = value;
            }

            // Gathering pass
            int index = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < bucketSizes[i]; j++) {
                    data[index++] = buckets[i][j];
                }
            }

            // Print the array after each digit pass
            System.out.printf("After pass %d (divisor %d): %s%n", digit + 1, divisor, Arrays.toString(data));

            divisor *= 10;
        }
    }
    // Utility to find the max element in the array
    private static int findMax(int[] data) {
        int max = data[0];
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Utility to count how many digits are in the largest number
    public static int getDigitCount(int number) {
        int digits = 0;
        while (number != 0) {
            digits++;
            number /= 10;
        }
        return digits;

    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] data = {97, 3, 100, 52, 23, 74, 19, 8, 44, 31};

        System.out.println("Unsorted array: " + Arrays.toString(data));

        sort(data);

        System.out.println("Sorted array: " + Arrays.toString(data));
    }
}
