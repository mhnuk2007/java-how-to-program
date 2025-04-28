package Chapter7.examples;

// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.

public class InitArray {
    public static void main(String[] args) {
        // declare a variable 'array' and initialize it with an array object of size 10
        int[] array = new int[10]; // all elements are automatically initialized to 0

        // display column headings
        System.out.printf("%s%8s%n", "Index", "Value");

        // output each array element's index and its corresponding value
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    } // end main
} // end class InitArray
