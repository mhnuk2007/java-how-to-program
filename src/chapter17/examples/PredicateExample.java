package chapter17.examples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = n-> n%2==0;

        nums.stream()
            .filter(isEven)
            .forEach(System.out::println);
    }
}
