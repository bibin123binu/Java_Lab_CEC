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
			System.out.println("concat operation :" + tempString);
			System.out.println("Length of string :" + tempString.length());
			System.out.println("To uppercase function: " + tempString.toUpperCase());
			tempString = tempString.replace("concatenated string"," replaced string");
			System.out.println("replace operation: " + tempString);
			char arr[] = str.toCharArray();
			System.out.println("char array: " + new String(arr));
			System.out.println("Index of 'this': " + str.indexOf("this"));	
	}

		static void manipulateStringBuffer(StringBuffer str){
			StringBuffer tempString = str;
			System.out.println("\n\nString manipulation using String Buffer class methods:\n\n");
			tempString =tempString.append(" Appended string");
			System.out.println("Append operation:" + tempString);
			System.out.println("Length of string :" + tempString.length());			
			System.out.println("Substring: " + str.substring(9));	

		}
}
