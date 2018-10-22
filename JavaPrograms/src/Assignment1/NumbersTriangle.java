package Assignment1;

import java.util.Scanner;

public class NumbersTriangle {

	public static void main(String[] args) {
		int n=1;
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((n*n)+2 +" ");
				n=n+1;
			}
			System.out.println();
		}
	}

}
