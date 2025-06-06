package chapter17.examples;
//Discount Calculator using BiFunction

import java.util.Scanner;
import java.util.function.BiFunction;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = input.nextDouble();

        BiFunction<Double, Double, Double> applyDiscount = (p,d) -> p - (p*d/100);

        System.out.println("Final Price: " + applyDiscount.apply(originalPrice, discountPercentage));


    }

}
