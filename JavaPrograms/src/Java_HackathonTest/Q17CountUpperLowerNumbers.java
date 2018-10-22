/*Q17. WJP to find total number of integers, uppercase and lowercase character in the give string */
package Java_HackathonTest;

import java.util.Scanner;

public class Q17CountUpperLowerNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int upr=0;
		int lwr=0;
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				upr++;
			if(Character.isLowerCase(str.charAt(i)))
				lwr++;
			if(Character.isDigit(str.charAt(i)))
				num++;
		}
		System.out.println("String contains " +upr+ " Uppercase ");
		System.out.println("String contains " +lwr+ " Lowercase ");
		System.out.println("String contains "+num+ " numbers in a string");
	}

}
