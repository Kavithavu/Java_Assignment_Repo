/*Q15. Given a string print the unique words of the string.*/

package Java_HackathonTest;

import java.util.Scanner;

public class Q15UniqueWordsOfString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] words=str.split(" ");
		int count;
		for(int i=0;i<words.length;i++)
		{
			count=0;
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]) && i!=j)
				{
					count++;
				}
			}
			if(count==0)
				System.out.println("The word " +words[i]+ "  Is Unique");
			else
				System.out.println("The word " +words[i]+ "  Is  repeated");
		}
	}

}
