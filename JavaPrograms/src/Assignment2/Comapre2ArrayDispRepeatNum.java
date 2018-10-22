/* 2.WJP to compare two compare two array and display repeating numbers? */

package Assignment2;

import java.util.Scanner;

public class Comapre2ArrayDispRepeatNum {

//	public static void compare()
	public static void main(String[] args) {
		System.out.println("Enter the size of First Array");
		System.out.println("Enter the size of Second Array");
		Scanner sc=new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[n];
		if(m!=n)
			System.out.println("Array size should be same");
		else
		{
			int[] c=new int[n];
			System.out.println("Enter array elements for Array a");
			for(int i=0;i<m;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter array elements for Array b");
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				if(a[i]==b[i])
				System.out.println("Repeating Numbers are:"  +a[i]);
			}
		}
	}

}
