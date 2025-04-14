package chapter4.Exercises;
/*
    4.33 (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying
    in the command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and
    so on. Your loop should not terminate (i.e., it should create an infinite loop).
    What happens when you run this program?
 */

public class InfiniteWhileLoop {
    public static void main(String[] args) {
        int number = 2;
        while (number>0){
            System.out.println(number);
            number *= 2;
        }
    }
}
