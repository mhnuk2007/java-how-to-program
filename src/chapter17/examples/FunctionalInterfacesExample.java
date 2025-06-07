package chapter17.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

// Main class demonstrating core concepts of Java Functional Programming and Stream API basics
public class FunctionalInterfacesExample {
    public static void main(String[] args) {

        // --- MathOperations ---
        // Custom functional interface using lambda expressions for basic math operations
        MathOperations sum = (x, y) -> x + y;
        MathOperations diff = (x, y) -> x - y;
        MathOperations prod = (x, y) -> x * y;
        MathOperations div = (x, y) -> x / y;

        System.out.println("Sum: " + sum.operate(5, 3));               // 8
        System.out.println("Difference: " + diff.operate(10, 7));     // 3
        System.out.println("Product: " + prod.operate(4, 6));         // 24
        System.out.println("Quotient: " + div.operate(15, 3));        // 5

        // --- Predicate ---
        // Predicate represents a condition (true/false check). Often used for filtering.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("10 is even? " + isEven.test(10));         // true
        System.out.println("7 is even? " + isEven.test(7));           // false

        Predicate<String> isWordStartingWithA = s -> s.startsWith("A");
        Predicate<String> isWordEndingWithA = s -> s.endsWith("a");

        // Combining predicates using AND and OR
        Predicate<String> startsAndEndsWithA = isWordStartingWithA.and(isWordEndingWithA);
        Predicate<String> startsOrEndsWithA = isWordStartingWithA.or(isWordEndingWithA);

        System.out.println("\"Apple\" starts with A? " + isWordStartingWithA.test("Apple"));     // true
        System.out.println("\"Banana\" starts with A? " + isWordStartingWithA.test("Banana"));   // false
        System.out.println("\"Apple\" ends with a? " + isWordEndingWithA.test("Apple"));         // false
        System.out.println("\"Banana\" ends with a? " + isWordEndingWithA.test("Banana"));       // true
        System.out.println("\"Apple\" starts with A AND ends with a? " + startsAndEndsWithA.test("Apple"));  // false
        System.out.println("\"Apple\" starts with A OR ends with a? " + startsOrEndsWithA.test("Apple"));    // true
        System.out.println("\"Alfa\" starts with A AND ends with a? " + startsAndEndsWithA.test("Alfa"));    // true
        System.out.println("\"Banana\" starts with A OR ends with a? " + startsOrEndsWithA.test("Banana"));  // true

        // --- Function ---
        // Function<T, R> transforms input of type T to output of type R
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;

        System.out.println("Double of 6: " + doubleIt.apply(6));  // 12
        System.out.println("Double then triple of 6: " + doubleIt.andThen(tripleIt).apply(6)); // (6*2)=12 → (12*3)=36
        System.out.println("Triple then double of 6: " + doubleIt.compose(tripleIt).apply(6)); // (6*3)=18 → (18*2)=36

        // Function.identity() returns a function that simply returns its input
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(10);
        System.out.println("Identity of 10: " + res); // 10

        // --- Consumer ---
        // Consumer<T> performs action on input T, but returns nothing (void).
        Consumer<Integer> print = x -> System.out.println("Consumed: " + x);
        print.accept(45);  // Output: Consumed: 45

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Consumer to print each element of a list using for-each loop
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // --- Supplier ---
        // Supplier<T> provides data without any input
        Supplier<String> giveHelloWorld = () -> "Hello world";
        System.out.println(giveHelloWorld.get());

        // --- Combined Example ---
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // --- BiPredicate, BiConsumer, BiFunction ---
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(45, 67));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        biConsumer.accept(10, 20);

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        System.out.println(biFunction.apply(10, 20));

        // --- Unary Operator, Binary Operator ---
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply(13, 24));

        // --- Method Reference ---
        // use method without invoking and in place of lambda expression
        List<String> names = Arrays.asList("Sunny", "Honey", "Hitesh", "Sandeep");
        names.forEach(x -> System.out.println(x));
        names.forEach(System.out::println);

        // --- Constructor Reference ---
        List<String> mobileNames = Arrays.asList("Nokia", "Vivo", "Oppo", "Samsung", "Apple");
        List<MobilePhones> mobilePhonesList = mobileNames.stream().map(x -> new MobilePhones(x)).collect(Collectors.toList());
        List<MobilePhones> mobilePhonesList2 = mobileNames.stream().map(MobilePhones::new).collect(Collectors.toList());

        mobilePhonesList.forEach(System.out::println);
        mobilePhonesList2.forEach(System.out::println);


    }
}

// Custom functional interface for mathematical operations with two integers
@FunctionalInterface
interface MathOperations {
    int operate(int a, int b);
}

class MobilePhones {
    private String name;

    public MobilePhones(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MobilePhone{name='" + name + "'}";
    }

}
