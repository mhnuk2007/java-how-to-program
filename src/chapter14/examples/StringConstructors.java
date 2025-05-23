package chapter14.examples;
// Fig. 14.1: StringConstructors.java
// Demonstrating String class constructors.

public class StringConstructors {
    public static void main(String[] args) {
        // Creating a character array
        char[] charArray = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };

        // Creating a string literal
        String s = new String("hello");

        // Different String constructors
        String s1 = new String();                    // Empty string
        String s2 = new String(s);                   // Copy constructor
        String s3 = new String(charArray);           // Whole char array → "birth day"
        String s4 = new String(charArray, 6, 3);     // Subarray from index 6, length 3 → "day"

        // Display the strings
        System.out.printf(
            "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n",
            s1, s2, s3, s4
        );
    }
}
