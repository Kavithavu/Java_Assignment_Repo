/*Q23. WJP to differentiate input as string, int or bool*/

package Java_HackathonTest;

import java.util.Scanner;

public class Q23CheckInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String");
		String input=sc.next();
		sc.close();
		try{
			Integer.parseInt(input);
			System.out.println(input + " is an int.");
		}
		catch(NumberFormatException e) {
			try {
				if(input.equals("false") || input.equals("true")) {
				System.out.println(input + " is a boolean.");
				}
				else {
					System.out.println(input + " is a String.");
				}
			}
			catch (Exception ex) {
//				System.out.println(input + " is a String.");
			}
		}

	}

}
