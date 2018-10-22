package JavaBasics;

import java.util.Scanner;

public class OddNumsInArray {

	public static void main(String[] args) {
		System.out.println("Enter Number of Elements in the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int min = 0;
		int[] b=new int[5];
		System.out.println("Enter " +n+ "Elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
				b[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}

}
