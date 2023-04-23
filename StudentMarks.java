import java.util.Scanner;

public class StudentMarks{
	public static void main(String[] args){

		int noOfSubs;
		double mark,percentage,markTotal =0,tmark;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		noOfSubs = read.nextInt();
		System.out.println("Enter total marks that can be awarded for a subject:");
		tmark = read.nextDouble();
		double[] marks = new double[noOfSubs];
		System.out.println("Enter the marks of " + noOfSubs + " subjects out of "+ tmark);
		for(int i=0;i<noOfSubs;i++)
			marks[i] = read.nextDouble();

		for(int i=0;i<noOfSubs;i++)
			markTotal+=marks[i];
		percentage = markTotal/(tmark*noOfSubs)*100;
		System.out.println("The student scored a total mark of "+markTotal +" out of "+ tmark*noOfSubs +  " ["+percentage+"%]");
	}
}

