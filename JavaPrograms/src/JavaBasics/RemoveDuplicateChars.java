/* WJP to remove duplicate character from the given string */

package JavaBasics;

import java.util.Scanner;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String:");
	    String s=scn.nextLine();
	    String ans="";

	           while(s.length()>0)
	        {
	           char ch = s.charAt(0);
	            ans+= ch;
	            s = s.replace(ch+"",""); //Replacing all occurrence of the current character by a spaces
	        }
	    System.out.println("after removing all duplicate letters:"+ans);

	}

}
