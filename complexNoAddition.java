import java.util.Scanner;

public class complexNoAddition{
	public static void main(String args[]){
	ComplexNo c1 = new ComplexNo();
	ComplexNo c2 = new ComplexNo();
	
	c1.addComplexNumbers(c2);
}
}

class ComplexNo{
	int r,i;
	Scanner read = new Scanner(System.in);
	ComplexNo()
	{
	System.out.println("Enter the complex no :[Enter real part first, then imaginary part]");
	r = read.nextInt();
	i = read.nextInt();
	}
	void addComplexNumbers(ComplexNo c2){
		int rr,ri;
		rr = r + c2.r;
		ri = i + c2.i;
		
		System.out.println("Sum of complex numbers = " + rr +"+i"+ri);
	}
}
