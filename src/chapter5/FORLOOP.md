```markdown
# For Loop in Java

## Introduction

The `for` loop is a control flow statement used for **counter-controlled repetition**. It allows a block of code to be executed a specific number of times.

## Syntax

```java
for (initialization; condition; update) {
    // body of the loop
}
```

- **Initialization**: Initializes loop control variable.
- **Condition**: Evaluated before every iteration. If `true`, loop continues; otherwise, it stops.
- **Update**: Updates the control variable after each iteration.

---

## Basic Example

```java
public class BasicForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

---

## Example: Print Even Numbers

```java
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
```

---

## Example: Sum of First 10 Natural Numbers

```java
public class SumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```

---

## Nested For Loop Example

```java
public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.printf("i = %d, j = %d%n", i, j);
            }
        }
    }
}
```

---

## Decrementing Loop

```java
public class ReverseCount {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
    }
}
```

---

## Infinite Loop (Use with caution!)

```java
for (;;) {
    System.out.println("This will run forever unless a break statement is used.");
}
```

---

## Conclusion

The `for` loop is ideal when the number of iterations is known. Mastering it is essential for solving a wide variety of problems efficiently.
```