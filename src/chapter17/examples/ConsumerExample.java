package chapter17.examples;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Consumer<String> printer = s -> System.out.println("Hello " + s);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        printer.accept(name);

    }
}
