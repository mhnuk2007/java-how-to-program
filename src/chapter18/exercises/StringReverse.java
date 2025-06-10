package chapter18.exercises;
/*
Exercise 18.17 (Print an Array Backward) Write a recursive method stringReverse that
takes a character array containing a string as an argument and prints the string backward.
[Hint: Use String method toCharArray, which takes no arguments, to get a char array
containing the characters in the String.]
 */

public class StringReverse {

    // Recursive method to print characters backward starting from index
    public static void stringReverse(char[] array, int index) {
        if (index < 0) {
            // Base case: if index < 0, stop recursion
            return;
        }
        System.out.print(array[index]);
        stringReverse(array, index - 1);  // Recursive call moving backward
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        char[] charArray = input.toCharArray();

        System.out.print("Original string: " + input + "\nReversed string: ");
        stringReverse(charArray, charArray.length - 1);
        System.out.println();
    }
}
