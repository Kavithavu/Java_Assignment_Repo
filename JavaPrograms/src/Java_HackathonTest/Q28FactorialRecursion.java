/*Q28. WJP to find factorial of a number using recursion*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q28FactorialRecursion {
	

	public static void main(String[] args) {
	       System.out.println("Enter the number ");
	       Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       int a = fact(n);
	       System.out.println("The factorial of the number is : " + a);

	}

	private static int fact(int n) {

		int result;
		if(n==1 || n==0)
		return 1;
		else
			result = fact(n-1) * n;
        return result;
	}

}
