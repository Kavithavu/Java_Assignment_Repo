/*implement Pascal’s triangle in a java program
	ex:
	Following are the first 6 rows of Pascal’s Triangle.

	1  
	1 1 
	1 2 1 
	1 3 3 1 
	1 4 6 4 1 
	1 5 10 10 5 1 
	*/
package Assignment6;

import java.util.Scanner;

public class PascalsTriangle {

	public static void print(int n) {
		int[] previousRow;
		int[] currentRow = {1};
		printArray(currentRow);
		previousRow = currentRow;
		for (int i = 2; i <= n; i++) {
			currentRow = new int[i];
			currentRow[0] = 1;
			currentRow[i - 1] = 1;
			for (int j = 0; j <= i - 3; j++) {
				currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
			}
			printArray(currentRow);
			previousRow = currentRow;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
		int row = scanner.nextInt();
		print(row);
	}

}
