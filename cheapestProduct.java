import java.util.Scanner;

class Product{
 int pCode;
 float price;
 String pName;

public Product(int i){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the code for product " + i);
 pCode = sc.nextInt();
System.out.println("Enter the price for product " + i);
 price = sc.nextFloat();
System.out.println("Enter the name for product " + i);
 pName = sc.next();
}

}

public class cheapestProduct{
 public static void main(String[] args)
 {

  Product p1 = new Product(1);

  Product p2 = new Product(2);

  Product p3 = new Product(3);
  System.out.println(p1.price);
  
  if(p1.price<p2.price && p1.price<p3.price)
  System.out.println("Cheapest product is: "+ p1.pName); 
  else if(p2.price<p1.price && p2.price<p3.price)
  System.out.println("Cheapest product is: "+ p2.pName);
  else
  System.out.println("Cheapest product is: "+ p3.pName);

  
}
}
