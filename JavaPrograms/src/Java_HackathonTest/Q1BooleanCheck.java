/*Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q1BooleanCheck {

	public static void main(String[] args) {
		System.out.println("Enter value of a:");
		Scanner sc=new Scanner(System.in);
		boolean a,b,c,result;
		a=sc.nextBoolean();
		System.out.println("Enter the value of b");
		b=sc.nextBoolean();
		System.out.println("Enter the value of c");
		c=sc.nextBoolean();
		result=atleasttwo(a,b,c);
		System.out.println(result);
		
	}

	private static boolean atleasttwo(boolean a, boolean b, boolean c) {
		if((a && b) || (b && c) || (c && a))
		{
			return true;
		}
		else
			
		return false;
	}

}
