package chapter16.examples;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Initialize and populate the list
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(9);
        System.out.println("Original list: " + list);

        // Copy elements using ListIterator (forward)
        List<Integer> forwardList = iterateForward(list);
        System.out.println("Forward copied list: " + forwardList);

        // Copy elements in reverse using ListIterator
        List<Integer> reverseList = iterateBackward(list);
        System.out.println("Reversed copied list: " + reverseList);

        // Sort the list
        sortList(list);
        System.out.println("Sorted list: " + list);

        // Shuffle the list
        shuffleList(list);
        System.out.println("Shuffled list: " + list);

        // Replace even numbers with their squares
        squareEvenNumbers(list);
        System.out.println("Even numbers squared: " + list);

        // Remove all elements > 20
        removeGreaterThan(list, 20);
        System.out.println("After removing elements > 20: " + list);
    }

    // Forward iteration using ListIterator
    public static List<Integer> iterateForward(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
        return result;
    }

    // Backward iteration using ListIterator
    public static List<Integer> iterateBackward(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        return result;
    }

    // Sort list in ascending order
    public static void sortList(List<Integer> list) {
        list.sort(null); // null => natural ordering
    }

    // Shuffle the list randomly
    public static void shuffleList(List<Integer> list) {
        Collections.shuffle(list);
    }

    // Square even numbers using ListIterator
    public static void squareEvenNumbers(List<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val % 2 == 0) {
                it.set(val * val);
            }
        }
    }

    // Remove all elements greater than a threshold
    public static void removeGreaterThan(List<Integer> list, int threshold) {
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val > threshold) {
                it.remove();
            }
        }
    }
}
