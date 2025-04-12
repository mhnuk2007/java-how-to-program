package chapter4.Exercises;
/*
    4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get.
    One driver has kept track of several trips by recording the miles driven and gallons
    used for each tankful. Develop a Java application that will input the miles driven
    and gallons used (both as integers) for each trip. The program should calculate and
    display the miles per gallon obtained for each trip and print the combined miles per
    gallon obtained for all trips up to this point. All averaging calculations should
    produce floating-point results. Use class Scanner and sentinel-controlled repetition
    to obtain the data from the user.
 */

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();

        while (miles!=-1){
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
            double mpg = (double) miles/gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);


            totalMiles = totalMiles+miles;
            totalGallons=totalGallons+gallons;

            double totalMpg = (double) totalMiles/totalGallons;
            System.out.printf("Combined miles per gallon so far : %.2f%n", totalMpg);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        if (totalGallons!=0){
            System.out.printf("%nFinal combined MPG for all trips: %.2f%n", (double) totalMiles/totalGallons);
        } else {
            System.out.println("No data entered");
        }



    }
}
