package chapter16.exercises;
/*
16.18 (Copying and Reversing LinkedLists) Write a program that creates a LinkedList
object of 10 characters, then creates a second LinkedList object containing a copy of
the first list, but in reverse order.
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Step 1: Create and fill the first LinkedList with 10 characters
        LinkedList<Character> originalList = new LinkedList<>();
        originalList.add('A');
        originalList.add('B');
        originalList.add('C');
        originalList.add('D');
        originalList.add('E');
        originalList.add('F');
        originalList.add('G');
        originalList.add('H');
        originalList.add('I');
        originalList.add('J');

        System.out.println("Original List: " + originalList);

        // Step 2: Create the second LinkedList by copying in reverse
        LinkedList<Character> reversedList = new LinkedList<>();

        // Use a ListIterator starting at the end
        ListIterator<Character> iterator = originalList.listIterator(originalList.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }

        System.out.println("Reversed List: " + reversedList);
    }
}
