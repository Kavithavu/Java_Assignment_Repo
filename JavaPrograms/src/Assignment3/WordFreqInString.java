/*Write a java program to find frequency of a given word in a given string*/

package Assignment3;

import java.util.Scanner;

public class WordFreqInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the substring");
		String substr=sc.nextLine();
		int ind,count=0;
        for(int i=0; i+substr.length()<=str.length(); i++)    //i+sub.length() is used to reduce comparisions
        {
            ind=str.indexOf(substr,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println("Occurence of '"+substr+"' in String is "+count);
 
    }
}

