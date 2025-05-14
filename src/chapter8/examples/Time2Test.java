package chapter8.examples;

// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // invoke default constructor
        Time2 t2 = new Time2(2); // invoke constructor with one argument
        Time2 t3 = new Time2(2, 30); // invoke constructor with two arguments
        Time2 t4 = new Time2(2, 30, 45); // invoke constructor with three arguments
        Time2 t5 = new Time2(t4); // invoke constructor with another Time2 object

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: one argument", t2);
        displayTime("t3: two arguments", t3);
        displayTime("t4: three arguments", t4);
        displayTime("t5: another Time2 object", t5);


    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n%s%n%s%n%n",
                header, t.toUniversalString(), t.toString());
    }

} // end class Time2Test