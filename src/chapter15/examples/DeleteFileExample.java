package chapter15.examples;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
