package chapter4.Examples;
// Fig. 4.5: StudentTest.java
// Create and test Student objects.

public class StudentTest {
    public static void main(String[] args) {

        Student account1 = new Student("Honey Chauhan", 74.33);
        Student account2 = new Student("Sunny Chauhan", 97.50);

        System.out.printf("%s's letter grade is %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade());
    }
}