package chapter11.examples;

public class RethrowExample {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e);
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception caught in method1");
            throw e; // Rethrow to main
        }
    }

    public static void method2() throws Exception {
        throw new Exception("Exception from method2");
    }
}
