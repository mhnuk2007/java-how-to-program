package chapter17.examples;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthMapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String str = input.nextLine();

        Function<String, Integer> getLength = s -> s.length();
        System.out.println("Length of the string: " + getLength.apply(str));

        input.close();
    }
}
