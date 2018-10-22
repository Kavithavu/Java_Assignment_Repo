package Assignment1;

import java.util.Scanner;

public class PrintStarsTriangle {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int rows;
		rows=sc.nextInt();
		System.out.println("Enter the character to be print");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
