/*Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q14RevOfWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=" ";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i]+ " ";
		}
	
		System.out.println(rev);
	}

}
