# Chapter 4: Control Statements Part 1

## Overview
Control statements allow you to alter the flow of a program's execution. In this chapter, you'll learn the fundamental control structures: selection and repetition. You'll also explore assignment operations and the use of increment/decrement operators. These tools are critical in writing logic that responds to conditions and repeats tasks.

---

## 4.1 Introduction
Structured programming is based on organizing code into clear, logical units. Java uses control statements to direct the flow of execution:
- Sequence
- Selection (`if`, `if...else`)
- Repetition (`while`)

---

## 4.2 Algorithms
An **algorithm** is a finite sequence of steps to solve a problem.

**Example:**
```text
Algorithm to find the sum of 3 numbers:
1. Input three numbers.
2. Add them.
3. Display the result.
```

---

## 4.3 Pseudocode
**Pseudocode** is an informal language to describe an algorithm's logic without syntax rules.

**Example:**
```text
Set total to 0
Set counter to 1
While counter <= 10
    Input grade
    Add grade to total
    Increment counter
Display total
```

---

## 4.4 Control Structures
Three types:
- **Sequence**: default flow (top to bottom)
- **Selection**: decision-making (`if`, `if...else`, `switch`)
- **Repetition**: loops (`while`, `for`, `do...while`)

---

## 4.5 The `if` Statement
Executes a statement if a condition is true.

**Syntax:**
```java
if (condition) {
    // statements
}
```

**Example:**
```java
int marks = 75;
if (marks > 60) {
    System.out.println("You passed!");
}
```

---

## 4.6 The `if...else` Statement
Executes one block if true, another if false.

**Syntax:**
```java
if (condition) {
    // true block
} else {
    // false block
}
```

**Example:**
```java
int number = 5;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

## 4.7 Nested `if...else` and Ternary Operator
**Nested `if...else`** is used for multiple conditions.

**Ternary Operator Syntax:**
```java
condition ? true_result : false_result;
```

**Example:**
```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
```

---

## 4.8 The `while` Loop
Executes a block as long as the condition is true.

**Syntax:**
```java
while (condition) {
    // statements
}
```

**Example:**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## 4.9 Counter-Controlled Repetition
Uses a counter variable to control the loop.

**Example:**
```java
int count = 1;
while (count <= 10) {
    System.out.println("Count: " + count);
    count++;
}
```

---

## 4.10 Sentinel-Controlled Repetition
Ends loop based on a sentinel value.

**Example:**
```java
Scanner input = new Scanner(System.in);
int total = 0;
int number;
System.out.print("Enter number (-1 to end): ");
number = input.nextInt();
while (number != -1) {
    total += number;
    System.out.print("Enter number (-1 to end): ");
    number = input.nextInt();
}
System.out.println("Total = " + total);
```

---

## 4.11 Nested Control Structures
Control statements can be nested inside each other.

**Example:**
```java
int i = 1;
while (i <= 3) {
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    } else {
        System.out.println(i + " is odd");
    }
    i++;
}
```

---

## 4.12 Compound Assignment Operators
Shorthand for modifying variables.

**Examples:**
```java
x += 5; // x = x + 5
x -= 3; // x = x - 3
x *= 2; // x = x * 2
x /= 4; // x = x / 4
x %= 10; // x = x % 10
```

---

## 4.13 Increment and Decrement Operators
- `++` increases value by 1
- `--` decreases value by 1
- Prefix: `++x`, Postfix: `x++`

**Example:**
```java
int x = 5;
System.out.println(++x); // 6 (prefix)
System.out.println(x++); // 6 (postfix)
System.out.println(x);   // 7
```

---

## 4.14 Primitive Types and Portability
Java has fixed-size primitive types ensuring portability:
- `int`, `double`, `char`, `boolean`, etc.

**Example:**
```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
boolean isValid = true;
```

---

## Summary
This chapter laid the groundwork for structured programming by focusing on control statements, assignment operations, and Java's primitive types. These fundamentals are vital for building more complex logic in future chapters.

