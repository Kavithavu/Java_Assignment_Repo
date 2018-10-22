package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllEvenInBegArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int i=0,temp;
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Array elements");
		for(int j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}
		
		for(int j=0;j<n;j++)
		{
			if(a[j]%2==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i=i+1;
			}
			
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}
	}	
}
