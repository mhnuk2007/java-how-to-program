package chapter16.examples;

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
