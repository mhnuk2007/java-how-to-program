package chapter17.examples;

import java.util.function.IntPredicate;
import java.util.Arrays;

public class IntPredicateExercise {
    public static void main(String[] args) {
        int[] numbers = { -15, -3, 0, 2, 7, 10, 12, 13, 15, 18, 20 };

        // TODO: Define IntPredicates
        IntPredicate isEven = n -> n % 2 == 0;
        IntPredicate greaterThan10 = n -> n > 10;
        IntPredicate isOdd = n -> n % 2 != 0;
        IntPredicate isNegative = n -> n < 0;
        IntPredicate divisibleBy3 = n -> n % 3 == 0;

        // a. even AND > 10
        System.out.print("Even and greater than 10: ");
        Arrays.stream(numbers)
              .filter(isEven.and(greaterThan10))
              .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // b. odd OR negative
        System.out.print("Odd or negative: ");
        Arrays.stream(numbers)
              .filter(isOdd.or(isNegative))
              .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // c. NOT divisible by 3
        System.out.print("Not divisible by 3: ");
        Arrays.stream(numbers)
              .filter(divisibleBy3.negate())
              .forEach(n -> System.out.print(n + " "));
    }
}
