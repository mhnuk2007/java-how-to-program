package chapter20.examples;
// Fig. 20.13: TotalNumbers.java
// Totaling the numbers in an ArrayList<Number>.

import java.util.ArrayList;

public class TotalNumbers {
    public static void main(String[] args) {
        // create, initialize and output ArrayList of Numbers containing
        // both Integers and Doubles, then display total of the elements
        Number[] numbers = {1,2.4,3,4.1}; // Integers and Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element:numbers){
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList", sum(numberList));
    }

    // calculate total of ArrayList elements
    public static double sum(ArrayList<Number> list) {
        double total = 0;
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }
}  // end class TotalNumbers

