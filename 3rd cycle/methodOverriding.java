import java.util.Scanner;

public class methodOverriding {
    static double l, b, r;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        out("Enter the length and breadth of the Rectangle: ");
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", rectangle.calculateArea()));
        out("Enter the radius of the circle");

        Circle circle = new Circle(scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", circle.calculateArea()));
        out("Enter the length of one side of the sqaure");
        Square square = new Square(scanner.nextDouble());
        System.out.println(String.format("Rectangle area: %,.2f", square.calculateArea()));
    }

    private static void out(String msg) {
        System.out.println(msg);
    }
}

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
