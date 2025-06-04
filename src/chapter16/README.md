# Chapter 16 – Generic Collections

## Overview

This chapter provides an in-depth exploration of Java’s **Collections Framework**, a fundamental part of the Java Standard Library designed to handle groups of objects efficiently and flexibly. The framework offers a unified architecture to store, retrieve, manipulate, and communicate aggregate data with ease and high performance.

The primary goals of the Collections Framework are to:
- Simplify programming tasks by providing ready-to-use data structures and algorithms.
- Improve program speed and reliability via high-quality implementations.
- Facilitate interoperability by defining a common set of interfaces.

---

## Core Concepts and Interfaces

### List

An **ordered collection** (sequence) that permits duplicate elements and allows positional access and insertion of elements.

- **Common Implementations**:
  - `ArrayList`: Provides fast random access using a dynamic array.
  - `LinkedList`: Doubly linked list implementation optimized for frequent insertions and deletions.

**Example:**

```java
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");  // Duplicate allowed
```

---

### Set

A **collection that contains no duplicate elements**, enforcing uniqueness.

- **Common Implementations**:
  - `HashSet`: Offers constant-time performance for basic operations.
  - `TreeSet`: Implements `SortedSet` and maintains elements in ascending order.

**Example:**

```java
Set<String> uniqueFruits = new HashSet<>();
uniqueFruits.add("Apple");
uniqueFruits.add("Banana");
uniqueFruits.add("Apple");  // Duplicate ignored
```

---

### Queue

A collection designed to hold elements prior to processing, typically ordered in **FIFO** (first-in-first-out) order.

- **Common Implementations**:
  - `LinkedList`: Supports queue operations.
  - `PriorityQueue`: Orders elements according to natural ordering or custom comparator.

**Example:**

```java
Queue<String> taskQueue = new LinkedList<>();
taskQueue.add("Task 1");
taskQueue.add("Task 2");
String nextTask = taskQueue.poll();  // Retrieves and removes the head of the queue
```

---

### Map

An object that maps **unique keys** to values, without duplicate keys.

- **Common Implementations**:
  - `HashMap`: Offers fast access based on hash codes; allows null keys and values.
  - `TreeMap`: Maintains keys in sorted order.

**Example:**

```java
Map<String, Integer> inventory = new HashMap<>();
inventory.put("Apple", 10);
inventory.put("Banana", 20);
```

---

### Stack

A **last-in-first-out (LIFO)** collection.

**Example:**

```java
Stack<String> stack = new Stack<>();
stack.push("First");
stack.push("Second");
String top = stack.pop();  // Removes and returns the last inserted element
```

---

### Properties

A specialized subclass of `Hashtable` for managing a set of persistent key-value pairs, commonly used for configuration settings.

- Can be loaded from and saved to streams, typically properties files.

**Example:**

```java
Properties props = new Properties();
props.setProperty("username", "admin");
props.store(new FileOutputStream("config.properties"), "User credentials");
```

---

## Utility Classes

### Collections

This utility class provides static methods for common collection operations, such as:

- Sorting (`Collections.sort()`)
- Searching (`Collections.binarySearch()`)
- Reversing (`Collections.reverse()`)
- Synchronization wrappers (`Collections.synchronizedList()`)

**Example:**

```java
List<String> items = Arrays.asList("Banana", "Apple", "Cherry");
Collections.sort(items);  // Sorts in natural order
```

---

## Code Examples

The `src/chapter16/examples` directory contains practical implementations demonstrating:

- List, Set, Map, Queue, Stack, and Properties usage.
- Examples on collection manipulation, iteration, and file persistence.

---

## Key Takeaways

- Choose the appropriate collection interface based on ordering, duplication, and performance needs.
- Understand the trade-offs between implementations for optimized application behavior.
- Leverage Java Generics for type-safe and expressive code.
- Utilize `Collections` utility methods to simplify routine operations.

---

## References

For further details, see the official [Java Collections Framework documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html).

---

*This README is part of the "Java How to Program" learning series, Chapter 16: Generic Collections.*
