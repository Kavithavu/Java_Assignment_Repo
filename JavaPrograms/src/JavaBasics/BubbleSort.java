package JavaBasics;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the Array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

			System.out.println("The Sorted Array IS:");
			for(int j=0;j<n;j++)
			{
				System.out.println(a[j]);
			}
		}
	}

	}
