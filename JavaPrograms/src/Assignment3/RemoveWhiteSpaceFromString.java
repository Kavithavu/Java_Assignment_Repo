package Assignment3;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s=s.replaceAll(" ", "");
		System.out.println(s);
	}

}
