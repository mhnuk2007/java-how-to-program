package chapter14;

// Demonstrates various String methods in Java
public class StringMethods {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println(str.length());           // Returns the length of the string: 16
        System.out.println(str.charAt(5));          // Returns the character at index 5: 'P'
        System.out.println(str.substring(5));       // Returns substring from index 5 to end: "Programming"
        System.out.println(str.substring(5, 11));   // Returns substring from index 5 to 10: "Progra"
        System.out.println(str.toUpperCase());      // Converts all characters to uppercase
        System.out.println(str.toLowerCase());      // Converts all characters to lowercase
        System.out.println(str.indexOf("a"));       // Returns index of first 'a': 1
        System.out.println(str.lastIndexOf("a"));   // Returns index of last 'a': 10
        System.out.println(str.contains("Pro"));    // Checks if "Pro" exists in string: true
        System.out.println(str.equals("Java"));     // Checks for exact match: false
        System.out.println(str.equalsIgnoreCase("java programming")); // Case-insensitive match: true
        System.out.println("  trim  ".trim());      // Removes leading and trailing spaces: "trim"
        System.out.println(str.replace("Java", "C++")); // Replaces "Java" with "C++": "C++ Programming"
        System.out.println(str.startsWith("Java")); // Checks if string starts with "Java": true
        System.out.println(str.endsWith("ing"));    // Checks if string ends with "ing": true
        System.out.println(str.isEmpty());          // Checks if string is empty: false
        System.out.println("".isEmpty());           // Checks if empty string is empty: true
        System.out.println(str.concat(" is fun"));  // Concatenates " is fun" to the string
        System.out.println(str.compareTo("Java"));  // Lexicographically compares strings (> 0 means str > "Java")
        System.out.println(str.toCharArray());      // Converts string to character array (prints reference)
    }
}
