package chapter4.Examples;

// Fig. 4.15: Increment.java
// Prefix increment and postfix increment operators.
public class Increment {
    public static void main(String[] args) {
        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);

        // demonstrate prefix increment operator
        c = 5;
        System.out.printf("c before preincrement: %d%n", c);
        System.out.printf("    preincrementing c: %d%n", ++c);
        System.out.printf(" c after preincrement: %d%n", c);
    }
}
