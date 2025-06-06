package chapter17.examples;

interface Printable {
    void print();

}

class Cat implements Printable{
    String name;
    int age;
    public Cat(){};
    public void print(){
        System.out.println("Meow");

    }
}


public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print();
    }


}
