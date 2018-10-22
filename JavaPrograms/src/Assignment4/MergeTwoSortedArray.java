package Assignment4;

import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		System.out.println("Enter the Array1 size");
		Scanner sc=new Scanner(System.in);
		int len1=sc.nextInt();
		System.out.println("Enter the Array2 size");
		int len2=sc.nextInt();
		int a[]=new int[len1];
		int b[]=new int[len2];
		int c[]=new int[len1+len2];
		int len;
		System.out.println("Enter " +len1+ " Elements for an array 1");
		for(int i=0;i<len1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter " +len2+ " Elements for an array 2");
		for(int i=0;i<len2;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("Merging the array");
		for(int i=0;i<len1;i++)
		{
			c[i]=a[i];
		}
		len=len1+len2;
		for(int i=0,k=len1; k<len && i<len2;i++,k++)
		{
			c[k]=b[i];
		}
		
		System.out.print("Now the New Array after Merging is :\n");
	       for(int i=0; i<len; i++)
	       {
	           System.out.print(c[i] + "  ");
	       }

	}

}
