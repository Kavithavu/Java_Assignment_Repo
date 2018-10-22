/*Q18. WJP to display duplicate character in string*/
package Java_HackathonTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q18DuplicateCharInString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{   
			String s=String.valueOf(str.charAt(i));
			String newString = str.substring(i+1);
			if(newString.contains(s)) {
				System.out.println(s);
			}
		}
}
}
