package chapter7.examples;

import java.util.Arrays;

// Fig. 7.22: ArrayManipulations.java
// Arrays class methods and System.arraycopy.
public class ArrayManipulations {
    public static void main(String[] args) {
        // sort doubleArray into ascending order
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        System.out.print("Before sort: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }
        System.out.println();
        Arrays.sort(doubleArray);
        System.out.print("After sort: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }
        System.out.println();

        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        System.out.println("Before fill:");
        for (int value : filledIntArray) {
            System.out.printf("%d ", value);
        }
        System.out.println();
        Arrays.fill(filledIntArray, 7);
        System.out.println("After fill:");
        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray into array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        // compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        // search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }

    // output values in each array
    private static void displayArray(int[] array, String description) {
        System.out.printf("%s: ", description);
        for (int value : array) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }
} //end class ArrayManipulations
