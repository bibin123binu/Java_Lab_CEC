import java.util.*;
import java.util.Scanner;

class EmployeeManager{
	public static void main(String args[])
	{
		int empCount,searchID;		
		Scanner read = new Scanner(System.in);
		System.out.println("How many employees do you want to add to the system");
		empCount = read.nextInt();
		Teacher teachers[] = new Teacher[empCount];
		for(int i=0;i<empCount;i++){
			teachers[i] = new Teacher();
		}
		while(true){
			System.out.println("Which employee do you want to search for?");
			searchID = read.nextInt();
			search(teachers,searchID);
		}
		
	}
	
	static void display(Teacher teacher){
		System.out.print("\n\nTeacher INFO:\nEMP ID: "+teacher.empID+"\nSalary: "+teacher.salary+"\nName: "+teacher.name+"\nAddress: "+teacher.address+"\nDepartment: "+teacher.department+"\nSubjects taught: ");
		for(int i=0;i<teacher.subjectCount;i++)
			System.out.print(teacher.Subjects[i]+" ");
	}

	static void search(Teacher teachers[],int searchID) {
		int flag = 0, i;
		for (i = 0; i < teachers.length; i++) {
			if (teachers[i].empID == searchID) {
				display(teachers[i]);
				break;
			}
		}
		if (flag == 1)
			return;
	  else
			System.out.println("\n\nEmployee with ID: " + searchID + " is not found");

}
}

class Employee{
	int empID;
	double salary;
	String name,address;
	Employee(){
		Scanner read = new Scanner(System.in);
		System.out.println("\nEnter employee info");
		System.out.println("Employee ID: ");
		this.empID = read.nextInt();
		System.out.println("Salary: ");
		this.salary = read.nextDouble();
		System.out.println("Name: ");
		read.next();
		this.name = read.nextLine();
		System.out.println("Address: ");
		this.address = read.nextLine();
	}
}

class Teacher extends Employee{
	String department;
	int subjectCount;
	String Subjects[];
	
	Scanner read = new Scanner(System.in);
	Teacher(){
		super();		
		System.out.println("Department: ");
		department = read.nextLine();
		System.out.println("How many subjects does the teacher handle?");
		this.subjectCount = read.nextInt();
		Subjects = new String[subjectCount];
		System.out.println("Enter the " +subjectCount+ " subject names");
		for(int i=0;i<subjectCount;i++)			
			Subjects[i] = read.next();
	}
}	
