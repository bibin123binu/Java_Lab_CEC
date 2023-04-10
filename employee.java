import java.util.Scanner;

public class employee{
	public static void main(String args[]){
		int length;
		System.out.println("How many employee records do you want to enter?");
		Scanner read = new Scanner(System.in);		
		length = read.nextInt();
		EmployeeData empArray[] = new EmployeeData[length];
		for(int i=0;i<length;i++)
		{
			empArray[i] = new EmployeeData();
		}
		System.out.println("Enter the employee no you want to search for:");
		int searchKey = read.nextInt();
		searchArray(empArray,searchKey);
	}

static void searchArray(EmployeeData arr[], int searchKey){
			int flag = 0, i;
			for(i=0;i<arr.length;i++){
				if(arr[i].eNo == searchKey){
					flag = 1;
					break;
				}
			}
			
			if(flag == 1){
				System.out.println("Employee with ID: " +searchKey+ " is found\nEmployee Name: "+arr[i].eName +"\nSalary: "+arr[i].eSalary);
				return;			
			}		
			else{
				System.out.println("Employee with ID: " +searchKey+ " is not found");				
			}
		}

}

class EmployeeData{
		int eNo;
		float eSalary;
		String eName = new String();
		Scanner read = new Scanner(System.in);
		
		EmployeeData(){
		System.out.println("\n\nEnter the Employee number");
		eNo = read.nextInt();
		System.out.println("Enter the Employee name");
		eName = read.next();
		System.out.println("Enter the Employee salary");		
		eSalary = read.nextFloat();
		}
}
