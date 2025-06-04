package chapter16.examples;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // a) add(E element)
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        System.out.println("After add: " + vector); // [Java, Python, C++]

        // b) set(int index, E element)
        vector.set(1, "JavaScript");
        System.out.println("After set: " + vector); // [Java, JavaScript, C++]

        // c) remove(int index)
        vector.remove(2);
        System.out.println("After remove: " + vector); // [Java, JavaScript]

        // d) removeAllElements()
        vector.removeAllElements();
        System.out.println("After removeAllElements: " + vector); // []

        // Re-adding elements for further examples
        vector.add("HTML");
        vector.add("CSS");
        vector.add("SQL");

        // e) removeElementAt(int index)
        vector.removeElementAt(1);
        System.out.println("After removeElementAt: " + vector); // [HTML, SQL]

        // f) firstElement()
        System.out.println("First element: " + vector.firstElement()); // HTML

        // g) lastElement()
        System.out.println("Last element: " + vector.lastElement()); // SQL

        // h) contains(Object o)
        System.out.println("Contains 'SQL'? " + vector.contains("SQL")); // true
        System.out.println("Contains 'Java'? " + vector.contains("Java")); // false

        // i) indexOf(Object o)
        System.out.println("Index of 'SQL': " + vector.indexOf("SQL")); // 1
        System.out.println("Index of 'Java': " + vector.indexOf("Java")); // -1

        // j) size()
        System.out.println("Size of vector: " + vector.size()); // 2

        // k) capacity()
        System.out.println("Capacity of vector: " + vector.capacity()); // Default is 10 (may vary)
    }
}
