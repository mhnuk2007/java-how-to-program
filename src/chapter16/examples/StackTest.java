package chapter16.examples;
// Fig. 16.14: StackTest.java
// Stack class of package java.util.

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>(); // create a Stack

        // push elements onto stack
        stack.push(12L); // push long value 12L
        System.out.println("Pushed 12L");
        printStack(stack);

        stack.push(34567); // push int value 34567
        System.out.println("Pushed 34567");
        printStack(stack);

        stack.push(1.0F); // push float value 1.0F
        System.out.println("Pushed 1.0F");
        printStack(stack);

        stack.push(1234.5678); // push double value 1234.5678
        System.out.println("Pushed 1234.5678");
        printStack(stack);

        // pop elements from stack
        try {
            Number removedObject = null;

            while (true) {
                removedObject = stack.pop(); // use pop method
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException emptyStackException) {
            System.out.println("Stack is empty. Cannot pop.");
            emptyStackException.printStackTrace();
        }
    }

    // display Stack contents
    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty()) {
            System.out.printf("stack is empty%n%n");
        } else {
            System.out.printf("stack contains: %s (top)%n%n", stack);
        }
    }
}
