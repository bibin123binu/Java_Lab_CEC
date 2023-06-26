import java.util.Scanner;

public class personData {
    static Scanner scanner = new Scanner(System.in);
    private static int count;
    private static Teacher teacherArray[];
    private static Teacher searchedTeacher;

    public static void main(String[] args) {
        System.out.println("How many teachers do you want to add to the system?");
        count = scanner.nextInt();
        teacherArray = new Teacher[count];
        for (int i = 0; i < count; i++) {
            teacherArray[i] = new Teacher();
        }
        searchedTeacher = search(teacherArray);
        if (searchedTeacher != null) {
            display(searchedTeacher);
        }
    }

    public static Teacher search(Teacher teacherArray[]) {
        int searchKey;
        System.out.println("Which teacher do you wish to search for: ");
        searchKey = scanner.nextInt();
        int flag = 0, i;
        for (i = 0; i < teacherArray.length; i++) {
            if (teacherArray[i].emp_id == searchKey) {
                return teacherArray[i];
            }
        }
        if (flag == 0)
            System.out.println("\n\nEmployee with ID: " + searchKey + " is not found");
        return null;

    }

    static void display(Teacher teacher) {
        System.out.printf("Teacher info:\n\nName:%s\nGender: %s\nAge: %s\nEmployee ID: %d\nSalary: %f\nCompany name: %s\nQualification: %s\nTeacher id: %d\nSubject: %s\nDepartment: %s\n",teacher.name, teacher.gender, teacher.age, teacher.emp_id, teacher.salary,teacher.companyName, teacher.qualification, teacher.teacherID, teacher.subject, teacher.department);
    }
}

class Person extends personData {
    String name, gender;
    int age;

    Person() {
				System.out.println("Enter teacher info:\n");
        System.out.println("\nName: ");
        scanner.next();
        name = scanner.nextLine();
        System.out.println("Gender: ");
        gender = scanner.nextLine();
        System.out.println("Age: ");
        age = scanner.nextInt();
    }

}

class Employee extends Person {
    int emp_id;
    float salary;
    String companyName, qualification;

    Employee() {
        super();
        System.out.println("Employee ID: ");
        emp_id = scanner.nextInt();
        System.out.println("Salary: ");
        salary = scanner.nextFloat();
        System.out.println("Company name: ");
        scanner.next();
        companyName = scanner.nextLine();
        System.out.println("Qualification: ");
        qualification = scanner.nextLine();
    }
}

class Teacher extends Employee {
    int teacherID;
    String subject, department;

    Teacher() {
        super();
        System.out.println("Teacher ID: ");
        teacherID = scanner.nextInt();
        System.out.println("Subject: ");
				scanner.next();
        subject = scanner.nextLine();
        System.out.println("Department: ");
        department = scanner.nextLine();
    }
}
