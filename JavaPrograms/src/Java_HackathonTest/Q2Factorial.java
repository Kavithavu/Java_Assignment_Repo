/*Q2. write a program to find factorial (Non Recursive) */
package Java_HackathonTest;

import java.util.Scanner;

public class Q2Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number to find its factorial:");
		int fact=1,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+ " Is :" +fact);
	}

}

