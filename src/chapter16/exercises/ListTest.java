package chapter16.exercises;
/*
16.12 Rewrite lines 16–25 in Fig. 16.3 to be more concise by using the asList method
and the LinkedList constructor that takes a Collection argument.
 */
// Fig. 16.3: ListTest.java
// Using the LinkedList class.
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        // Create and initialize lists using Arrays.asList and LinkedList constructor
        List<String> list1 = new LinkedList<>(
            Arrays.asList("black", "blue", "yellow", "red", "green", "orange", "white"));

        List<String> list2 = new LinkedList<>(
            Arrays.asList("gold", "white", "brown", "blue", "gray", "silver"));

        // Concatenate lists
        list1.addAll(list2); 
        list2 = null; // release resources

        printList(list1); // print list1 elements
        convertToUppercaseStrings(list1); // convert to uppercase string elements
        printList(list1); // print list1 elements

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4–6
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order
    }

    // output List contents
    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String color : list)
            System.out.printf("%s ", color);
        System.out.println();
    }

    // locate String objects and convert to uppercase
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to uppercase
        }
    }

    // remove items from list
    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear(); // remove elements
    }

    // print reversed list
    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");
        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
        System.out.println();
    }
}
