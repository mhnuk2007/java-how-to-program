package chapter15.examples;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Wrap System.in
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();          // Read a line of input
        System.out.println("Welcome, " + name + "!");
        scanner.close();
    }
}
