package chapter9.examples;

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        // Subclass-specific behavior
        System.out.println("Bark");

        // Optionally call superclass version too
        super.makeSound(); // TSome generic animal sound
    }
}

// Testing
public class SyntaxExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism: reference is Animal, object is Dog
        myDog.makeSound(); // Output: Bark \n Some generic animal sound
    }
}
