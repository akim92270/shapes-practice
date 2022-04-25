import java.util.ArrayList;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object
        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4
         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area
         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12
         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0
         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0
         Circle has the largest area as 50.24
         */


        //Creating Objects
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        rectangle.setWidth(5.5);
        rectangle.setHeight(6);
        square.setSide(2.5);
        circle.setRadius(4);

        //Object Collection
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(circle);


        //Printing circle info
        System.out.println("\n" + circle);
        System.out.println("Area of the Circle is = " + circle.area());
        System.out.println("Perimeter of the Circle is = " + circle.perimeter());

        //Printing rectangle info
        System.out.println("\n" + rectangle);
        System.out.println("Area of the Rectangle is = " + rectangle.area());
        System.out.println("Perimeter of the Rectangle is = " + rectangle.perimeter());

        //Printing square info
        System.out.println("\n" + square);
        System.out.println("Area of the Square is = " + square.area());
        System.out.println("Perimeter of the Square is = " + square.perimeter());

        double max = Double.MIN_VALUE;
        Shape objectName = null;
        for (Shape shape : shapes) {
            if(shape.area() > max) max = shape.area();
            objectName = shape;
        }

        System.out.println("\n" + objectName.getClass().getSimpleName() + " has the largest area as " + max);
    }
}