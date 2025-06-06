package chapter17.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();

        System.out.println(getLength.apply("Hello, World!"));


        Function<Integer, Integer> getSquare = x -> x * x;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.forEach(n -> System.out.println(getSquare.apply(n)));
    }
}
