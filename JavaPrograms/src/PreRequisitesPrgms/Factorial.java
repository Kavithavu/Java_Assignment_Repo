/*2. Write Java program to find factorial of number*/
package PreRequisitesPrgms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0)
			System.out.println("NUmber Should not be nagative");
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
   		}
		System.out.println("Factorial of a numnber is:" +fact);
	}

}
