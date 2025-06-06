package chapter17.examples;

interface Printable {
    void print(String suffix);

}

class Cat {
    String name;
    int age;
    public Cat(){};


}


public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Printable lambdaPrintable = (s)->System.out.println("Meow" + s);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print("!");
    }
}

