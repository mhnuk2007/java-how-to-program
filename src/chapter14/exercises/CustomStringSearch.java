package chapter14.exercises;
/*
Exercise: 14.16 (Defining Your Own String Methods) Write your own versions of String search methods
indexOf and lastIndexOf.
 */

public class CustomStringSearch {

    // Returns the index of the first occurrence of 'target' in 'source'
    public static int customIndexOf(String source, String target) {
        int sourceLength = source.length();
        int targetLength = target.length();

        // Edge cases
        if (targetLength == 0) return 0;
        if (targetLength > sourceLength) return -1;

        // Loop through source string
        for (int i = 0; i <= sourceLength - targetLength; i++) {
            int j;
            for (j = 0; j < targetLength; j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break; // mismatch, break inner loop
                }
            }
            if (j == targetLength) {
                return i; // found match starting at index i
            }
        }

        return -1; // no match found
    }

    // Returns the index of the last occurrence of 'target' in 'source'
    public static int customLastIndexOf(String source, String target) {
        int sourceLength = source.length();
        int targetLength = target.length();

        if (targetLength == 0) return sourceLength;
        if (targetLength > sourceLength) return -1;

        // Loop backwards from the end
        for (int i = sourceLength - targetLength; i >= 0; i--) {
            int j;
            for (j = 0; j < targetLength; j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break; // mismatch
                }
            }
            if (j == targetLength) {
                return i; // found match starting at index i
            }
        }

        return -1; // no match found
    }

    public static void main(String[] args) {
        String source = "hello world, welcome to the world of Java";
        String target = "world";

        int firstIndex = customIndexOf(source, target);
        int lastIndex = customLastIndexOf(source, target);

        System.out.println("Custom indexOf: First occurrence of '" + target + "' is at index " + firstIndex);
        System.out.println("Custom lastIndexOf: Last occurrence of '" + target + "' is at index " + lastIndex);
    }
}
