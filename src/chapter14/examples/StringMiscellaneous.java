package chapter14.examples;
// Fig. 14.2: StringMiscellaneous.java
// Demonstrates the String class methods: length, charAt, and getChars.

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there"; // Sample string
        char[] charArray = new char[5]; // Target array to hold copied characters

        // Display the original string
        System.out.printf("s1: %s", s1);

        // 1. length() - Get length of string
        System.out.printf("%nLength of s1: %d", s1.length());

        // 2. charAt() - Display characters in reverse order
        System.out.printf("%nThe string reversed is: ");
        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.printf("%c ", s1.charAt(count));
        }

        // 3. getChars() - Copy first 5 characters into charArray
        s1.getChars(0, 5, charArray, 0);

        // Display the copied character array
        System.out.printf("%nThe character array is: ");
        for (char character : charArray) {
            System.out.print(character); // prints: hello
        }

        System.out.println(); // Print final newline
    }
}
