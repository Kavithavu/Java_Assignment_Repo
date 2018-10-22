package Assignment1;

import java.util.Scanner;

public class PalindromeOfTheNumber {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+(num%10);
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}

}
