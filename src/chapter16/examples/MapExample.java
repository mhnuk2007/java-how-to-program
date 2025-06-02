package chapter16.examples;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Mohan");
        users.put(2, "Suneel");

        for (Integer id : users.keySet()) {
            System.out.println(id + ": " + users.get(id));
        }
    }
}
