package chapter15.examples;

import java.util.Formatter;
import java.io.FileNotFoundException;

public class FormatterExample {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter formatter = new Formatter("output2.txt");
        formatter.format("Name: %s\nAge: %d\n", "Alice", 30);
        formatter.close();
    }
}
