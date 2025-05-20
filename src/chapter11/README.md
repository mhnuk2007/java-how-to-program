# Java Exception Handling - Complete Guide

This document provides definitions, explanations, and examples related to Java Exception Handling, including core concepts, classes/interfaces, methods, and special topics.

---

## ✩ Core Concepts

### Exception

An event that disrupts the normal flow of a program's instructions.

### Exception Handling

Mechanism to handle runtime errors to maintain the normal flow of the application.

### Try Block

Code that might throw an exception is wrapped in a `try` block.

```java
try {
    int a = 5 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
}
```

### Catch Block

Handles the exception thrown in the try block.

### Finally Block

Always executed after try/catch, used for cleanup.

```java
finally {
    System.out.println("This block always runs");
}
```

### Throw Statement

Manually throw an exception.

```java
throw new IllegalArgumentException("Invalid input");
```

### Throws Clause

Declares exceptions that a method might throw.

```java
public void readFile() throws IOException {
    // code
}
```

### Exception Object

Instance of `Throwable` (or its subclass) that contains details about the error.

### Throwable

Superclass for all errors and exceptions in Java.

### Checked Exception

Exceptions checked at compile time (e.g., `IOException`).

### Unchecked Exception

Exceptions not checked at compile time (e.g., `NullPointerException`).

### Synchronous Error

Occurs in a program flow (e.g., `divide by zero`).

### Asynchronous Event

Occurs outside the program flow (e.g., `I/O interrupt`).

### Termination Model

Once an exception occurs, control exits the try block.

### Multi-Catch

Catch multiple exceptions in a single catch block.

```java
catch (IOException | SQLException e) {
    e.printStackTrace();
}
```

### Rethrowing Exceptions

Re-throw caught exception.

```java
catch (IOException e) {
    throw e;
}
```

### Exception Stack Trace

Details about method call hierarchy when an exception occurred.

### Throw Point

Location in code where an exception is thrown.

### Stack Unwinding

Process of popping method calls off the stack until a handler is found.

---

## ✩ Classes and Interfaces

* **Throwable**: Base class for all exceptions and errors.
* **Exception**: Base class for all exceptions (except errors).
* **RuntimeException**: Base class for unchecked exceptions.
* **Error**: Represents serious problems (e.g., `OutOfMemoryError`).
* **ArithmeticException**: E.g., division by zero.
* **InputMismatchException**: Scanner input mismatch.
* **ArrayIndexOutOfBoundsException**: Invalid array index.
* **IllegalArgumentException**: Method passed inappropriate argument.
* **SecurityException**: Security violation.
* **FileNotFoundException**: File not found.
* **IOException**: Input/output exception.
* **ClassNotFoundException**: Class not found during runtime.
* **IllegalStateException**: Illegal state in program.
* **FormatterClosedException**: Formatter closed prematurely.
* **NoSuchElementException**: Accessing non-existing element.
* **ClassCastException**: Invalid type casting.
* **UnsupportedOperationException**: Unsupported operation.
* **NullPointerException**: Null object reference access.
* **InterruptedException**: Thread interruption.
* **ExecutionException**: Exception during task execution.
* **CancellationException**: Task canceled.
* **MalformedURLException**: Bad URL format.
* **EOFException**: Unexpected end of file.
* **SocketException**: Socket-level error.
* **UnknownHostException**: Unknown host access.
* **SQLException**: Database-related error.
* **PatternSyntaxException**: Invalid regex.
* **StackTraceElement**: Represents one element of the stack trace.

---

## ✩ Important Methods

* `printStackTrace()`

    * Prints exception trace.
* `getMessage()`

    * Returns detail message.
* `getStackTrace()`

    * Returns array of `StackTraceElement`.
* `getClassName()`

    * Returns class name (from `StackTraceElement`).
* `getFileName()`

    * Source file name.
* `getLineNumber()`

    * Line number in source file.
* `getMethodName()`

    * Method name.
* `initCause(Throwable cause)`

    * Links exceptions for chaining.
* `getCause()`

    * Retrieves original cause of exception.

---

## ✩ Special Topics

### Chained Exceptions

Link one exception to another using `initCause()` or constructors.

### Preconditions

Conditions that must be true before method execution.

### Postconditions

Conditions that must be true after method execution.

### Assertions

Runtime checks using `assert` keyword.

```java
assert age > 0 : "Age must be positive";
```

### Custom Exceptions

User-defined exception classes.

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

### Java Exception Hierarchy

```
Object
 └── Throwable
     ├── Error
     └── Exception
          ├── IOException
          └── RuntimeException
```

### Resource Leaks

Occurs when resources (file, connection) are not released.

### try-with-resources (Java 7+)

Automatic closing of resources.

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line = br.readLine();
}
```

### Automatic Resource Deallocation

Handled by `AutoCloseable` interface with try-with-resources.

### Polymorphic Exception Handling

Catch exceptions through base type (e.g., catch `Exception` for any exception).

### Exception Propagation

Exception moves up the call stack if not caught locally.

---

## 📅 Author

**Mohan Lal**
GitHub: [mhnuk2007](https://github.com/mhnuk2007)
LinkedIn: [linkedin.com/in/mohan-lal-b79790126](https://linkedin.com/in/mohan-lal-b79790126)

---

## 📄 License

This document is free for educational use and sharing with attribution.
