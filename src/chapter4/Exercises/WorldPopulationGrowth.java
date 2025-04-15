package chapter4.Exercises;
/*
    4.39 (World Population Growth) World population has grown considerably over the centuries.
Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
cropland and other limited resources. There’s evidence that growth has been slowing in recent years
and that world population could peak some time this century, then start to decline.
For this exercise, research world population growth issues online. Be sure to investigate various
viewpoints. Get estimates for the current world population and its growth rate (the percentage by
which it’s likely to increase this year). Write a program that calculates world population growth
each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
constant. Print the results in a table. The first column should display the year from year 1 to year
75. The second column should display the anticipated world population at the end of that year.
The third column should display the numerical increase in the world population that would occur
that year. Using your results, determine the year in which the population would be double what it
is today, if this year’s growth rate were to persist.
 */

import java.text.NumberFormat;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long currentPopulation = 8000000000L; // Example: 8 billion
        double growthRate = 0.0105; // Example: 1.05% annual growth

        NumberFormat formatter = NumberFormat.getInstance();

        System.out.printf("%-6s %-25s %-25s%n", "Year", "Projected Population", "Population Increase");

        long doubledPopulation = currentPopulation * 2;
        int yearToDouble = -1;

        for (int year = 1; year <= 75; year++) {
            long increase = (long)(currentPopulation * growthRate);
            currentPopulation += increase;

            System.out.printf("%-6d %-25s %-25s%n", year, formatter.format(currentPopulation), formatter.format(increase));

            if (yearToDouble == -1 && currentPopulation >= doubledPopulation) {
                yearToDouble = year;
            }
        }

        if (yearToDouble != -1) {
            System.out.println("\nThe population will double in year: " + yearToDouble);
        } else {
            System.out.println("\nThe population will not double within 75 years.");
        }
    }
}
