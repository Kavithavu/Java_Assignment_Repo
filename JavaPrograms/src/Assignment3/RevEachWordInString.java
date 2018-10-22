/*Write a java program to reverse each word of a given string?*/

package Assignment3;

import java.util.Scanner;

public class RevEachWordInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] str=input.split(" ");
		String revstr="";
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);	
	}

}
