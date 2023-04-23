import java.util.Scanner;
import java.util.Arrays;
public class sortStrings{
	public static void main(String args[]){
		int length,i;
		Scanner read = new Scanner(System.in);		
		System.out.println("How many words do you want to enter?");
		length = read.nextInt();
		String[] strArray = new String[length];
		System.out.println("Enter the strings to add to the array:");
		for(i=0;i<strArray.length;i++)
			strArray[i] = read.next();
		System.out.println("\n\nArray before sorting:\n");
		for(i=0;i<strArray.length;i++)
			System.out.print(strArray[i]+ " ");
		System.out.println("\n\nArray after sorting:\n");		
		Arrays.sort(strArray);		
		for(i=0;i<strArray.length;i++)
			System.out.print(strArray[i]+ " ");
		System.out.println("\n");		
		
	}
}
