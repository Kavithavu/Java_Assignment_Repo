/*Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q13ReverseOfString {

	public static void main(String[] args) {

		System.out.println("Enter the string ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=" ";
		int len=str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
