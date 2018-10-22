package Assignment1;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {

		System.out.println("Enter the character to be print");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		System.out.println("What is the maximum number ");
		
		int  max=sc.nextInt();
		
		for(int i=1;i<=max;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for(int k=max-1;k>=1;k--)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
}
