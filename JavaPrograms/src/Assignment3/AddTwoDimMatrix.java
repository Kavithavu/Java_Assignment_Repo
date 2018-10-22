/*Add 2 nXm matrices */
package Assignment3;

import java.util.Scanner;

public class AddTwoDimMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the rows and columns of the matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] c=new int[n][m];
		int[][] a=new int[n][m];
		int[][] b=new int[n][m];

		System.out.println("Enter elements for the array a");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter elements for the array b");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Addition of two matrix is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" " +c[i][j]);
			}
			
			System.out.println();
		}
	}

}
