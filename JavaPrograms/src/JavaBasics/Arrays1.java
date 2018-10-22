package JavaBasics;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		int[] a=new int[5];
		System.out.println("Enter elements of an array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements of an array are:");
		
		for(int j=0;j<a.length-1;j++)
		{
			System.out.println(a[j]);
		}
	}
	}
