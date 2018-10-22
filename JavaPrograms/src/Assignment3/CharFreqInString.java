/*Java Program To Count Occurrences Of Each Character In String */

package Assignment3;

import java.util.Scanner;

public class CharFreqInString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		StringBuffer all = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{  
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] )
				{
					count++;
				}
			}
			if(count > 1) {
				if(!all.toString().contains(ch[i]+"")) {
					all = all.append(ch[i]);
					System.out.println(" Character  " +ch[i]+ " Occured " +count+ " time");
				}
			}
			else {
				System.out.println(" Character  " +ch[i]+ " Occured " +count+ " time");
			}
			count=0;
		}
	}

}
