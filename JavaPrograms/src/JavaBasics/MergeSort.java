/*WJP to merge the two sorted array*/

package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array 1");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		System.out.println("Enter the size of array 2");
		int size2=sc.nextInt();
		int[] a1=new int[size1];
		int[] a2=new int [size2];
		int[] b=new int[size1+size2];
		System.out.println("Enter " +size1+ " sorted elements for Array 1");
		for(int i=0;i<size1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter " +size2+ " sorted elements for Array 2");
		for(int i=0;i<size2;i++)
		{
			a2[i]=sc.nextInt();
		}
		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				b[k] = a1[i];
				i++;
			} else {
				b[k] = a2[j];
				j++;
			}
			k++;
		}

		// Copy the remaining elements in array 1 to array 3
		if (i < a1.length) {
			// arraycopy(source, sourcepos, dest, destpos, numOfElements)
			System.arraycopy(a1, i, b, k, (a1.length - i));
		}

		// Copy the remaining elements in array 2 to array 3
		if (j < a2.length) {
			// arraycopy(source, sourcepos, dest, destpos, numOfElements)
			System.arraycopy(a2, j, b, k, (a2.length - j));
		}
		System.out.println("Merged Sorted Array" + Arrays.toString(b));
	}
}
