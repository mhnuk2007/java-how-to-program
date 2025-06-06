package chapter17.examples;
// Welcome Message using Supplier

import java.util.Scanner;
import java.util.function.Supplier;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        Supplier<String> welcome = ()-> "Welcome " + name + "!";
        System.out.println(welcome.get());

        input.close();

    }
}
