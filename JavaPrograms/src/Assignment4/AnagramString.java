/*check whether the two strings are anagram or not*/
package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println("Enter the String 1");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("Enter the String 2");
		String str2=sc.nextLine();
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		boolean status=true;
		if(str1.length()!=str2.length())
		{
			status=false;
		}
		else
		{
			//Changing the case of characters of both str1 and str2 and converting them to char array
			char[]	s1=str1.toLowerCase().toCharArray();
			char[] s2=str2.toLowerCase().toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);
			
			//Checking whether s1Array and s2Array are equal
			status=Arrays.equals(s1, s2);
		}
		
		 if(status==true)
	        {
	            System.out.println(str1+" and "+str2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(str1+" and "+str2+" are not anagrams");
	        }

	}
}