package chapter2;
/*
    2.31 (Table of Squares and Cubes) Using only the programming techniques you learned
    in this chapter, write an application that calculates the squares and cubes of the
    numbers from 0 to 10 and prints the resulting values in table format, as shown below.
 */
public class Ex_2_31 {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
        System.out.printf("%d\t\t%d\t\t%d%n", 0, 0*0, 0*0*0);
        System.out.printf("%d\t\t%d\t\t%d%n", 1, 1*1, 1*1*1);
        System.out.printf("%d\t\t%d\t\t%d%n", 2, 2*2, 2*2*2);
        System.out.printf("%d\t\t%d\t\t%d%n", 3, 3*3, 3*3*3);
        System.out.printf("%d\t\t%d\t\t%d%n", 4, 4*4, 4*4*4);
        System.out.printf("%d\t\t%d\t\t%d%n", 5, 5*5, 5*5*5);
        System.out.printf("%d\t\t%d\t\t%d%n", 6, 6*6, 6*6*6);
        System.out.printf("%d\t\t%d\t\t%d%n", 7, 7*7, 7*7*7);
        System.out.printf("%d\t\t%d\t\t%d%n", 8, 8*8, 8*8*8);
        System.out.printf("%d\t\t%d\t\t%d%n", 9, 9*9, 9*9*9);
        System.out.printf("%d\t\t%d\t\t%d%n", 10, 10*10, 10*10*10);
    }
}
