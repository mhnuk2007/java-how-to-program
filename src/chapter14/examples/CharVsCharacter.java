package chapter14.examples;

public class CharVsCharacter {
    public static void main(String[] args) {
        char ch1 = 'a';                     // Primitive
        Character ch2 = 'A';                // Wrapper object

        // Using Character methods
        System.out.println(Character.isLetter(ch1));     // true
        System.out.println(Character.isDigit('5'));      // true
        System.out.println(Character.toUpperCase(ch1));  // A
        System.out.println(Character.toLowerCase(ch2));  // a

        // char vs Character
        System.out.println(ch1 == ch2); // true, auto-unboxing compares values
    }
}
