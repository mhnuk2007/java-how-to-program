package chapter9.examples;

// Superclass
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Subclass
class Student extends Person {
    private int rollNo;

    public Student(String name, int rollNo) {
        super(name); // calling superclass constructor
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        super.display(); // call superclass method
        System.out.println("Roll No: " + rollNo);
    }
}

// Test
public class InheritanceExample1 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}
