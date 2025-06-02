package chapter16.examples;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
