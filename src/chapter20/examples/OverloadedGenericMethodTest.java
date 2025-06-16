package chapter20.examples;

public class OverloadedGenericMethodTest {

    // Generic method
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // Overloaded method for String[]
    public static void printArray(String[] inputArray) {
        System.out.println("Array stringArray contains:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%-8s", inputArray[i]); // 8-char wide column
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        if (inputArray.length % 4 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] stringArray = {
            "one", "two", "three", "four",
            "five", "six", "seven", "eight"
        };

        System.out.println("Integer array:");
        printArray(intArray);

        System.out.println("\nDouble array:");
        printArray(doubleArray);

        System.out.println();
        printArray(stringArray); // overloaded method is called here
    }
}
