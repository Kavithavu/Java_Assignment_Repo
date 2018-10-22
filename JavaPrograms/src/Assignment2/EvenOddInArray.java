package Assignment2;

import java.util.Scanner;

public class EvenOddInArray {

	public static void main(String[] args) {

		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter " +n+" Numbers for an array a");
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i] + " Is an Odd Number");
			}
		}
		
	}

}
