
# Chapter 10: Polymorphism, Abstract Classes, and Interfaces in Java

## 📘 Overview

This chapter explores **polymorphism**, **abstract classes**, and **interfaces**—cornerstones of object-oriented programming. These features allow us to write flexible, reusable, and maintainable Java programs by enabling generic and dynamic processing of objects.

---

## 🧠 Objectives

- Understand the concept of **polymorphism**.
- Use **method overriding** to implement polymorphism.
- Define and use **abstract classes and methods**.
- Understand the purpose and benefits of **interfaces**.
- Make systems extensible and maintainable with polymorphism.
- Learn how **`instanceof`**, **downcasting**, and **`final`** keywords work.
- Explore Java SE 8 **interface enhancements** like `default`, `static`, and **functional interfaces**.

---

## 📌 Key Concepts and Definitions

### ✅ Polymorphism
**Definition:** Polymorphism enables objects of different classes to be treated as objects of a common superclass. The actual method that gets called is determined at **runtime**.

**Benefits:**
- Reduces code duplication.
- Promotes extensibility and maintainability.
- Facilitates generic programming.

```java
Animal[] animals = { new Fish(), new Frog(), new Bird() };
for (Animal a : animals) {
    a.move();  // Each subclass defines its own version of move()
}
```

---

### ✅ Abstract Classes
**Definition:** A class declared with the `abstract` keyword. It **cannot be instantiated** directly and is intended to be subclassed.

**Usage:**
- Provides a base class with common fields and methods.
- Declares abstract methods that must be implemented by subclasses.

```java
abstract class Animal {
    public abstract void move(); // No body
}
```

### ✅ Concrete Class
A class that provides implementation for all its methods and can be instantiated.

```java
class Fish extends Animal {
    public void move() {
        System.out.println("Fish swims");
    }
}
```

---

### ✅ Interfaces
**Definition:** An interface is a reference type in Java, similar to a class, that can contain **abstract methods**, **default methods**, and **static methods**.

**Purpose:**
- Define a contract for what a class can do without saying how.
- Allow polymorphism across unrelated class hierarchies.

```java
interface Payable {
    double getPaymentAmount();
}
```

```java
class Invoice implements Payable {
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
```

---

### ✅ Java SE 8 Interface Enhancements

- **Default methods:**
  ```java
  default String getDescription() {
      return "No description provided";
  }
  ```
- **Static methods:**
  ```java
  static void utility() {
      System.out.println("Utility method");
  }
  ```
- **Functional interfaces:**
  Interface with a single abstract method, used for lambda expressions.
  ```java
  @FunctionalInterface
  interface MyFunction {
      int apply(int a, int b);
  }
  ```

---

## 📋 Case Study: Payroll System Using Polymorphism

### 📂 Hierarchy

```text
Employee (abstract)
├── SalariedEmployee
├── HourlyEmployee
├── CommissionEmployee
    └── BasePlusCommissionEmployee
```

### 🧪 Abstract Superclass

```java
abstract class Employee {
    private String firstName;
    public abstract double earnings();
}
```

### 🧪 Concrete Subclasses

```java
class SalariedEmployee extends Employee {
    private double weeklySalary;

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
```

---

## ⚙️ Polymorphic Processing

```java
Employee[] employees = {
    new SalariedEmployee(...),
    new HourlyEmployee(...),
    new BasePlusCommissionEmployee(...)
};

for (Employee e : employees) {
    System.out.println(e.earnings());  // Runtime resolution (dynamic binding)
}
```

---

## 🧪 `instanceof` and Downcasting

```java
if (e instanceof BasePlusCommissionEmployee) {
    BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) e;
    bpce.setBaseSalary(bpce.getBaseSalary() * 1.10);
}
```

---

## 🔒 final Methods and Classes

- **`final` methods**: Cannot be overridden.
- **`final` classes**: Cannot be extended.

```java
final class Utility { }
```

---

## 📦 Interface in Payable Hierarchy

### Define Payable

```java
public interface Payable {
    double getPaymentAmount();
}
```

### Implement Payable in Employee and Invoice

```java
class Invoice implements Payable {
    public double getPaymentAmount() {
        return quantity * price;
    }
}

class SalariedEmployee extends Employee implements Payable {
    public double getPaymentAmount() {
        return earnings();
    }
}
```

### Process Invoices and Employees

```java
Payable[] payables = {
    new Invoice(...),
    new SalariedEmployee(...)
};

for (Payable p : payables) {
    System.out.println(p.getPaymentAmount());
}
```

---

## 🖼️ Optional: GUI Case Study - Drawing with Polymorphism

You can apply polymorphism in GUI-based programs for shapes like `Line`, `Rectangle`, `Oval`—each subclass of an abstract `Shape` class that implements a `draw` method.

---

## 📌 Summary

| Feature                 | Purpose                                                  |
|------------------------|----------------------------------------------------------|
| Polymorphism           | Process different types uniformly                        |
| Abstract Class         | Base class with unimplemented methods                    |
| Interface              | Define behavior across unrelated classes                 |
| Dynamic Binding        | Method calls resolved at runtime                         |
| `instanceof` Operator  | Check object type at runtime                             |
| `final`                | Prevent modification of methods or extension of classes  |
| Java 8 Enhancements    | Add default, static, and functional interface support    |

---

## 📚 Further Reading

- Java API documentation on [`interface`](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Polymorphism in Java - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- Effective Java (Joshua Bloch) – Item on inheritance vs composition

---

## 🧑‍💻 Practice Suggestion

- Create your own class hierarchy with an abstract superclass and 2-3 subclasses.
- Implement a common interface across unrelated classes.
- Try using polymorphism to invoke subclass-specific methods generically.
- Use `instanceof` and downcasting to access subclass-specific behavior.
