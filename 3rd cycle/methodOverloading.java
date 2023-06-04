import java.util.Scanner;

public class methodOverloading {
    static double length, breadth;
    static float radius;
    static Scanner reader = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter the length, breadth and radius for calculations");
        length = reader.nextDouble();
        breadth = reader.nextDouble();
        radius = reader.nextFloat();
        display(calculateArea(length, breadth), "Rectangle");
        display(calculateArea(length), "Square");
        display(calculateArea(radius), "Circle");
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public static double calculateArea(double length) {
        return length * length;
    }

    public static double calculateArea(float radius) {
        return 3.14 * radius * radius;
    }

    public static void display(double area, String shapeName) {
        System.out.println("Area of " + shapeName + " = " + area);
    }
}