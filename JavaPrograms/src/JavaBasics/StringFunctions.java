/*WJP to find the following in a given string **/
//1.Number of words
//2.Number of characters in each word
//3.Total number of characters
//4.total number of alphabets + 5. total number of digits
package JavaBasics;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		//Finding the number of words in string
		String[] words=str.split("\\s+");
		System.out.println("The string has--> " +words.length+ " words");
		
		//Finding number of characters in each word
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String s="";
			while((i<ch.length) && ch[i]!=' ')
			{
				s=s+ch[i];
				i++;
			}
			 if (s.length() > 0) 
	                System.out.println(s + "->" + s.length()); 
		}
		
		//Finding total number of characters in the string
		int charcnt=0;
		String str2;
		str2=str.replaceAll(" ", "");
		charcnt=str2.length();
		System.out.println("The number of characters in the string are: "  +charcnt);
		
		//Finding total number of alphabets and Digits
		int c1=0,c2=0,l;
		char ch1;
		l=str.length();
		for(int i=0;i<l;i++)
		{
		ch1=str.charAt(i);
		if(Character.isLetter(ch1))
		++c1;
		else if(Character.isDigit(ch1))
		++c2;
	
		}
		System.out.println("no of Letter="+c1);
		System.out.println("no of Digit="+c2);
	
	}
}
