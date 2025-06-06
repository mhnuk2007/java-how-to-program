package chapter17.examples;

interface Printable {
    void print();

}

class Cat {
    String name;
    int age;
    public Cat(){};


}


public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Printable lambdaPrintable = ()->System.out.println("Meow");
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print();
    }
}

