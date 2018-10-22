/*Q34. Write a method to implement *, - , / operations. You should use only the + operator **/

package Java_HackathonTest;

import java.util.Scanner;

public class Q34Operator {

	public static void main(String[] args) {
		System.out.println("Enter the value of a ");
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		System.out.println("Enter the value of b ");
		int b =s.nextInt();
		Q34Operator so = new Q34Operator();
		int subtraction = so.subtraction(a, b);
		int multiply=so.multiply(a,b);
		int divide=so.divide(a,b);
		System.out.println("subtraction=" + subtraction);
		System.out.println("Multiplication=" +multiply);
	}

	public static int subtraction(int a, int b) {
		return a + negate(b);
	}

	private static int negate(int a) 
	{

		int neg = 0;
		int b = (a < 0) ? 1 : -1;
		while (a != 0) {
			a += b;
			neg += b;
		}
		return neg;
	}

	public static int multiply(int a, int b) {
		if (a < b) {
			// algorithm is faster if b<a
			return multiply(b, a);
		}
		int sum = 0;
		for (int i = abs(b); i > 0; i--) {
			sum += a;
		}
		if (b < 0)
			sum = negate(sum);
		return sum;
	}

	private static int abs(int b) {
		// TODO Auto-generated method stub
		if (b < 0)
			return negate(b);
		else
			return b;
	}

	public static int divide(int a, int b) {
		if (b == 0)
			throw new java.lang.ArithmeticException();
		int absa = abs(a);
		int absb = abs(b);
		int product = 0;
		int x = 0;
		while (absb + product <= absa) {
			product += absb;
			x++;
		}
		if ((a > 0 && b > 0) || (a < 0 && b < 0))
			return x;
		else
			return negate(x);

	}

}
