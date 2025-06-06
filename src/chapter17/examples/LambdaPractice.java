package chapter17.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaPractice{
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> squares = numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());

        System.out.println(squares);

        List<Integer> squares2 = numbers.stream()
                .map(x->x*x)
                .toList();
        System.out.println(squares2);

        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);
        for (int n:list)
            System.out.println(n);
        list.forEach(n -> System.out.println(n)); // You’re telling what to do with each element

        int x = 5;
        int y = 10;
        MyAdder adder = (a,b)-> System.out.println(a+b);

        adder.add(x,y);





    }
}

@FunctionalInterface
interface MyAdder{
    void add(int a, int b);
}