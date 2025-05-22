package chapter11.examples;

import java.util.Scanner;

public class TryWithResourcesExample { 
    public static void main(String[] args) {
        // Scanner implements AutoCloseable
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Hello, " + name + "!");
        } // Scanner is automatically closed here
        catch (Exception e) {
            System.out.println("Error reading input.");
        }
    }
}
