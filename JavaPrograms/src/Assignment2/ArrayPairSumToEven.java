/*Given an array, how do you get the count of pairs that sum to even*/

package Assignment2;

import java.util.Scanner;

public class ArrayPairSumToEven {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum;
		System.out.println("Eneter " +n+ "elements for an array a");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(sum%2==0)
				{
					System.out.println("(" +a[i]+ "," +a[j]+ ")");
				}
			}
		}
	}

}
