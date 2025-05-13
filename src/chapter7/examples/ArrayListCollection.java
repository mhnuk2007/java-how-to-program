package chapter7.examples;

// Fig. 7.24: ArrayListCollection.java
// Demonstrates basic operations on a generic ArrayList.

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> items = new ArrayList<>();

        // Add elements to the ArrayList
        items.add("red");              // Add "red" at the end
        items.add(0, "yellow");        // Insert "yellow" at index 0

        // Display using counter-controlled loop
        System.out.print("Display list contents with counter-controlled loop: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s ", items.get(i));
        }

        // Display using enhanced for-loop
        display(items, "\nDisplay list contents with enhanced for statement: ");

        // Add more elements
        items.add("green");
        items.add("yellow");          // Duplicate value added

        display(items, "\nList with two new elements:");

        // Remove first occurrence of "yellow"
        items.remove("yellow");
        display(items, "\nAfter removing first instance of \"yellow\":");

        // Remove element at index 1
        items.remove(1);
        display(items, "\nAfter removing element at index 1:");

        // Check if "red" exists
        System.out.printf("\n\"red\" is %sin the list%n",
                items.contains("red") ? "" : "not ");

        // Display size
        System.out.printf("Size of the list: %d%n", items.size());
    }

    // Utility method to display ArrayList elements
    public static void display(ArrayList<String> items, String header) {
        System.out.print(header + " ");
        for (String item : items) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
