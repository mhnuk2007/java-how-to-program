package chapter10.exercises.shapehierarchy;
/*
Exercise: 10.13 (Project: Shape Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each TwoDimensionalShape should contain method getArea to calculate the area of the two-dimensional
shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
surface area and volume, respectively, of the three-dimensional shape. Create a program that uses
an array of Shape references to objects of each concrete class in the hierarchy. The program should
print a text description of the object to which each array element refers. Also, in the loop that processes all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimensionalShape, display its area and volume.
 */

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5.0),
            new Square(4.0),
            new Sphere(3.0),
            new Cube(2.5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape); // print shape description

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape td = (TwoDimensionalShape) shape;
                System.out.printf("Area: %.2f%n", td.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape td = (ThreeDimensionalShape) shape;
                System.out.printf("Area: %.2f, Volume: %.2f%n", td.getArea(), td.getVolume());
            }

            System.out.println("------------------------------------------------");
        }
    }
}
