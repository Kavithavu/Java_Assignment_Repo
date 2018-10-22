/*WJP to search an item in an array using binary search.*/
package Java_Exam;

import java.util.Scanner;

public class BinarySearch {

	public static void binary_search(int low,int high,int[] a,int key)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println("Element present in the list");
				break;
			}
			else if(a[mid]>key)
				high=mid-1;
			else
				low=mid+1;
		}
		if(low>high)
			System.out.println("Element is not found in the array");
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter" +n+ " elements in ascending order");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int key=sc.nextInt();
		binary_search(0,n-1,a,key);
	}

}
