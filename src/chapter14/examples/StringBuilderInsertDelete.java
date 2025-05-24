package chapter14.examples;// Fig. 14.14: StringBuilderInsertDelete.java
// Demonstrates insert, delete, and deleteCharAt methods of StringBuilder.

public class StringBuilderInsertDelete {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        boolean booleanValue = true;
        char characterValue = 'K';
        int integerValue = 7;
        long longValue = 10000000;
        float floatValue = 2.5f;
        double doubleValue = 33.333;

        StringBuilder buffer = new StringBuilder();

        // Insert each value at index 0 (reverse stacking effect)
        buffer.insert(0, objectRef);
        buffer.insert(0, " ");
        buffer.insert(0, string);
        buffer.insert(0, " ");
        buffer.insert(0, charArray);
        buffer.insert(0, " ");
        buffer.insert(0, charArray, 3, 3);  // inserts 'd', 'e', 'f'
        buffer.insert(0, " ");
        buffer.insert(0, booleanValue);
        buffer.insert(0, " ");
        buffer.insert(0, characterValue);
        buffer.insert(0, " ");
        buffer.insert(0, integerValue);
        buffer.insert(0, " ");
        buffer.insert(0, longValue);
        buffer.insert(0, " ");
        buffer.insert(0, floatValue);
        buffer.insert(0, " ");
        buffer.insert(0, doubleValue);

        System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());

        buffer.deleteCharAt(10); // Deletes '5' from "2.5" (now "2.")
        buffer.delete(2, 6);      // Deletes ".333" from "33.333" (now "33")

        System.out.printf("buffer after deletes:%n%s%n", buffer.toString());
    }
}
