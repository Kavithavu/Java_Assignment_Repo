/*Write a java program to find factorial of a number*/
package Assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int num;
		int fact=1;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<0)
			System.out.println("Number should be non-negative");
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			
			System.out.println("Factorial of a number "+num+" is ="+fact);
		}
			
		
	}

}
