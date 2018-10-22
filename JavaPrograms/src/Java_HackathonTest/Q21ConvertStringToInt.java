/*Q21. WJP to convert string to int*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q21ConvertStringToInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Input a string");
	    String str = in.nextLine();
	    in.close();

		int result = Integer.parseInt(str);
		Integer result1 = Integer.valueOf(str);
		System.out.println("String to Int using parseInt result is " +result);
		System.out.println("String to Int valueOf result is " +result1);

	}

}
