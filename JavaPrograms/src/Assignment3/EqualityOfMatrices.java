/*Check whether two matrices are same or not.*/

package Assignment3;

import java.util.Scanner;

public class EqualityOfMatrices {

	public static void main(String[] args) {
		System.out.println("Enter the rows and columns of the matrix A");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int flag=1;
		System.out.println("Enter the rows and columns of the matrix b");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int[][] a=new int[row][col];
		int[][] b=new int[row1][col1];

		System.out.println("Enter elements for the array a");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter elements for the array b");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		if(row==row1 && col==col1)
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						flag=0;
						break;
					}
				}
			}
		}
		
		else
		{
			System.out.println("Matrices cannot be compared");
		    System.exit(1);
		}
		if(flag==1)
			System.out.println("Two matrices are equal");
		else
			System.out.println("Two matrices are not equal");
	}
	

}
