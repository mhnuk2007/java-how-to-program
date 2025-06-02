package chapter16.examples;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate ignored

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
