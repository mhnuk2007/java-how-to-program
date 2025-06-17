# Java Generics - Chapter 20

## 📘 Overview

This chapter explores **Generics** in Java, enabling type-safe code through generic methods, classes, and interfaces. Generics allow writing flexible and reusable code without sacrificing type safety.

---

## 🔹 Section 20.1: Introduction

### ✅ Key Concepts:

* **Generic Methods**: A single method declaration that works with different data types.
* **Generic Classes/Interfaces**: Enable defining type-independent classes/interfaces.

### 💡 Example:

```java
public class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

---

## 🔹 Section 20.2: Motivation for Generic Methods

### 🔄 Problem:

* Multiple **overloaded methods** required for different data types.

### ✅ Solution:

* Use **generic methods** to avoid redundancy.

### 💡 Example:

```java
public class Util {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
    }
}
```

---

## 🔹 Section 20.3: Generic Methods: Implementation & Compile-Time Translation

### 🧩 Syntax:

```java
public static <T> T maximum(T a, T b, T c) {
    T max = a;
    if (b.compareTo(max) > 0) max = b;
    if (c.compareTo(max) > 0) max = c;
    return max;
}
```

### 🔍 Type Parameters:

* Declared inside angle brackets `< >`
* Must be reference types
* Can be used in method signatures and bodies

### ⚙️ Behavior:

* Compiler resolves method types based on arguments
* Performs **type checking** and **type inference**

### 🔁 `Comparable` Example:

```java
public static <T extends Comparable<T>> T max(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
}
```

---

## 🔹 Section 20.4: Compile-Time Translation & Return Type Handling

### 🧹 Type Erasure:

* Compiler **removes type parameters** and replaces them with upper bounds (default: `Object`)
* Insert **explicit casts** for return types

### 💡 Example:

```java
// Original generic method
public static <T> T identity(T value) { return value; }

// After erasure
public static Object identity(Object value) { return value; }
```

---

## 🔹 Section 20.5: Overloading Generic Methods

### ✅ Rule:

* You can **overload** generic methods with:

    * Other generic methods
    * Non-generic methods

### 💡 Example:

```java
public static <T> void display(T data) { System.out.println(data); }
public static void display(String data) { System.out.println("String: " + data); }
```

---

## 🔹 Section 20.6: Generic Classes

### 🧱 Structure:

```java
public class Pair<K, V> {
    private K key;
    private V value;
    // constructor, getters, setters
}
```

### ⚠️ Note:

* Cannot use type parameters in `static` context
* **Type arguments** are specified during instantiation:

```java
Pair<String, Integer> pair = new Pair<>("Age", 30);
```

### 🧹 Erasure:

* Compiler replaces type parameters with `Object` or upper bound

---

## 🔹 Section 20.7: Raw Types

### 📉 Definition:

* Using a generic class **without specifying type arguments**

### 💡 Example:

```java
Box rawBox = new Box(); // Raw type
rawBox.set("Hello");
```

### ⚠️ Issues:

* **No type safety**
* Requires **manual casting** when retrieving values

---

## 🔹 Section 20.8: Wildcards in Methods

### ❓ What is a Wildcard?

* Denoted by `?` (unknown type)
* Allows flexibility in method parameters

### 🧭 Types:

* `?` : Unbounded wildcard
* `? extends T` : Upper-bounded wildcard (read-only)
* `? super T` : Lower-bounded wildcard (write-only)

### 💡 Example:

```java
public static void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n.doubleValue());
    }
}
```

### ⚠️ Limitations:

* Cannot add elements to `? extends T`
* Only `Object` methods can be used if no bounds are specified

---

## ✅ Summary

* Generics allow **type-safe**, **reusable**, and **maintainable** code.
* Avoids type casting and redundant method overloads.
* Enhances code clarity and error detection at **compile time**.
* Key tools: **Generic methods**, **generic classes**, **wildcards**, and **type bounds**.

---

## 📚 References

* *Java How to Program: Early Objects (10th Edition)* by Paul & Harvey Deitel

---

