package chapter14.examples;

public class CharacterDemo {
    public static void main(String[] args) {
        char ch = 'a';

        System.out.println(Character.isLetter(ch));     // true
        System.out.println(Character.isDigit(ch));      // false
        System.out.println(Character.toUpperCase(ch));  // 'A'
        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isUpperCase(ch));   // false

        Character obj = ch; // autoboxing
        System.out.println(obj.charValue());            // 'a'
    }
}
