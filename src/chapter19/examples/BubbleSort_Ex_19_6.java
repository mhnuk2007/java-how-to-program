package chapter19.examples;

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