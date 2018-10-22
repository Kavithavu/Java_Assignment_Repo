/*Q3. Given an array of integers, sort the integer values.*/
package Java_HackathonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q3SortIntArray {

	public static void main(String[] args) {

		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size,temp;
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the " +size+ "Elements for an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Give array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		// USING IN BUILT SORT METHOD FROM Arrays utility class- 
		Arrays.sort(arr);
		System.out.println("Sorted Array is :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
