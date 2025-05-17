package chapter9.examples;

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Circle's draw
        s2.draw(); // Square's draw
    }
}
