# Java String Concepts Guide

## 1. What is a String?
A `String` in Java is a sequence of characters. It is represented by the `java.lang.String` class and is one of the most commonly used types in Java. Strings are immutable, which means that once a `String` object is created, its value cannot be changed.

```java
String s = "Hello"; // Using string literal
String t = new String("World"); // Using constructor
```

## 2. String Immutability
Once a string is created, it cannot be changed. Operations that seem to modify a string actually create a new string.

```java
String original = "Hello";
String modified = original.concat(" World");
// original is still "Hello"
```

## 3. String Pool
Java stores string literals in a special memory area called the **string pool**. This helps in memory optimization by reusing string literals.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // true (same reference from the pool)

String c = new String("Java");
System.out.println(a == c); // false (new object)
```

## 4. Common String Methods
```java
String str = "Java Programming";
str.length();              // 16
str.charAt(5);             // 'P'
str.substring(5);          // "Programming"
str.substring(5, 11);      // "Progra"
str.toUpperCase();         // "JAVA PROGRAMMING"
str.toLowerCase();         // "java programming"
str.indexOf("a");          // 1
str.lastIndexOf("a");      // 3
str.contains("Pro");       // true
str.equals("Java");        // false
str.equalsIgnoreCase("java programming"); // true
str.trim();                // Removes spaces at both ends
str.replace("Java", "C++"); // "C++ Programming"
```

## 5. String Comparison
```java
String a = "hello";
String b = "hello";
String c = new String("hello");

System.out.println(a == b);      // true
System.out.println(a == c);      // false
System.out.println(a.equals(c)); // true
```

## 6. StringBuilder and StringBuffer
### StringBuilder
- Mutable
- Not thread-safe

### StringBuffer
- Mutable
- Thread-safe

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
sb.insert(5, " Java");
sb.reverse();
sb.delete(0, 5);
```

## 7. Splitting and Joining Strings
```java
String s = "apple,banana,mango";
String[] parts = s.split(",");
String joined = String.join(" | ", parts); // "apple | banana | mango"
```

## 8. String Conversion
```java
int num = 100;
String s = Integer.toString(num); // or String.valueOf(num)
```

## 9. String Formatting
```java
String formatted = String.format("Name: %s, Age: %d", "Mohan", 25);
```

## 10. Regular Expressions with Strings
```java
String email = "user@example.com";
boolean valid = email.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,6}$");
```

## 11. StringTokenizer (Legacy)
```java
StringTokenizer st = new StringTokenizer("apple,banana,mango", ",");
while (st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
```

## 12. String and Streams
```java
List<String> list = Arrays.asList("apple", "banana", "mango");
String result = list.stream().collect(Collectors.joining(", "));
```

## Summary
- Strings are immutable and stored in a pool.
- Use `StringBuilder` or `StringBuffer` for mutable string operations.
- Strings can be compared using `equals()` and `==` (reference check).
- Java provides extensive methods to manipulate strings.
- Regex, String formatting, and conversions make Java Strings very powerful.

