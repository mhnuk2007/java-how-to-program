package chapter19.examples;

public class LinerSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 8, 4, 6, 7, 10, 9};
        int key = 2;
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
    }
}
