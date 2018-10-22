/*Write a program to check palindrome (MalayalaM) for both numbers and string?*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q12PalindromeForNumsStrings {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		String rev=" ";
		boolean flag=true;
		char[] ch=str.toCharArray();
		for(int i=0;i<len/2;i++)
		{
			if(ch[i]==ch[len-i-1])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not a Not a palindrome");
	}

}
