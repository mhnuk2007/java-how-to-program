package Chapter6.exercises;
/*
    6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors,
    including 1 (but not the number itself), sum to the number. For example, 6 is a perfect
    number, because 6 = 1 + 2 + 3. Write a method isPerfect that determines whether parameter
    number is a perfect number.
    Use this method in an application that displays all the perfect numbers between 1 and 1000.
    Display the factors of each perfect number to confirm that the number is indeed perfect.
    Challenge the computing power of your computer by testing numbers much larger than 1000.
    Display the results.
 */

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.printf("%d is perfect number. Factors: ", number);
                displayFactors(number);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void displayFactors(int number){
        for (int i = 1; i <= number/2 ; i++) {
            if (number%i == 0){
                System.out.print(i + " ");
            }

        }
    }

}

