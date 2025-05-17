# Object Oriented Programming - Inheritance

## 📘 Definition

Inheritance is one of the core concepts of Object-Oriented Programming (OOP). It allows a class (called a **subclass** or **derived class**) to inherit attributes and methods from another class (called a **superclass** or **base class**).

## 🎯 Why Use Inheritance?

* **Code Reusability**: Avoid code duplication by reusing existing class functionalities.
* **Extensibility**: Add or modify behaviors in derived classes without changing existing code.
* **Hierarchy Representation**: Establish a natural hierarchy and relationships between classes.

## 🔑 Key Concepts

* `extends` keyword is used for inheritance.
* A subclass inherits all public and protected members from its superclass.
* `super` keyword is used to call the superclass’s constructor or methods.
* Java supports **single inheritance** (not multiple inheritance with classes).
* Constructors are **not** inherited but can be invoked using `super()`.

## 🔐 Access Modifiers

| Modifier    | Accessible in Subclass | Accessible Outside Package       |
| ----------- | ---------------------- | -------------------------------- |
| `private`   | No                     | No                               |
| `protected` | Yes                    | Only in same package or subclass |
| `public`    | Yes                    | Yes                              |

---

## 🧪 Examples

### Example 1: Basic Inheritance

```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark
    }
}
```

### Example 2: Calling Superclass Method

```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
        super.makeSound(); // Calls Animal's version
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        // Output:
        // Bark
        // Some generic animal sound
    }
}
```

### Example 3: Constructor Chaining

```java
class Animal {
    public Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    public Dog() {
        super(); // Calls Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
// Output:
// Animal constructor called
// Dog constructor called
```

### Example 4: Accessing protected members

```java
class Animal {
    protected String type = "Generic Animal";
}

class Dog extends Animal {
    public void displayType() {
        System.out.println("Type: " + type);
    }
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayType(); // Output: Type: Generic Animal
    }
}
```

---

## 🧠 Summary

* **is-a** relationship: A `Dog` is an `Animal`.
* Use `extends` to create subclass.
* `super` allows access to superclass constructors and methods.
* Java classes are ultimately derived from the `Object` class.

> Inheritance helps achieve **modularity**, **code reuse**, and **clean architecture**.

---

## 📁 Files Included

* `SyntaxExample.java`
* `InheritanceExample1.java`
* `InheritanceExample2.java`
* `InheritanceExample3.java`
* `InheritanceExample4.java`

---

## 🔗 References

* *Java How to Program Early Objects (10th Edition)* by Deitel & Deitel
* [Oracle Java Docs - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
