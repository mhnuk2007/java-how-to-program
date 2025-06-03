package chapter16.examples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Java");
        stack.push("C++");
        stack.push("Python");

        System.out.println("Stack: " + stack); // [Java, C++, Python]

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek()); // Python

        // Pop element
        System.out.println("Popped: " + stack.pop()); // Python
        System.out.println("Stack after pop: " + stack); // [Java, C++]

        // Search
        System.out.println("Position of 'Java': " + stack.search("Java")); // 2

        // Check if empty
        System.out.println("Is stack empty? " + stack.empty()); // false
    }
}
