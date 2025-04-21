package chapter5.exercises;
/*
    5.3 Write a Java statement or a set of Java statements to accomplish each of the
    following tasks:


 */

public class Ex_5_3 {
    public static void main(String[] args) {

        //a) Sum the odd integers between 1 and 99, using a for statement. Assume that the
        //   integer variables sum and count have been declared.
        int sum = 0;
        int count = 0;

        while (count < 100) {
            if (count % 2 == 1) {
                sum += count;
            }
            count++;
        }
        System.out.printf("Sum of odd integer between 1 and 99 is %d%n", sum);
        System.out.println();

        //b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
        double num = 2.5;
        double power = Math.pow(num, 3);

        System.out.printf("The value of 2.5 raised to the power of 3 is %f%n", power);
        System.out.println();

        //c) Print the integers from 1 to 20, using a while loop and the counter variable
        // i. Assume that the variable i has been declared, but not initialized. Print only
        // five integers per line.
        //[Hint: Use the calculation i % 5. When the value of this expression is 0, print a
        // newline character; otherwise, print a tab character. Assume that this code is
        // an application. Use the System.out.println() method to output the newline
        // character, and use the System.out.print('\t') method to output the tab character.]
        int i;
        i = 1;
        while (i <= 20) {
            System.out.printf("%d\t", i);
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
        System.out.println();
        //d) Repeat part (c), using a for statement.
        for (i = 1; i <= 20; i++){
            System.out.printf("%d\t", i);
            if (i % 5 == 0) {
                System.out.println();
            }
        }

    }


}
