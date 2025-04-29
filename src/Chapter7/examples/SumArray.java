package Chapter7.examples;

// Fig. 7.5: SumArray.java
// Computing the sum of the elements of an array.

public class SumArray {
    public static void main(String[] args) {
        // declare and initialize the array with 10 integers
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int total = 0; // variable to store the sum of array elements

        // add each element's value to total
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        // display the total sum
        System.out.printf("Total of array elements: %d%n", total);
    }
} // end class SumArray
