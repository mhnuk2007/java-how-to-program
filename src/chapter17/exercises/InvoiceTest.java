package chapter17.exercises;
/*
Exercise: 17.11
Given an array of Invoice objects with fields: part number, part description, quantity, and price:
    a. How can you sort the invoices by part description using streams and lambdas?
    b. How can you sort the invoices by price?
    c. How can you map each invoice to its part description and quantity, then sort by quantity?
    d. How can you map each invoice to its part description and invoice value (quantity × price), then sort by invoice value?
    e. How can you filter the results from part (4) to show only invoice values between $200 and $500?
 */

import java.util.Arrays;
import java.util.Comparator;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice(83, "Electric sander", 7, 57.98),
                new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Sledge hammer", 11, 21.50),
                new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn mower", 3, 79.50),
                new Invoice(68, "Screwdriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50)
        };

        System.out.println("a. Invoices sorted by part description");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("b. Invoices sorted by price");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("c. Invoices mapped to part description and quantity, sorted by quantity");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .map(invoice -> String.format("%-20s %5d", invoice.getPartDescription(), invoice.getQuantity()))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("d. Invoices mapped to part description and invoice value, sorted by invoice value");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(invoice -> invoice.getQuantity() * invoice.getPrice()))
                .map(invoice -> String.format("%-20s %10.2f", invoice.getPartDescription(), invoice.getQuantity() * invoice.getPrice()))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("e. Invoices filtered by invoice value between $200 and $500");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(invoice -> invoice.getQuantity() * invoice.getPrice()))
                .filter(invoice -> invoice.getQuantity() * invoice.getPrice() >= 200 && invoice.getQuantity()*invoice.getPrice()<=500)
                .map(invoice -> String.format("%-20s %10.2f", invoice.getPartDescription(), invoice.getQuantity()* invoice.getPrice()))
                .forEach(System.out::println);
        System.out.println();



    }
}
