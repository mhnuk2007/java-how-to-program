package chapter4.Exercises;
/*
    4.22 (Tabular Output)
    Write a Java application that uses looping to print the following table of values:

    N   10*N   100*N   1000*N
    1   10     100     1000
    2   20     200     2000
    3   30     300     3000
    4   40     400     4000
    5   50     500     5000
*/

public class TabularOutPut {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d%n", i, i * 10, i * 100, i * 1000);
        }
    }
}
