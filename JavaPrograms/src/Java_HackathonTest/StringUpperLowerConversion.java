package Java_HackathonTest;

import java.util.Scanner;

public class StringUpperLowerConversion {

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println(str);
		System.out.println("Upper Case of string is");
		str=str.toUpperCase();
		System.out.println(str);
	}

}
