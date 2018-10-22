//"we test coders.give us a try?"

package Assignment6;

import java.util.Scanner;

public class findSentenceWordsInText {

	public static void main(String[] args) {

		System.out.println("Enter the Text");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] sentence=str.split("[\\.\\?\\!]+");
		int len;
		String st;
		
		System.out.println("Number of sentences in a given text are:" +sentence.length);
		
		for(int i=0;i<sentence.length;i++)
		{
			st=sentence[i];
		    String[] words=st.split(" ");
		    System.out.println("The " +(i+1)+ " sentence contains "  +words.length+  " words");
		}
		
	}

}
