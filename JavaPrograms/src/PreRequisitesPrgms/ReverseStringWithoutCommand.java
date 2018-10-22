/*6. Reverse string without using reverse command*/

package PreRequisitesPrgms;

import java.util.Scanner;

public class ReverseStringWithoutCommand {

	public static void main(String[] args) {

		System.out.println("Enter the String to be reversed");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String revstr=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		
		System.out.println("Reversed String = " +revstr);
	}

}
