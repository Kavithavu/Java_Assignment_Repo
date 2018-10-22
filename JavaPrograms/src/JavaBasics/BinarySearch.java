/*WJP to search an item in an array using binary search.*/
package JavaBasics;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Eneter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter " +size+ " elements of the array");
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int num=sc.nextInt();
		int first,last,middle;
		first=0;
		last=size-1;
		middle=(first+last)/2;

		while(first<=last)
		{
			if(a[middle]<num)
				first = middle + 1;

			else if ( a[middle] == num )
			{
				System.out.println(num + " found at location " + (middle + 1) + ".");
				break;
			}
			else
			{
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if ( first > last )
			System.out.println(num + " is not found.\n");
	}
}
