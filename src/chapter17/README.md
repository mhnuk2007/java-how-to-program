
# Java SE 8: Lambdas and Streams - In-Depth Guide

---

## 1. Lambda Expressions

**Definition**: A lambda expression is a concise way to represent an anonymous function that can be passed around, stored, and executed. It implements a method from a functional interface.

**Syntax**:

```java
(parameters) -> expression
(parameters) -> { statements; }
```

**Example**:

```java
Runnable r = () -> System.out.println("Hello, Lambda!");
r.run();
```

**Explanation**:

- No method name
- No access modifier or return type
- Automatically used to implement a method from a functional interface

---

## 2. Functional Interfaces

**Definition**: A functional interface is an interface that contains exactly one abstract method.

**Annotation**: `@FunctionalInterface` (optional but helpful for compiler enforcement)

**Examples**:

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}
```

**Built-in Functional Interfaces (from java.util.function)**:

- `Predicate<T>`: `boolean test(T t)` – used for conditions
- `Function<T, R>`: `R apply(T t)` – used for data transformation
- `Consumer<T>`: `void accept(T t)` – used for operations without returning a result
- `Supplier<T>`: `T get()` – used for providing values

**Example with Predicate**:

```java
Predicate<String> isShort = s -> s.length() < 5;
System.out.println(isShort.test("Hi")); // true
```

---

## 3. Streams API

**Definition**: The Streams API provides a functional way to process collections of objects using a pipeline of operations.

**Key Characteristics**:

- Declarative
- Lazy (intermediate operations are not executed until a terminal operation is invoked)
- Can be parallelized easily

**Stream Pipeline**:

```
Source -> Intermediate Operations -> Terminal Operation
```

---

## 4. Creating Streams

**From a Collection**:

```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
```

**From an Array**:

```java
Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3});
```

**Using Stream.of()**:

```java
Stream<String> stream = Stream.of("Java", "Python", "C++");
```

---

## 5. Intermediate Operations

**Definition**: Operations that return another Stream and are lazy (not executed until a terminal operation is called).

| Operation           | Description                                   |
| ------------------- | --------------------------------------------- |
| `filter(Predicate)` | Removes elements that don’t match a condition |
| `map(Function)`     | Transforms each element                       |
| `sorted()`          | Sorts the stream                              |
| `distinct()`        | Removes duplicates                            |
| `limit(n)`          | Truncates the stream to n elements            |
| `skip(n)`           | Skips the first n elements                    |

**Example**:

```java
List<String> result = list.stream()
                          .filter(s -> s.startsWith("A"))
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());
```

---

## 6. Terminal Operations

**Definition**: Operations that produce a result or a side effect and terminate the stream pipeline.

| Operation                                 | Description                                     |
| ----------------------------------------- | ----------------------------------------------- |
| `forEach(Consumer)`                       | Performs an action on each element              |
| `collect(Collector)`                      | Reduces elements into a collection or structure |
| `reduce(identity, accumulator)`           | Reduces the stream to a single value            |
| `count()`                                 | Returns number of elements                      |
| `anyMatch()`, `allMatch()`, `noneMatch()` | Test elements with a predicate                  |

**Example**:

```java
long count = list.stream().filter(s -> s.contains("a")).count();
```

---

## 7. Collectors

**Definition**: Utility class to accumulate elements into collections or summaries.

**Examples**:

- `Collectors.toList()`
- `Collectors.toSet()`
- `Collectors.joining(", ")`
- `Collectors.groupingBy(Function)`

**Example**:

```java
List<String> result = stream.collect(Collectors.toList());
```

---

## 8. Parallel Streams

**Definition**: A parallel stream divides the workload across multiple threads for better performance with large data sets.

**Example**:

```java
list.parallelStream()
    .filter(s -> s.startsWith("A"))
    .forEach(System.out::println);
```

**Note**: Use when operations are independent and performance gain is measurable.

---

## 9. Capturing Variables in Lambdas

**Definition**: Lambdas can access variables from the enclosing scope if they are final or *effectively final* (not modified after assignment).

**Example**:

```java
String prefix = "Hello ";
Consumer<String> greet = name -> System.out.println(prefix + name);
greet.accept("John");
```

---

## 10. Benefits of Lambdas and Streams

- **Conciseness**: Reduces boilerplate code
- **Readability**: More expressive and focused logic
- **Powerful**: Allows chaining operations on data
- **Parallelizable**: Performance benefits for large datasets

---

This concludes a detailed breakdown of Java SE 8 Lambdas and Streams. Ready for the advanced examples, use-cases, or practice exercises next?
