package JavaBasics;

import java.util.Scanner;

public class FindMinEleInArray {

	public static void main(String[] args) {
		System.out.println("Enter Number of Elements in the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int min = a[0];
		System.out.println("Enter " +n+ "Elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=1;i<n;i++)
		{
				if(min>a[i])
				{
					min=a[i];
				}
		}
		System.out.println("The minimum element in the array=" +min);
	}
}
