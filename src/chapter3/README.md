# Chapter 3: Classes, Objects, Methods, and Strings

This chapter introduces the fundamentals of object-oriented programming in Java. You will learn how to define your own classes, create objects, use methods to define behavior, and understand the differences between primitive and reference types. This chapter also explores constructors, encapsulation using access modifiers, and working with floating-point numbers.

---

## 🎯 Objectives

- Understand how to declare a class and create an object.
- Implement a class’s attributes as instance variables.
- Implement class behaviors using methods.
- Distinguish between local and instance variables.
- Use access modifiers like `private` for encapsulation.
- Learn about primitive types vs. reference types.
- Use constructors to initialize objects.
- Handle floating-point numbers using `double`.

---

## 🧱 Key Concepts

### ✅ Class and Object
- A **class** is a blueprint for creating objects.
- An **object** is an instance of a class that has state (attributes) and behavior (methods).

### ✅ Instance Variables and Methods
- Instance variables are declared inside a class but outside methods.
- Use `private` for data hiding and `public` methods to access or modify them.

### ✅ Getter and Setter Methods
- `get` methods retrieve values.
- `set` methods update values.

### ✅ Constructor
- A constructor is used to initialize objects.
- It has the same name as the class and no return type.

### ✅ Primitive vs. Reference Types
- **Primitive types**: `int`, `double`, `boolean`, etc.
- **Reference types**: Objects like `String`, arrays, or custom classes.

---

## 📁 Files Overview

- `Account.java` – Defines the `Account` class with instance variables and `get`/`set` methods.
- `AccountTest.java` – A driver class to create `Account` objects and interact with them using Scanner.
- `AccountWithConstructor.java` – Demonstrates object initialization using constructors.
- `AccountWithBalance.java` – Uses the `double` data type for balance and shows formatting output with `%.2f`.

---

## 📚 Topics Covered

| Section | Description |
|--------|-------------|
| 3.2     | Instance variables, methods, class structure |
| 3.2.2   | Creating and using objects with `Scanner` |
| 3.2.3   | Compiling apps with multiple classes |
| 3.2.4   | UML Class Diagrams |
| 3.3     | Primitive vs. Reference types |
| 3.4     | Constructors for object initialization |
| 3.5     | Floating-point numbers using `double` |

---

## 🧪 Practice

- Modify the `Account` class to support additional fields (e.g., account number).
- Create a new class `User` with a name and age, and interact with it through a test class.
- Explore behavior when accessing uninitialized instance variables.

---

## 🛠️ Tools Used

- **JDK**: Java Development Kit
- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Terminal**: `javac` and `java` for compiling and running

---

## ✅ Summary

By the end of this chapter, you’ll have built confidence in designing your own classes, managing object data securely, and using constructors for initialization. You'll also be comfortable working with strings, doubles, and Java’s basic data types.

---