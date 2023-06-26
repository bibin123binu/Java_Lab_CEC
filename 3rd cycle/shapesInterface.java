import java.util.Scanner;


class shapesInterface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rectangle length: ");
        int length=sc.nextInt();
        System.out.print("Rectangle breadth: ");
        double breadth=sc.nextInt();
        System.out.print("Radius of circle: ");
        int radius=sc.nextInt();
        double pi=3.14;
        operations rect=new Rectangle();
        rect.area(length,breadth);
        rect.perimeter(length,breadth);
        operations circ=new Circle();
        circ.area(radius,pi);
        circ.perimeter(radius,pi);
    }
}

interface operations{
    void area(int a,double b);
    void perimeter(int a,double b);
}

class Rectangle implements operations{
    public void area(int a,double b){
        double rectArea= a*b;
        System.out.println(String.format("Area of rectangle: %,.2f",rectArea));
    }
    public void perimeter(int a,double b){
        double rectPeri = 2*(a+b);
        System.out.println(String.format("Perimeter of rectangle: %,.2f",rectPeri));
    }
}

class Circle implements operations{
    public void area(int r,double pi){
        double circArea = pi*r*r;
        System.out.println(String.format("Area of circle: %,.2f",circArea));
    }
    public void perimeter(int r,double pi){
        double circPeri = 2*pi*r;
				System.out.println(String.format("Perimeter of rectangle: %,.2f",circPeri));

    }
}

