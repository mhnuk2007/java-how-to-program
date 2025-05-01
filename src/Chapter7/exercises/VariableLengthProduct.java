package Chapter7.exercises;

/*
Exercise 7.14 (Variable-Length Argument List)
Write an application that calculates the product of a series of integers that are passed
to method product using a variable-length argument list. Test your method with several
calls, each with a different number of arguments.
*/

public class VariableLengthProduct {

    // Method to calculate product using varargs
    public static int product(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    // Main method to test the product method with different argument counts
    public static void main(String[] args) {
        System.out.printf("Product of 2, 3, 4: %d%n", product(2, 3, 4));          // 24
        System.out.printf("Product of 5, 5: %d%n", product(5, 5));                // 25
        System.out.printf("Product of 10: %d%n", product(10));                   // 10
        System.out.printf("Product of 1, 2, 3, 4, 5: %d%n", product(1, 2, 3, 4, 5)); // 120
        System.out.printf("Product with no arguments: %d%n", product());         // 1 (neutral element of multiplication)
    }
}
