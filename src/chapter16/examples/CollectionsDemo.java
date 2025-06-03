package chapter16.examples;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. sort
        List<String> names = new ArrayList<>(Arrays.asList("Mohan", "Zara", "Ali"));
        Collections.sort(names);
        System.out.println("Sorted names: " + names); // [Ali, Mohan, Zara]

        // 2. binarySearch (requires sorted list)
        int index = Collections.binarySearch(names, "Zara");
        System.out.println("Index of 'Zara': " + index); // 2

        // 3. reverse
        Collections.reverse(names);
        System.out.println("Reversed names: " + names); // [Zara, Mohan, Ali]

        // 4. shuffle
        Collections.shuffle(names);
        System.out.println("Shuffled names: " + names); // Random order

        // 5. fill
        List<String> fillList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.fill(fillList, "X");
        System.out.println("Filled list: " + fillList); // [X, X, X]

        // 6. copy
        List<String> source = Arrays.asList("Java", "Python", "C++");
        List<String> dest = new ArrayList<>(Arrays.asList("1", "2", "3"));
        Collections.copy(dest, source);
        System.out.println("Copied list: " + dest); // [Java, Python, C++]

        // 7. min and 8. max
        List<Integer> numbers = Arrays.asList(10, 30, 20, 5);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max); // Min: 5, Max: 30

        // 9. addAll
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "Red", "Green", "Blue");
        System.out.println("Colors: " + colors); // [Red, Green, Blue]

        // 10. frequency
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        int freq = Collections.frequency(fruits, "apple");
        System.out.println("Frequency of 'apple': " + freq); // 2

        // 11. disjoint
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        boolean isDisjoint = Collections.disjoint(list1, list2);
        System.out.println("Disjoint lists: " + isDisjoint); // true
    }
}
