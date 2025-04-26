package Chapter6.exercises;
/*
    6.12 Write statements that assign random integers to the variable n in the following ranges:
        a) 1 ≤ n ≤ 2
        b) 1 ≤ n ≤ 100
        c) 0 ≤ n ≤ 9
        d) 1000 ≤ n ≤ 1112
        e) –1 ≤ n ≤ 1
        f) –3 ≤ n ≤ 11
    6.13 Write statements that will display a random number from each of the following sets:
        a) 2, 4, 6, 8, 10
        b) 3, 5, 7, 9, 11
        c) 6, 10, 14, 18, 22
 */

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // 6.12
        // a) 1 ≤ n ≤ 2
        int n1 = 1 + random.nextInt(2);
        System.out.println("6.12 a) Random integer between 1 and 2: " + n1);

        // b) 1 ≤ n ≤ 100
        int n2 = 1 + random.nextInt(100);
        System.out.println("6.12 b) Random integer between 1 and 100: " + n2);

        // c) 0 ≤ n ≤ 9
        int n3 = random.nextInt(10);
        System.out.println("6.12 c) Random integer between 0 and 9: " + n3);

        // d) 1000 ≤ n ≤ 1112
        int n4 = 1000 + random.nextInt(113);
        System.out.println("6.12 d) Random integer between 1000 and 1112: " + n4);

        // e) –1 ≤ n ≤ 1
        int n5 = -1 + random.nextInt(3);
        System.out.println("6.12 e) Random integer between -1 and 1: " + n5);

        // f) –3 ≤ n ≤ 11
        int n6 = -3 + random.nextInt(15);
        System.out.println("6.12 f) Random integer between -3 and 11: " + n6);

        // 6.13
        // a) 2, 4, 6, 8, 10
        int n7 = 2 + random.nextInt(5) * 2;
        System.out.println("6.13 a) Random number from set {2, 4, 6, 8, 10}: " + n7);

        // b) 3, 5, 7, 9, 11
        int n8 = 3 + random.nextInt(5) * 2;
        System.out.println("6.13 b) Random number from set {3, 5, 7, 9, 11}: " + n8);

        // c) 6, 10, 14, 18, 22
        int n9 = 6 + random.nextInt(5) * 4;
        System.out.println("6.13 c) Random number from set {6, 10, 14, 18, 22}: " + n9);
    }
}
