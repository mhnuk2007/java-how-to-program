package chapter20.examples;
// Fig. 20.11: RawTypeTest.java
// Raw type test program to demonstrate the dangers of using raw types.

public class RawTypeTest {
    public static void main(String[] args) {

        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Stack of raw types assigned to Stack of raw type variable
        Stack rawTypeStack1 = new Stack(5);

        // Stack<Double> assigned to Stack of raw types variable
        Stack<Double> rawTypeStack2 = new Stack<>(5);

        // Stack of raw types assigned to Stack<Integer> variable
        Stack<Integer> integerStack = new Stack<>(10);

        // push elements of doubleElements onto doubleStack
        testPush("rawTypeStack1", rawTypeStack1, doubleElements);
        testPop("rawTypeStack1", rawTypeStack1); // pop elements from doubleStack
        testPush("rawTypeStack2", rawTypeStack2, doubleElements);
        testPop("rawTypeStack2", rawTypeStack2); // pop elements from doubleStack
        testPush("rawTypeStack3", integerStack, integerElements);
        testPop("rawTypeStack3", integerStack); // pop elements from doubleStack
    }

    // generic method testPush pushes elements onto a Stack
    private static <T> void testPush(String name, Stack<T> stack, T[] elements) {
        System.out.printf("%nPushing elements onto %s%n", name);

        // push elements to Stack
        for (T element : elements) {
            System.out.printf("%s ", element);
            stack.push(element); // push onto doubleStack

        }
    }

    // generic method testPop pops elements from a Stack
    private static <T> void testPop(String name, Stack<T> stack) {
        // pop elements from stack
        try {
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue; // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = stack.pop(); // pop from doubleStack
                System.out.printf("%s ", popValue);

            }
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }


}

