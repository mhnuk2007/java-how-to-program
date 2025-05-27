package chapter15.examples;

import java.io.*;

public class RedirectExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("output.txt");
        System.setOut(fileOut); // Redirect System.out to a file
        System.out.println("This text will go into output.txt!");
    }
}
