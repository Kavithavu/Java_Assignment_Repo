package Assignment1;

import java.util.Scanner;

public class PrintStarsInDiamondPattern {

	public static void main(String[] args) {
		int rows,space=1;
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		System.out.println("Enter the character to be print");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				  System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for(int k=rows-1;k>=0;k--)
		{
			for(int l=1;l<=rows-k;l++)
			{
				  System.out.print(" ");
			}
			for(int m=1;m<=k*2-1;m++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
