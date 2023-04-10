import java.util.Scanner;

public class stringManipulations{
	public static void main(String args[]){
		String str = new String();
		System.out.println("Enter a string: ");
		Scanner read = new Scanner(System.in);
		str = read.nextLine();
		manipulateString(str);		
		StringBuffer strBf = new StringBuffer(str);
		manipulateStringBuffer(strBf);
		
			
		
	}
		static void manipulateString(String str){
			String tempString = str;
			System.out.println("\n\nString manipulation using String class methods:\n\n");
			tempString =tempString.concat(" concatenated string");
			System.out.println("concat operation:" + tempString);
			tempString = tempString.replace("concatenated string"," replaced string");
			System.out.println("reaplce operation:" + tempString);		
		}

		static void manipulateStringBuffer(StringBuffer str){
			StringBuffer tempString = str;
			System.out.println("\n\nString manipulation using String Buffer class methods:\n\n");
			tempString =tempString.append(" Appended string");
			System.out.println("Append operation:" + tempString);
			tempString = tempString.reverse();
			System.out.println("Reverse operation:" + tempString);		
		}
}
