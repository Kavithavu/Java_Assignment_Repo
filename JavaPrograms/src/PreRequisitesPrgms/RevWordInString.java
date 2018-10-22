package PreRequisitesPrgms;

import java.util.Scanner;

public class RevWordInString {
	public static void main(String[] args) {
		System.out.println("Enter the words for a string");
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[] inputstr=str.split(" ");
		String revstr=" ";
		for(int i=0;i<inputstr.length;i++)
		{
			String word=inputstr[i];
			String wordrev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				wordrev=wordrev+word.charAt(j);
			}
			revstr=revstr+wordrev+" ";
		}

		System.out.println("The reversed string=" +revstr);
	}
}


