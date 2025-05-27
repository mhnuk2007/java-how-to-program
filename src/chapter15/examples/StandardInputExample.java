package chapter15.examples;

import java.util.Scanner;

public class StandardInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Wrap System.in
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
