/* WJP to check whether the given number is armstrong number or not.*/
//A +VE NUMBER IS CALLED ARMSTRONG NUMBER IF IT IS EQUAL TO THE SUM OF CUBES OF ITS DIGITS
//EX:0,1,153,370,371,407
package Assignment4;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to be checked");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp,a,c=0;
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		
		if(temp==c)
			System.out.println("Given Number is Armstrong number");
		else
			System.out.println("Given Number Is Not an armstrong number");
	}

}
