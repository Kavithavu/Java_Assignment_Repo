/*Q1:Write a java program to count the number of words in a string */

package Assignment3;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String[] st=s.split(" ");
		System.out.println("Number of words in string are: " +st.length);
		System.out.println("Words are:");
		for(String a:st)
			System.out.println(a);
		
	}

}
