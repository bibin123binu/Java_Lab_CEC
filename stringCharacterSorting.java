import java.util.Scanner;
import java.util.Arrays;
public class stringCharacterSorting{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);		
		System.out.println("Enter the string you want to sort");
		String str = read.nextLine();
		char[] strArray = str.toCharArray(); 
		Arrays.sort(strArray);
		System.out.print("\n\nString before being sorted: " + str);
		String newStr = new String(strArray);
		System.out.print("\n\nString after being sorted: " + newStr+"\n");	
	}
}
