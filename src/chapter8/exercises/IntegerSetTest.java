package chapter8.exercises;
/*
Exercise: 8.13 (Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the
range 0–100. The set is represented by an array of booleans. Array element a[i] is true if integer i
is in the set. Array element a[j] is false if integer j is not in the set. The no-argument constructor
initializes the array to the “empty set” (i.e., all false values).
Provide the following methods: The static method union creates a set that’s the set-theoretic
union of two existing sets (i.e., an element of the new set’s array is set to true if that element is true
in either or both of the existing sets—otherwise, the new set’s element is set to false). The static
method intersection creates a set which is the set-theoretic intersection of two existing sets (i.e.,
an element of the new set’s array is set to false if that element is false in either or both of the
existing sets—otherwise, the new set’s element is set to true). Method insertElement inserts a new
integer k into a set (by setting a[k] to true). Method deleteElement deletes integer m (by setting
a[m] to false). Method toString returns a String containing a set as a list of numbers separated
by spaces. Include only those elements that are present in the set. Use --- to represent an empty
set. Method isEqualTo determines whether two sets are equal. Write a program to test class IntegerSet.
Instantiate several IntegerSet objects. Test that all your methods work properly.
 */

import java.util.Arrays;

class IntegerSet {
    private final boolean[] set;

    // Constructor: initializes empty set
    public IntegerSet() {
        set = new boolean[101]; // integers from 0 to 100
        Arrays.fill(set, false);
    }

    // Insert element k into the set
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            throw new IllegalArgumentException("Element must be in range 0 to 100.");
        }
    }

    // Delete element m from the set
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            throw new IllegalArgumentException("Element must be in range 0 to 100.");
        }
    }

    // Static method: union of two sets
    public static IntegerSet union(IntegerSet s1, IntegerSet s2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = s1.set[i] || s2.set[i];
        }
        return result;
    }

    // Static method: intersection of two sets
    public static IntegerSet intersection(IntegerSet s1, IntegerSet s2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = s1.set[i] && s2.set[i];
        }
        return result;
    }

    // Returns true if this set equals other set
    public boolean isEqualTo(IntegerSet other) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != other.set[i]) {
                return false;
            }
        }
        return true;
    }

    // Returns a string representation of the set
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }

        if (isEmpty) {
            return "---";
        }

        return sb.toString().trim();
    }
}

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Insert elements in set1
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        // Insert elements in set2
        set2.insertElement(3);
        set2.insertElement(4);
        set2.insertElement(5);

        System.out.println("Set1: " + set1); // Expected: 1 3 5
        System.out.println("Set2: " + set2); // Expected: 3 4 5

        // Union
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union: " + unionSet); // Expected: 1 3 4 5

        // Intersection
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet); // Expected: 3 5

        // Delete element from set1
        set1.deleteElement(3);
        System.out.println("Set1 after deleting 3: " + set1); // Expected: 1 5

        // Equality check
        System.out.println("Set1 equals Set2? " + set1.isEqualTo(set2)); // Expected: false

        // Insert elements to make sets equal
        set1.insertElement(4);
        set1.insertElement(3);
        set1.deleteElement(1);

        System.out.println("Set1 now: " + set1); // Expected: 3 4 5
        System.out.println("Set2 now: " + set2); // Expected: 3 4 5
        System.out.println("Set1 equals Set2? " + set1.isEqualTo(set2)); // Expected: true

        // Test empty set
        IntegerSet emptySet = new IntegerSet();
        System.out.println("Empty set: " + emptySet); // Expected: ---
    }
}
