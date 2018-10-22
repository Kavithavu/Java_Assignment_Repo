/*Q24. Write a program which inputs a positive natural number N and prints the possible 
 * consecutive number combinations, which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 
 */
package Java_HackathonTest;

import java.util.Scanner;

public class Q24ConsecutiveNumCombinations {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Natural number ");
		int num=sc.nextInt();
		sc.close();
		int sum=0,j=0;

		for(int i=1;i<num;i++)
		{
			sum=i;
			j=i+1;

			while(sum<num)
			{
				sum=sum+j;
				j++;
			}

			if(sum==num)
			{
				for(int k=i;k<j;k++)
				{
					if(k==i)
						System.out.print(k);
					else
						System.out.print(" + "+k);
				}
				System.out.println();
			}
		}

	}

}
