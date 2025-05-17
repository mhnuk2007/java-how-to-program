package chapter9.examples;

class Animal2 {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal2 {
    public void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog2 extends Mammal {
    public void bark() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();   // from Animal
        dog.walk();  // from Mammal
        dog.bark();  // from Dog
    }
}
