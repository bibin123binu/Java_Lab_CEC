import java.util.Scanner;

public class oddOrEven{

 public static void main(String[] args){
 
 int number;
 System.out.println("Enter a number to check whether it's odd or even: ");
 Scanner sc = new Scanner(System.in);
 number = sc.nextInt();
 if(number % 2 == 0){
 System.out.println(number + " is even");
 }
 else{
 System.out.println(number + " is odd");
}
}

}
