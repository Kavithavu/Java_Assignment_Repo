/*WJP to print fibonacci series*/
package Assignment4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//1,1,2,3,5,8
		System.out.println("How many elements in fib series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,sec=1,sum;
		for(int i=0;i<n;i++)
		{
			System.out.print(first + " + ");

			sum=first+sec;
			first=sec;
			sec=sum;
			
		}

	}

}
