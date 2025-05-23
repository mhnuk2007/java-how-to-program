# Chapter 14: Strings, Characters and Regular Expressions

## Objectives

* Create and manipulate immutable character-string objects of class `String`.
* Create and manipulate mutable character-string objects of class `StringBuilder`.
* Create and manipulate objects of class `Character`.
* Break a `String` object into tokens using the `split` method.
* Use regular expressions to validate `String` data.

## Outline

### 14.1 Introduction

Java provides powerful tools to process text. Strings are sequences of characters, and Java provides several classes to manipulate and process them. The most common are:

* `String`: immutable sequences of characters.
* `StringBuilder` and `StringBuffer`: mutable sequences of characters.
* `Character`: wrapper class for char values.
* `Pattern` and `Matcher`: for regular expression processing.

### 14.2 Fundamentals of Characters and Strings

* **Character literals**: Represent a single Unicode character in single quotes (e.g., `'A'`).
* **Strings**: A sequence of characters, enclosed in double quotes (e.g., "Hello"). Strings are objects of class `String` and are immutable.

### 14.3 Class String

#### 14.3.1 String Constructors

```java
String s1 = new String("Hello"); // using constructor
String s2 = "Hello"; // using string literal
```

#### 14.3.2 Methods: `length`, `charAt`, `getChars`

* `length()` returns the number of characters.
* `charAt(index)` returns the character at the given index.
* `getChars(start, end, array, startIndex)` copies characters into an array.

#### 14.3.3 Comparing Strings

* `equals(String)` checks if strings are identical.
* `equalsIgnoreCase(String)` ignores case in comparison.
* `compareTo(String)` returns 0 if equal, <0 if current string is lexically less, >0 otherwise.

#### 14.3.4 Locating Characters/Substrings

* `indexOf(char/str)` returns the first index of character/string.
* `lastIndexOf(char/str)` returns the last index of character/string.

#### 14.3.5 Extracting Substrings

* `substring(begin)` returns substring from index to end.
* `substring(begin, end)` returns substring from begin to end-1.

#### 14.3.6 Concatenating Strings

* Use `concat(String)` method or `+` operator to join strings.

#### 14.3.7 Miscellaneous Methods

* `replace(old, new)` replaces all occurrences.
* `toUpperCase()`, `toLowerCase()` convert case.
* `trim()` removes leading/trailing whitespaces.
* `toCharArray()` converts string to character array.

#### 14.3.8 `valueOf` Method

Converts primitive data types to strings:

```java
String.valueOf(123); // "123"
```

### 14.4 Class StringBuilder

`StringBuilder` is similar to `String`, but mutable and more efficient for many modifications.

#### 14.4.1 Constructors

```java
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder(50); // capacity
StringBuilder sb3 = new StringBuilder("Hello");
```

#### 14.4.2 Methods: `length`, `capacity`, `setLength`, `ensureCapacity`

* `length()` returns number of characters.
* `capacity()` returns current capacity.
* `setLength(int)` sets new length.
* `ensureCapacity(int)` increases capacity.

#### 14.4.3 Methods: `charAt`, `setCharAt`, `getChars`, `reverse`

* `charAt(index)` gets a character.
* `setCharAt(index, char)` sets a character.
* `getChars(...)` copies characters.
* `reverse()` reverses the string.

#### 14.4.4 `append()`

Appends text:

```java
sb.append(" world");
```

#### 14.4.5 Insertion/Deletion

* `insert(index, value)` inserts characters.
* `delete(start, end)` removes characters.

### 14.5 Class Character

Wrapper class for `char` with utility methods:

* `isDigit(ch)`, `isLetter(ch)`, `isUpperCase(ch)`, `toLowerCase(ch)`

### 14.6 Tokenizing Strings

Splits strings into substrings using a delimiter:

```java
String[] parts = "a,b,c".split(",");
```

### 14.7 Regular Expressions, Pattern and Matcher

* Use `.matches()` with regex:

```java
"123".matches("\\d+"); // true
```

#### Common Regex Syntax

| Symbol  | Meaning                              |
| ------- | ------------------------------------ |
| `\d`    | Digit (0-9)                          |
| `\w`    | Word character (letters, digits, \_) |
| `\s`    | Whitespace                           |
| `*`     | 0 or more                            |
| `+`     | 1 or more                            |
| `?`     | 0 or 1                               |
| `{n}`   | Exactly n times                      |
| `{n,}`  | At least n times                     |
| `{n,m}` | Between n and m times                |

---

## Summary

Java’s String APIs are powerful for text processing. Immutable `String`, mutable `StringBuilder`, utility-rich `Character`, and the regex-powered `Pattern`/`Matcher` classes are essential for robust applications.

## 🔹 String Methods with Examples

```java
String str = "Java Programming";
System.out.println(str.length());           // 16
System.out.println(str.charAt(5));          // 'P'
System.out.println(str.substring(5));       // "Programming"
System.out.println(str.substring(5, 11));   // "Progra"
System.out.println(str.toUpperCase());      // "JAVA PROGRAMMING"
System.out.println(str.toLowerCase());      // "java programming"
System.out.println(str.indexOf("a"));       // 1
System.out.println(str.lastIndexOf("a"));   // 3
System.out.println(str.contains("Pro"));    // true
System.out.println(str.equals("Java"));     // false
System.out.println(str.equalsIgnoreCase("java programming")); // true
System.out.println("  trim  ".trim());      // "trim"
System.out.println(str.replace("Java", "C++")); // "C++ Programming"
System.out.println(str.startsWith("Java")); // true
System.out.println(str.endsWith("ing"));    // true
System.out.println(str.isEmpty());          // false
System.out.println("".isEmpty());           // true
System.out.println(str.concat(" is fun"));  // "Java Programming is fun"
System.out.println(str.compareTo("Java"));  // >0
System.out.println(str.toCharArray());      // Converts to char array
```

## 🔹 StringBuilder Methods with Examples

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World

sb.insert(5, ",");
System.out.println(sb); // Hello, World

sb.replace(0, 5, "Hi");
System.out.println(sb); // Hi, World

sb.delete(2, 5);
System.out.println(sb); // Hiorld

sb.reverse();
System.out.println(sb); // dlroiH

System.out.println(sb.capacity()); // Capacity info
sb.ensureCapacity(100);
System.out.println(sb.capacity()); // 100+ if needed
sb.setCharAt(0, 'A');
System.out.println(sb); // Alters first char
sb.setLength(5);
System.out.println(sb); // Truncate to length 5
```

## 🔹 StringBuffer Methods with Examples

```java
StringBuffer sbf = new StringBuffer("Start");
sbf.append(" End");
System.out.println(sbf); // Start End

sbf.insert(5, ",");
System.out.println(sbf); // Start, End

sbf.replace(0, 5, "Begin");
System.out.println(sbf); // Begin, End

sbf.delete(5, 7);
System.out.println(sbf); // BeginEnd

sbf.reverse();
System.out.println(sbf); // dnEgnieB

System.out.println(sbf.capacity()); // Capacity info
        sbf.ensureCapacity(50);
System.out.println(sbf.capacity()); // 50+ if needed
        sbf.setCharAt(0, 'X');
System.out.println(sbf); // Alters first char
sbf.setLength(4);
System.out.println(sbf); // Truncate
```
