package chapter14.examples;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb); // Hello

        // 1. Append
        sb.append(" World");
        System.out.println("After append: " + sb); // Hello World

        // 2. Insert a comma after "Hello"
        sb.insert(5, ",");
        System.out.println("After insert: " + sb); // Hello, World

        // 3. Replace characters from index 6 to 11 with "Java"
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb); // Hello,Javad

        // 4. Delete comma at index 5
        sb.delete(5, 6);
        System.out.println("After delete: " + sb); // HelloJavad

        // 5. Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // davaJolleH

        // 6. Reverse again to restore original order
        sb.reverse();
        System.out.println("Re-reversed: " + sb); // HelloJavad

        // 7. Replace character at index 5 with underscore
        sb.setCharAt(5, '_');
        System.out.println("After setCharAt: " + sb); // Hello_avad

        // 8. Get character at index 0
        char ch = sb.charAt(0);
        System.out.println("charAt(0): " + ch); // H

        // 9. Current length of the string
        System.out.println("Length: " + sb.length()); // 10

        // 10. Current capacity (buffer size)
        System.out.println("Capacity: " + sb.capacity()); // Default is 16 + 5 = 21

        // 11. Ensure a minimum capacity of 50
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity()); // At least 50

        // 12. Substring from index 6 to 10 using toString
        String sub = sb.toString().substring(6, 10);
        System.out.println("Substring (6 to 10): " + sub); // avad
    }
}
