class Rectangle{

 double length,breadth;
 public void setData(double l, double b){
 	length = l;
	breadth = b;
 }

 public double getArea(){
 	return (length*breadth);
 }

}

public class rectArea{
	public static void main(String args[]){
		
	Rectangle rect = new Rectangle();
	rect.setData(12.48,13.00);
	System.out.println("Area of the rectangle : "+ rect.getArea());
	} 
}
