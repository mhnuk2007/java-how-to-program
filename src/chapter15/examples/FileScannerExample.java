package chapter15.examples;

import java.util.Scanner;
import java.io.File;

public class FileScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("example2.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
