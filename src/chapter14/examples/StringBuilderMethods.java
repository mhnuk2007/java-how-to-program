package chapter14.examples;

// Demonstrates various StringBuilder methods in Java
public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // append() - Appends the given value to the builder
        sb.append(" Programming");
        System.out.println("append(): " + sb); // Java Programming

        // insert() - Inserts value at a specific index
        sb.insert(5, "Language ");
        System.out.println("insert(): " + sb); // Java Language Programming

        // delete() - Deletes characters from start index (inclusive) to end index (exclusive)
        sb.delete(5, 13);
        System.out.println("delete(): " + sb); // Java Programming

        // deleteCharAt() - Deletes the character at specified index
        sb.deleteCharAt(4);
        System.out.println("deleteCharAt(): " + sb); // JavaProgramming

        // replace() - Replaces characters between two indices with given string
        sb.replace(4, 15, " is Powerful");
        System.out.println("replace(): " + sb); // Java is Powerful

        // reverse() - Reverses the contents of the builder
        sb.reverse();
        System.out.println("reverse(): " + sb); // lufrewoP si avaJ

        // reverse again to original
        sb.reverse();

        // capacity() - Returns current capacity of the StringBuilder object
        System.out.println("capacity(): " + sb.capacity());

        // ensureCapacity() - Ensures capacity is at least the specified value
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        // setCharAt() - Replaces the character at specified index
        sb.setCharAt(0, 'j');
        System.out.println("setCharAt(): " + sb); // java is Powerful

        // charAt() - Returns the character at the given index
        System.out.println("charAt(5): " + sb.charAt(5)); // 'i'

        // length() - Returns the number of characters in the builder
        System.out.println("length(): " + sb.length()); // Length of the string

        // substring() - Returns substring from start to end (like String)
        System.out.println("substring(5): " + sb.substring(5)); // is Powerful
        System.out.println("substring(5, 7): " + sb.substring(5, 7)); // is

        // indexOf() - Not directly available in StringBuilder; convert to String
        System.out.println("indexOf(\"Power\"): " + sb.toString().indexOf("Power"));

        // toString() - Converts StringBuilder to a String
        String str = sb.toString();
        System.out.println("toString(): " + str);

        // setLength() - Sets the length of the character sequence
        sb.setLength(4);
        System.out.println("setLength(4): " + sb); // java (trimmed to 4 chars)

        // appendCodePoint() - Appends the character represented by the Unicode code point
        sb.appendCodePoint(33); // '!'
        System.out.println("appendCodePoint(33): " + sb); // java!

        // trimToSize() - Trims the capacity to match the current length
        sb.trimToSize();
        System.out.println("trimToSize() called. Capacity now: " + sb.capacity());
    }
}
