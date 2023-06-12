import java.util.Scanner;

public class stringManipulations{
	public static void main(String args[]){
		String str = new String();
		System.out.println("Enter a string: ");
		Scanner read = new Scanner(System.in);
		str = read.nextLine();
		manipulateString(str,read);		
		StringBuffer strBf = new StringBuffer(str);
		manipulateStringBuffer(strBf,read);
		
			
		
	}
		static void manipulateString(String str,Scanner read){
			String tempString = str;
			System.out.println("\n\nString manipulation using String class methods:\n\n");
						
			System.out.println("Enter string to contatenate to the string");
			tempString =tempString.concat(read.nextLine());
			System.out.println("Concatenated string :" + tempString);
			System.out.println("Length of string :" + tempString.length());
			System.out.println("To uppercase function: " + tempString.toUpperCase());
			System.out.println("Enter character to replace and what to replace it with");
			System.out.println("replace operation: " + tempString.replace(read.nextLine(),read.nextLine() ));
			char arr[] = tempString.toCharArray();
			System.out.println("As character array:\n");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);			
			System.out.println("Which word do you want to check the index of:");
			System.out.println("Index = "+ tempString.indexOf(read.nextLine()));	
	}

		static void manipulateStringBuffer(StringBuffer str,Scanner read){
			System.out.println("\n\nString manipulation using String Buffer class methods:\n\n");
			StringBuffer tempString = str;
			System.out.println("Enter string to append to the string");
			tempString =tempString.append(read.nextLine());
			System.out.println("Concatenated string :" + tempString);
			System.out.println("Length of string :" + tempString.length());			
			System.out.println(" Enter the position to insert and then substring: [ "+tempString+" ]");
			System.out.println("Inserted substring: " + tempString.insert(read.nextInt(),read.nextLine()));	

		}
}


OUTPUT:
Enter a string: 
java is 


String manipulation using String class methods:


Enter string to contatenate to the string
simple
Concatenated string :java is simple
Length of string :14
To uppercase function: JAVA IS SIMPLE
Enter character to replace and what to replace it with
e
a
replace operation: java is simpla
As character array:

j
a
v
a
 
i
s
 
s
i
m
p
l
e
Which word do you want to check the index of:
is
Index = 5


String manipulation using String Buffer class methods:


Enter string to append to the string
 is powerful      
Concatenated string :java is  is powerful
Length of string :20
 Enter the position to insert and then substring: [ java is  is powerful ]
8 really
Inserted substring: java is  really is powerful
