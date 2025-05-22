package chapter11.examples;

public class ChainedExceptionExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();  // Shows the full chain of exceptions
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception in method1", e);  // Chain the original cause
        }
    }

    public static void method2() throws Exception {
        throw new Exception("Original cause in method2");  // Root cause
    }
}
