/*reverse the given string without using reverse command*/

package Assignment3;

import java.util.Scanner;

public class ReverseStringWitoutRevCmd {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
	System.out.println(rev);
	}

}
