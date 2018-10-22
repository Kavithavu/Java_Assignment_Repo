/*Q16. Write a method that will remove given character from the String?*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q16RemoveCharFromString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the character to be removed");
		char ch=sc.next().charAt(0);
		String result=removeCharFromString(str,ch);
		System.out.println(result);
	}

	private static String removeCharFromString(String str, char chartoremove) {
		if(str==null)
			return " ";
		StringBuilder strb=new StringBuilder ();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==chartoremove)
			continue;
			strb.append(ch);
		}
		return strb.toString();
	}

}
