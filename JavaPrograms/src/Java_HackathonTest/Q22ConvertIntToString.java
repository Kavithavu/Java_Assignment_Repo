/*Q22. WJP to convert int to string*/
package Java_HackathonTest;

import java.util.Scanner;

public class Q22ConvertIntToString {

	public static void main(String[] args) {

		System.out.println("Enter the integer number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		String str = String.valueOf(n);
		String str2 = Integer.toString(n);
		System.out.println("The converted number is " +str);
		System.out.println("The converted number is " +str2);

	}

}
