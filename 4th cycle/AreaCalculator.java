package ShapesArea;
import java.util.Scanner;

interface CalculateArea{
	double area();
}

class AreaCalculator{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
		int ch=0;
		System.out.println("Enter your choice:\n1.Rectangle 2.Triangle 3.Square 4.Circle");
		switch(ch)
		{
			case 1: 
			CalculateArea rect = new Rectangle();
			System.out.println(String.format("Area of rectangle: %,.2f",rect.area()));
			break;
			case 2:
			CalculateArea tri = new Triangle();
			System.out.println(String.format("Area of triangle: %,.2f",tri.area()));
			break;
			case 3:
			CalculateArea sqr = new Square();
			System.out.println(String.format("Area of sqaure: %,.2f",sqr.area()));
			break;
			case 4:
			CalculateArea circ = new Circle();
			System.out.println(String.format("Area of circle: %,.2f",circ.area()));
			break;
			default:
			System.out.println("Please enter a valid option");
		}
		}

	}
}

class Rectangle implements CalculateArea{
	double l,b;
	static Scanner scanner = new Scanner(System.in);
	public double area(){
		return l*b;
	}
	Rectangle()
	{
		System.out.println("Enter the length and breadth of the rectangle");
		this.l=scanner.nextDouble();
		this.b=scanner.nextDouble();
	}
}

class Triangle implements CalculateArea{
	double b,h;
	static Scanner scanner = new Scanner(System.in);
	public double area(){
		return b*h/2;
	}
	Triangle()
	{
		System.out.println("Enter the breadth and height of the Triangle");
		this.b=scanner.nextDouble();
		this.h=scanner.nextDouble();
	}
}

class Square implements CalculateArea{
	double side;
	static Scanner scanner = new Scanner(System.in);
	public double area(){
		return side*side;
	}
	Square()
	{
		System.out.println("Enter the length of one side of the square");
		this.side=scanner.nextDouble();
	}
}

class Circle implements CalculateArea{
	double rad;
	static Scanner scanner = new Scanner(System.in);
	public double area(){
		return 3.14*rad*rad;
	}
	Circle()
	{
		System.out.println("Enter the radius of the circle");
		this.rad=scanner.nextDouble();
	}
}




