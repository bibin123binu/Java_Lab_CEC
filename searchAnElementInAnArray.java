import java.util.Scanner;

public class searchAnElementInAnArray {
	public static void main(String args[]) {
		int length, key;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of the array you want to create: ");
		length = read.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the values to insert into the array:");
		for (int i = 0; i < length; i++) {
			arr[i] = read.nextInt();
		}
		System.out.println("Enter the key you want to search for");
		key = read.nextInt();
		searchArray(arr, length, key);
	}

	static void searchArray(int arr[], int length, int key) {
		int flag = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] == key) {
				flag = 1;
				System.out.println("Search key " + key + " is found at " + i + "");
			}
		}

		if (flag != 1) {
			System.out.println("Search key not found");
		}
	}
}