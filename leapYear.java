import java.util.Scanner;

public class leapYear{
	public static void main(String args[]){
		int sYear,eYear;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the range of years you want to check [Enter starting year then ending year]");		
		sYear = read.nextInt();
		eYear = read.nextInt();
		System.out.println("\n");
		for(int year=sYear;year<=eYear; year++)
		{
		if(year % 4 == 0)
		{
			if(year % 100 !=0 || year % 400 ==0)
				System.out.println(year +" is a leap year");
			else
				System.out.println(year + " is not a leap year");
		}
		else
			System.out.println(year + " is not a leap year");
		}
		
	}
}
