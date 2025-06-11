package chapter19.examples;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;


        while (left<=right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] data = {2, 5, 10, 30, 34, 51, 52, 56, 77, 93};
        int key = 25;

        int result = binarySearch(data, key);
        if (result!=-1)
        System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

}
