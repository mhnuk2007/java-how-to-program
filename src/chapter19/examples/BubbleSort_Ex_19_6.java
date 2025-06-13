package chapter19.examples;
/*
Exercise 19.5: (Bubble Sort) Implement bubble sort—another simple yet inefficient sorting technique. It’s
called bubble sort or sinking sort because smaller values gradually “bubble” their way to the top of
the array (i.e., toward the first element) like air bubbles rising in water, while the larger values sink
to the bottom (end) of the array. The technique uses nested loops to make several passes through
the array. Each pass compares successive pairs of elements. If a pair is in increasing order (or the
values are equal), the bubble sort leaves the values as they are. If a pair is in decreasing order, the
bubble sort swaps their values in the array. The first pass compares the first two elements of the array
and swaps their values if necessary. It then compares the second and third elements in the array. The
end of this pass compares the last two elements in the array and swaps them if necessary. After one
pass, the largest element will be in the last index. After two passes, the largest two elements will be
in the last two indices. Explain why bubble sort is an O(n2) algorithm.
 */

public class BubbleSort_Ex_19_6 {
    // Bubble sort method
    public static void bubbleSort(int[] data) {
        int size = data.length;

        // Outer loop for passes
        for (int pass = 1; pass < size; pass++) {
            // Inner loop for pairwise comparisons
            for (int i = 0; i < size - pass; i++) {
                if (data[i] > data[i + 1]) {
                    // Swap if out of order
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
            // Print array after each pass (for demonstration)
            System.out.printf("After pass %2d: %s%n", pass, java.util.Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array: " + java.util.Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));


    }
}