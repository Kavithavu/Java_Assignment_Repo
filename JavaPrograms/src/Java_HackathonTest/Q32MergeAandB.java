/*Q32. You are given two sorted arrays, A and B, and A has a large enough bu#er at the end to hold B. 
 * Write a method to merge B into A in sorted order. 
 */
package Java_HackathonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q32MergeAandB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int a1=s.nextInt();
		int[] arr1= new int[a1];
		System.out.println("Enter the array elements");
		for(int i=0;i<a1;i++)
		{
			arr1[i] = s.nextInt();
		} 
		System.out.println("Enter the number of elements");
		int b1=s.nextInt();
		int[] arr2= new int[b1];
		System.out.println("Enter the array elements");
		for(int i=0;i<b1;i++)
		{
			arr2[i] = s.nextInt();
		} 

		int n = arr2.length; // length of second array
		int m =(arr1.length-n);//number of elements in first array excluding unoccupied space
		int k = m + n - 1;
		while (m > 0 && n > 0) {
			if (arr1[m - 1] > arr2[n - 1]) {
				arr1[k--] = arr1[m - 1];
				m--;
			} else {
				arr1[k--] = arr2[n - 1];
				n--;
			}
		}

		/*
		 * Copy the remaining elements that are not copied from array 2 to
		 * array 1. This happens after all the elements in array 1 is compared
		 * with array2 and still some elements are not placed into array 1 from array 2
		 */
		while (n > 0) {
			arr1[k--] = arr2[n - 1];
			n--;
		}

		System.out.println("Merged Sorted Array" + Arrays.toString(arr1));


	}

}
