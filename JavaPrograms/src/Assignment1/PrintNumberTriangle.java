package Assignment1;

import java.util.Scanner;

public class PrintNumberTriangle {

	public static void main(String[] args) {

		System.out.println("Enter Number of rows");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=0;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k=k+1;
				System.out.print(k +" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
}
