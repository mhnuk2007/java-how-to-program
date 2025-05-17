package chapter9.examples;

class Vehicle {
    protected String type = "Generic Vehicle";

    protected void showType() {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    public void printInfo() {
        showType(); // access protected method
        System.out.println("Inside Car class");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.printInfo();
    }
}
