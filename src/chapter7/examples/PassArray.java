package chapter7.examples;
// Fig. 7.13: PassArray.java
// Passing arrays and individual array elements to methods.

public class PassArray {
    // main creates array and calls modifyArray and modifyElement
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");

        // output original array elements
        for (int value : array)
            System.out.printf(" %d", value);

        // modify the array by reference
        modifyArray(array);
        System.out.printf("%n%nThe values of the modified array are:%n");

        // output modified array elements
        for (int value : array)
            System.out.printf(" %d", value);

        // demonstrate passing a single element (by value)
        System.out.printf("%n%nEffects of passing array element value:%n" +
                "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]); // attempt to modify array[3]

        System.out.printf("array[3] after modifyElement: %d%n", array[3]);
    }

    // multiply each element of an array by 2
    public static void modifyArray(int[] array) {
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] *= 2;
        }
    }

    // multiply argument by 2 (has no effect on original element)
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d%n", element);
    }
}
