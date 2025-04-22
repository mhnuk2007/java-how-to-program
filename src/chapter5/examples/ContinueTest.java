package chapter5.examples;

// Fig. 5.14: ContinueTest.java
// continue statement terminating an iteration of a for statement.
public class ContinueTest {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) // loop 10 times
        {
            if (count == 5){
                continue;
            }
                System.out.printf("%d ", count);
        }

        System.out.printf("%nUsed continue to skip printing 5%n");
    }
} // end class ContinueTest