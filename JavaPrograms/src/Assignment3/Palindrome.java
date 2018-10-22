package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int n=S.length();
		char[] ch=S.toCharArray();
		boolean flag=true;
		for(int i=0;i<n/2;i++)
		{
			if(ch[i]!=ch[n-1-i])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given String is not palindrome");
	}

}
