package chapter17.examples;

// Step 1: Define a functional interface
@FunctionalInterface
interface MyInterface {
    void sayHello();
}

// Step 2: Implementation using three approaches
public class LambdaExample {

    public static void main(String[] args) {

        // 1. Implementation using a separate class
        MyInterface classImplementation = new MyInterfaceImpl();
        classImplementation.sayHello();  // Output: Hello from class!

        // 2️. Implementation using an anonymous inner class
        MyInterface anonymousImplementation = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        anonymousImplementation.sayHello();  // Output: Hello from anonymous class!

        // 3️. Implementation using a lambda expression
        MyInterface lambdaImplementation = () -> System.out.println("Hello from lambda!");
        lambdaImplementation.sayHello();  // Output: Hello from lambda!
    }
}

// Separate class that implements the interface
class MyInterfaceImpl implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello from class!");
    }
}
