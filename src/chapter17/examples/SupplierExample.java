package chapter17.examples;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        System.out.println("Random: " + randomSupplier.get());
    }
}
