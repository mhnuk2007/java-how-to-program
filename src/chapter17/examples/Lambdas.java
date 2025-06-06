package chapter17.examples;

interface Printable {
    void print(String prefix, String suffix);

}

class Cat {
    String name;
    int age;
    public Cat(){};


}


public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Printable lambdaPrintable = (p, s)->System.out.println(p + " Meow" + s);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print("Hello", "!");
    }
}

