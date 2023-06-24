import java.util.Scanner;

public class abstractShapes {
    static double l, b, r;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        out("Enter the length and breadth of the Rectangle: ");
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", rectangle.findArea()));
        out("Enter the radius of the circle");

        Circle circle = new Circle(scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", circle.findArea()));
        out("Enter the length of one side of the sqaure");
        Square square = new Square(scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", square.findArea()));
    }

    private static void out(String msg) {
        System.out.println(msg);
    }
}

abstract class Shape {
    abstract double findArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double findArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    double findArea() {
        return Math.pow(side, 2);
    }
}
