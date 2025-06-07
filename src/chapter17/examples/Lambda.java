package chapter17.examples;


public class Lambda {
    public static void main(String[] args) {
        //Three ways to implement interface
        // by implementing subclass
        // by anonymous class for implementing interface
        // by lambda express

        MyInterface myInterface = ()-> System.out.println("Hello, World!");
        myInterface.sayHello();

    }
}
