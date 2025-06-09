package chapter17.exercises;// Fig. 17.5 Updated: MappingThenReducingAnIntStream.java
// IntStream operations demonstrating map then reduce for correct parallelization.
import java.util.stream.IntStream;

public class MappingThenReducingAnIntStream {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Display original values
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // Count, Min, Max, Sum, Average
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        // Sum of squares via map then reduce
        System.out.printf("%nSum of squares via map-reduce: %d%n",
            IntStream.of(values)
                     .map(x -> x * x)            // map each value to its square
                     .reduce(0, Integer::sum));  // reduce to sum

        // Alternatively using sum()
        System.out.printf("Sum of squares via map-sum: %d%n",
            IntStream.of(values)
                     .map(x -> x * x)
                     .sum());

        // Even values in sorted order
        System.out.printf("%nEven values sorted: ");
        IntStream.of(values)
                 .filter(value -> value % 2 == 0)
                 .sorted()
                 .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // Odd values multiplied by 10 and sorted
        System.out.printf("Odd values multiplied by 10 and sorted: ");
        IntStream.of(values)
                 .filter(value -> value % 2 != 0)
                 .map(value -> value * 10)
                 .sorted()
                 .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // Sum range of integers from 1 to 9
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
            IntStream.range(1, 10).sum());

        // Sum range of integers from 1 to 10
        System.out.printf("Sum of integers from 1 to 10: %d%n",
            IntStream.rangeClosed(1, 10).sum());
    }
}
