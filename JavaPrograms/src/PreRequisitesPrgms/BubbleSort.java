/*5. Write bubble sort program and find O(n) , time complexity and space complexity*/

package PreRequisitesPrgms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int[] arr=new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	   System.out.println("The Sorted array is:");
	   for(int i=0;i<=n-1;i++)
		   System.out.println(arr[i]);
	}

}
