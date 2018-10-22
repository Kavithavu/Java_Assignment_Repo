/*Q19. WJP to display number of occurrence of all character */
package Java_HackathonTest;

import java.util.Scanner;

public class Q19OccurenceOfAllChars {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		int count=0;
		char ch;
		for(char i='a';i<'z';i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				ch=str.charAt(j);
				if(ch==i)
					count++;
			}
			if(count!=0)
				System.out.println(i+ "\t" +count);
		}
	}

}
