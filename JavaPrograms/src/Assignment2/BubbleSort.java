package Assignment2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int temp;
		int[] a=new int[s];
		System.out.println("Enter " +s+ " elements of the array" );
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<s-1;i++)
		{
			for(int j=0;j<s-1-i;j++)
			{if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
   System.out.println("The Sorted array is:");
   for(int i=0;i<=s-1;i++)
	   System.out.println(a[i]);
	}

}
