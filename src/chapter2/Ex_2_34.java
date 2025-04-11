package chapter2;
/*
    2.34 (World Population Growth Calculator) Use the web to determine the current world
    population and the annual world population growth rate. Write an application that
    inputs these values, then displays the estimated world population after one, two,
    three, four and five years.
 */

import java.util.Scanner;

public class Ex_2_34 {

    public static void main(String[] args) {

        long currentPopulation = 8_191_988_453L;
        double growthRate = 0.009;

        long populationYear1 = (long) (currentPopulation * Math.pow(1 + growthRate, 1));
        long populationYear2 = (long) (currentPopulation * Math.pow(1 + growthRate, 2));
        long populationYear3 = (long) (currentPopulation * Math.pow(1 + growthRate, 3));
        long populationYear4 = (long) (currentPopulation * Math.pow(1 + growthRate, 4));
        long populationYear5 = (long) (currentPopulation * Math.pow(1 + growthRate, 5));


        System.out.println("\nYear\tEstimated Population");
        System.out.printf("%d\t\t%,d%n", 1, populationYear1);
        System.out.printf("%d\t\t%,d%n", 2, populationYear2);
        System.out.printf("%d\t\t%,d%n", 3, populationYear3);
        System.out.printf("%d\t\t%,d%n", 4, populationYear4);
        System.out.printf("%d\t\t%,d%n", 5, populationYear5);


    }
}




