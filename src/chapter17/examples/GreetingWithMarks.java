package chapter17.examples;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class GreetingWithMarks {
    public static void main(String[] args) {

        // Step 1: Create and populate the HashMap
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("Honey", 99);
        studentMarks.put("Sunny", 100);

        // Step 2: Ask user for a name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String inputName = scanner.nextLine();

        // Step 3: Lambda to display greeting and marks
        BiConsumer<String, Integer> greetStudent = (name, marks) ->
                System.out.println("Hello " + name + "! Your marks are: " + marks);

        // Step 4: Use the lambda if the name exists
        if (studentMarks.containsKey(inputName)) {
            greetStudent.accept(inputName, studentMarks.get(inputName));
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
