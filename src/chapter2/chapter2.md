# Chapter 2: Introduction to Java Applications

## 2.1 Introduction
This chapter introduces the basics of Java application development. It begins with simple programs that output text and advances to interactive programs that input data, perform arithmetic operations, and make decisions. You'll learn to compile and run Java programs using the command line and IDEs like Eclipse, NetBeans, and IntelliJ IDEA.

---

## 2.2 Your First Program in Java: Printing a Line of Text
- A Java application runs using the `java` command.
- Comments improve readability and are ignored by the compiler:
    - End-of-line comments: `//`
    - Traditional comments: `/* */`
    - Javadoc comments: `/** */`
- Syntax errors occur when code violates Java's rules.
- White space (spaces, tabs, newlines) improves readability.
- Java keywords (e.g., `class`) are reserved words.
- Class names should use camel case (e.g., `SampleClassName`).
- Java is case sensitive.
- The main method signature must be:
  ```java
  public static void main(String[] args)
  ```
- Use `System.out.println()` to print with a newline.
- Compile using `javac`, run using `java ClassName`.

---

## 2.3 Modifying Your First Java Program
- `System.out.print()` prints without moving to a new line.
- Escape sequences begin with `\`:
    - `\n` for newline

---

## 2.4 Displaying Text with printf
- `System.out.printf()` allows formatted output.
- Format strings contain text and format specifiers:
    - `%s` for strings
    - `%d` for integers
    - `%n` for new lines (portable)

---

## 2.5 Another Application: Adding Integers

### 2.5.1 import Declarations
- `import java.util.Scanner;` allows use of `Scanner` for input.

### 2.5.2 Declaring Class Addition
- Java programs are organized in classes.

### 2.5.3 Creating a Scanner
- To read input from keyboard:
  ```java
  Scanner input = new Scanner(System.in);
  ```

### 2.5.4 Declaring Variables
- Variables must be declared with a type:
  ```java
  int number1, number2;
  ```

### 2.5.5 Prompting the User
- Use `System.out.print()` to ask for input.

### 2.5.6 Reading Input
- Use `nextInt()` to read an integer:
  ```java
  number1 = input.nextInt();
  ```

### 2.5.7 Reading Second Integer
- Prompt again and call `nextInt()` for the second number.

### 2.5.8 Using Variables in a Calculation
- Add two integers:
  ```java
  int sum = number1 + number2;
  ```

### 2.5.9 Displaying the Result
- Display the sum using `System.out.printf()` or `System.out.println()`.

### 2.5.10 Java API Documentation
- Java API provides documentation for all Java classes and methods.

---

## 2.6 Memory Concepts
- Variables represent memory locations.
- Assigning a new value to a variable replaces its old value.

---

## 2.7 Arithmetic
- Basic operators:
    - `+`, `-`, `*`, `/`, `%`
- Integer division yields an integer result.
- `%` gives the remainder.
- Operator precedence and associativity determine evaluation order.
- Parentheses can clarify expression order.

---

## 2.8 Decision Making: Equality and Relational Operators
- The `if` statement makes decisions based on conditions.
- Conditions use operators:
    - Equality: `==`, `!=`
    - Relational: `>`, `<`, `>=`, `<=`
- Syntax:
  ```java
  if (condition) {
      // statement
  }
  ```

---

## 2.9 Wrap-Up
Chapter 2 laid the groundwork for Java programming. You learned to write, modify, and execute Java applications that display text, accept input, perform arithmetic, and make decisions. Mastery of these concepts is essential for progressing to more complex topics.

