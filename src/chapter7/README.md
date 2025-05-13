# Chapter 7: Arrays and ArrayLists

## Objectives
In this chapter, you'll learn to:
- Understand what arrays are.
- Use arrays to store and retrieve data.
- Declare, initialize, and access individual array elements.
- Iterate through arrays using the enhanced `for` statement.
- Pass arrays to methods and understand pass-by-value vs. pass-by-reference.
- Declare and manipulate multidimensional arrays.
- Work with variable-length argument lists.
- Read command-line arguments into a Java program.
- Build a basic object-oriented GradeBook class.
- Perform common array operations using the `Arrays` class.
- Use `ArrayList` for dynamic array-like structures.

---

## Outline
- **7.1 Introduction**
- **7.2 Arrays**
- **7.3 Declaring and Creating Arrays**
- **7.4 Examples Using Arrays**
    - Creating and Initializing Arrays
    - Array Initializers
    - Calculated Values in Arrays
    - Summing Array Elements
    - Bar Charts for Array Data
    - Using Arrays as Counters
    - Analyzing Survey Results with Arrays
- **7.5 Exception Handling: Processing the Incorrect Response**
- **7.6 Case Study: Card Shuffling and Dealing Simulation**
- **7.7 Enhanced for Statement**
- **7.8 Passing Arrays to Methods**
- **7.9 Pass-By-Value vs. Pass-By-Reference**
- **7.10 Case Study: GradeBook Class Using an Array**
- **7.11 Multidimensional Arrays**
- **7.12 Case Study: GradeBook Class Using a Two-Dimensional Array**
- **7.13 Variable-Length Argument Lists**
- **7.14 Using Command-Line Arguments**
- **7.15 Class Arrays**
- **7.16 Collections Framework: Introduction to `ArrayList`**
- **7.17 (Optional) GUI and Graphics Case Study: Drawing Arcs**
- **7.18 Wrap-Up**

---

## Key Concepts

### Arrays
- Arrays are fixed-size collections of elements of the same type.
- Access array elements using indices (starting from 0).
- Arrays are reference types in Java.

### Declaring and Creating Arrays
- Arrays can be created using the `new` keyword or with an array initializer.
- Each array element gets a default value upon creation.

### Exception Handling with Arrays
- Java checks array bounds at runtime.
- `ArrayIndexOutOfBoundsException` occurs if invalid indices are used.
- Use `try-catch` blocks to handle exceptions gracefully.

### Enhanced for Loop
```java
for (int number : arrayName) {
    System.out.println(number);
}
```
- Simplifies iteration when you don't need to modify elements.

### Passing Arrays to Methods
- Arrays are passed by value (copy of the reference).
- Changes made inside methods affect the original array.

### Multidimensional Arrays
- Used for tables or matrices.
- Created as arrays of arrays.

```java
int[][] matrix = new int[3][4];
```

### Variable-Length Argument Lists
- Use `...` to accept a variable number of arguments.
- Treated as an array inside the method.

```java
public int sum(int... numbers) { }
```

### Command-Line Arguments
- Passed to the `main` method via `String[] args`.

### Class Arrays
- Utility methods: `sort`, `binarySearch`, `equals`, `fill`, `copy`.

### Collections and ArrayList
- `ArrayList` is a resizable array.
- Useful methods: `add`, `remove`, `size`, `contains`.

Example:
```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.remove(0);
```

---

## Summary
This chapter introduced the fundamentals of array and list manipulation in Java, including how to create, access, modify, and use arrays and `ArrayList`. You also learned about handling errors with arrays, passing arrays to methods, working with multi-dimensional arrays, and using Java’s `Arrays` utility class for common operations.

Mastering these concepts will prepare you for more complex data structures and real-world Java programming challenges!

