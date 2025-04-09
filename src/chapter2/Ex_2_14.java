/*
    Write an application that displays the numbers 1 to 4 on the same line, with each
    pair of adjacent numbers separated by one space. Use the following techniques:
    a) Use one System.out.println statement.
    b) Use four System.out.print statements.
    c) Use one System.out.printf statement.
 */

package chapter2;
public class Ex_2_14 {
    public static void main(String[] args) {
        System.out.println("1 2 3 4");
        System.out.println("---------");
        System.out.println();
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");
        System.out.println();
        System.out.println("---------");
        System.out.println();
        System.out.printf("%d %d %d %d %n", 1,2,3,4);

    }

}
