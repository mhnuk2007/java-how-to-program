package chapter18.exercises;
/*
Exercise 18.14: (Palindromes) A palindrome is a string that is spelled the same way forward and backward.
Some examples of palindromes are “radar,” “able was i ere i saw elba” and (if spaces are ignored) “a
man a plan a canal panama.” Write a recursive method testPalindrome that returns boolean value
true if the string stored in the array is a palindrome and false otherwise. The method should ignore
spaces and punctuation in the string
 */

public class PalindromeTester {

    // Recursive method to check palindrome ignoring spaces and punctuation
    public static boolean testPalindrome(char[] array, int left, int right) {
        // Move left index forward if current char is not a letter/digit
        while (left < right && !Character.isLetterOrDigit(array[left])) {
            left++;
        }
        // Move right index backward if current char is not a letter/digit
        while (right > left && !Character.isLetterOrDigit(array[right])) {
            right--;
        }

        // Base case: if indices crossed or met, it's a palindrome
        if (left >= right) {
            return true;
        }

        // Compare characters ignoring case
        if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
            return false;
        }

        // Recursive call moving towards the middle
        return testPalindrome(array, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String test1 = "radar";
        String test2 = "Able was I ere I saw Elba";
        String test3 = "A man, a plan, a canal, Panama!";
        String test4 = "Not a palindrome";

        System.out.println(test1 + " -> " + testPalindrome(test1.toCharArray(), 0, test1.length() - 1));
        System.out.println(test2 + " -> " + testPalindrome(test2.toCharArray(), 0, test2.length() - 1));
        System.out.println(test3 + " -> " + testPalindrome(test3.toCharArray(), 0, test3.length() - 1));
        System.out.println(test4 + " -> " + testPalindrome(test4.toCharArray(), 0, test4.length() - 1));
    }
}
