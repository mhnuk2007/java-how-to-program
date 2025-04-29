package Chapter7.examples;

// Fig. 7.4: InitArray.java
// Calculating the values to be placed into the elements of an array.

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // constant to define array size

        // declare and create an array of 10 integers
        int[] array = new int[ARRAY_LENGTH];

        // assign values to array: each element is 2 + 2 * its index
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        // display column headings
        System.out.printf("%s%8s%n", "Index", "Value");

        // display index and corresponding value of each array element
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
} // end class InitArray
