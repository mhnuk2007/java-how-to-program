package chapter17.examples;
// Fig. 17.5: IntStreamOperations.java
// Demonstrating IntStream operations.

import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {

        // Define an array of integers
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Display original values using IntStream.of and forEach
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));

        // Display the total number of elements in the stream
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        // Find and display the minimum value in the stream
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());

        // Find and display the maximum value in the stream
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());

        // Calculate and display the sum of the elements
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        // Calculate and display the average of the elements
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        // Use reduce to calculate the sum (initial value 0, accumulator: x + y)
        System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));

        // Use reduce to calculate the sum of squares (x + y*y)
        System.out.printf("Sum of squres via reduce method:%d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));

        // Use reduce to calculate the product of all elements (initial value 1, accumulator: x * y)
        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));

        // Filter even values, sort them, and display them
        System.out.println("Even values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));

        // Filter odd values, multiply each by 10, sort, and display them
        System.out.printf("%nOdd values multiplied by 10 displayed in sorted order:");
        IntStream.of(values)
                .filter(value -> value%2!=0)
                .map(value -> value*10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));

        // Use IntStream.range to sum integers from 1 (inclusive) to 10 (exclusive)
        System.out.printf("%nSum of integers from 1 to 9: %d%n", IntStream.range(1, 10).sum());

        // Use IntStream.rangeClosed to sum integers from 1 to 10 (inclusive)
        System.out.printf("Sum of integers from 1 to 10: %d%n", IntStream.rangeClosed(1,10).sum());
    }
}
