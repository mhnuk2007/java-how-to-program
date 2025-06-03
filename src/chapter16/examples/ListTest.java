package chapter16.examples;
// Fig. 16.3: ListTest.java
// Lists, LinkedLists and ListIterators.

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        // add colors elements to list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();
        for (String color : colors) {
            list1.add(color);
        }

        // Print initial list
        System.out.println("Initial list1: " + list1);

        // add colors2 elements to list2
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        for (String color : colors2) {
            list2.add(color);
        }
        System.out.println("Initial list2: " + list2);
        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        System.out.println("Updated list1: " + list1);
        System.out.println("Updated list2: " + list2);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6 ");
        removeItems(list1, 4, 7);// remove items 4-6 from list
        printList(list1); // print list1 elements

        printReversedList(list1); // print list in reverse order

    }

    // output List contents
    public static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }

    }

    public static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to uppercase
        }
    }

    // obtain sublist and use clear method to delete sublist items
    public static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    // print reversed list
    public static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");
        // print list in reverse order
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }


} // end class ListTest
