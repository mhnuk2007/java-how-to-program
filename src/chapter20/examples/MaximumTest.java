package chapter20.examples;
// Fig. 20.5: MaximumTest.java
// Generic method maximum returns the largest of three objects.

public class MaximumTest {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5,
                maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n",
                "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }

    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}
