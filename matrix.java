import java.util.Scanner;

public class matrix{
 public static void main(String[] args){
 int i,j,column, row;
 int[][] arr1 = new int[20][20];
 int[][] arr2 = new int[20][20];
 int[][] res = new int[20][20];

 //To take input for the matrix
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the the number of columns: ");
 column = sc.nextInt();

 System.out.println("Enter the number of rows: ");
 row = sc.nextInt();
  

 System.out.println("Enter the values for matrix 1");
 for(i=0;i<row;i++)
  for(j=0;j<column;j++)
   arr1[i][j] = sc.nextInt();

 System.out.println("Enter the values for matrix 2");
  for(i=0;i<row;i++)
  for(j=0;j<column;j++)
    arr2[i][j] = sc.nextInt();

 
//to add the matrices

 for(i=0;i<row;i++)
  for(j=0;j<column;j++)
  res[i][j] = arr1[i][j]+arr2[i][j];
 
//to print the result;

System.out.println("Sum of the matrices is:\n");
for(i=0;i<row;i++)
{
 System.out.print("\n");
 for(j=0;j<column;j++)
  System.out.print(res[i][j]+"\t");
}
System.out.print("\n");
 
}
}

