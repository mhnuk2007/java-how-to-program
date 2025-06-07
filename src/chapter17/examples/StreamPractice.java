package chapter17.examples;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Squares of evens
        List<Integer> squaresOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares of evens:");
        System.out.println(squaresOfEven);
        System.out.println();

        // Cubes of odds
        List<Integer> cubesOfOdd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .collect(Collectors.toList());
        System.out.println("Cubes of odds:");
        System.out.println(cubesOfOdd);
        System.out.println();

        // Sum of numbers divisible by 3
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers divisible by 3:");
        System.out.println(sum);
        System.out.println();

        // Product of numbers divisible by 4
        int product = numbers.stream()
                .filter(n -> n % 4 == 0)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers divisible by 4:");
        System.out.println(product);
        System.out.println();

        // Grouping by Even/Odd
        Map<String, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "Even" : "Odd"));
        System.out.println("Grouped by Even/Odd:");
        System.out.println(grouped);
        System.out.println();

        // Partitioning by Even/Odd
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned by Even (true) / Odd (false):");
        System.out.println(partitioned);
        System.out.println();

        // Sorting in reverse order
        List<Integer> sortedDescending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in reverse order:");
        System.out.println(sortedDescending);
        System.out.println();

        // Parallel sum of numbers divisible by 5
        int parallelSum = numbers.parallelStream()
                .filter(n -> n % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Parallel sum of numbers divisible by 5:");
        System.out.println(parallelSum);
        System.out.println();

        // Count frequency of remainders when divided by 3
        Map<Integer, Long> remainderFrequency = numbers.stream()
                .map(n -> n % 3)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println("Remainder frequencies when divided by 3:");
        System.out.println(remainderFrequency);
        System.out.println();
    }
}
