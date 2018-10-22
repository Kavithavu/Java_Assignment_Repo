/*3.Given an array prints the unique numbers and also print the number 
of occurrences of duplicate numbers.*/

package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfOccNums {

	public static void main(String[] args) {
		int count=1;
		System.out.println("Enter the size of an Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();	
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			count=1;

			while((i+1)<n-1 && a[i]==a[i+1])
			{
				count++;
				i++;
			}
			
			if(count==1)
				System.out.println("Element " +a[i]+ " Is Unique element");
			else
				System.out.println("Element " +a[i]+ " Frequency is:" +count);
		}
		
		
	}

}
