import java.util.Scanner;

public class matrixSymmetry{
 public static void main(String[] args){
 int i,j,column, row,flag =1;
 int[][] arr = new int[20][20];
 int[][] transpose = new int[20][20];

 //To take input for the matrix
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the the number of columns of matrix");
 column = sc.nextInt();

 System.out.println("Enter the number of rows of matrix");
 row = sc.nextInt();

 System.out.println("Enter the values for matrix");
 for(i=0;i<row;i++)
  for(j=0;j<column;j++)
   arr[i][j] = sc.nextInt();

//to check if symmetric 

 for(i=0;i<row;i++)
  for(j=0;j<column;j++)
   if(arr[i][j]!=arr[j][i])
    {
	flag = 0;
	break;
    }
   
if(flag == 1)
 System.out.println("The given matrix is symmetric");
else
 System.out.println("The given matrix is not symmetric");
 
}
}

