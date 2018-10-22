/*Q27. WJP to perform ascending order Quick sort */
package Java_HackathonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q27QuickSort {

	public static void main(String[] args) {

		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int[] x= new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			x[i] = s.nextInt();
		}
		System.out.println("The entered array is" +Arrays.toString(x));

		int low = 0;
		int high = x.length - 1;

		quickSort(x, low, high);
		System.out.println("The sorted array is" +Arrays.toString(x));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);

	}

}
