package chapter20.examples;// Fig. 20.3: GenericMethodTest.java
// Printing array elements using a generic method.

public class GenericMethodTest {
    public static void main(String[] args) {
        // Create arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(intArray);

        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);

        System.out.printf("%nArray characterArray contains:%n");
        printArray(charArray);
    }

    // Generic method printArray
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
