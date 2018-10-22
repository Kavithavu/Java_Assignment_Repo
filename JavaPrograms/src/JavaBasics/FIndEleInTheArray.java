package JavaBasics;

import java.util.Scanner;

public class FIndEleInTheArray {

	public static void main(String[] args) {

		System.out.println("Enter Number of Elements in the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int min = 0;
		boolean flag=false;
		System.out.println("Enter " +n+ "Elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be found");
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==num)
				flag=true;
		}
		if(flag==true)
			System.out.println("Element is found in the array");
		else
			System.out.println("Element not found in the array");
	}

}
