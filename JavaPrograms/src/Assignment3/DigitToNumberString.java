/*Accept 4 digit number and display number in string 
( i/p --> 2314, o/p --> two three one four )"*/

package Assignment3;

import java.util.Scanner;

public class DigitToNumberString {

	public static void main(String[] args) {

		System.out.println("Enter the 4 digit number");
		Scanner sc=new Scanner(System.in);
		String dig=sc.nextLine();
		String result="";
		char[] ch=dig.toCharArray();
//		for(char c:ch)
//		System.out.println(c);
		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
			switch (ch[i]) {
			case '1':
//				System.out.println(ch[i]);
				result=result + "one ";
				break;
			case '2':
				result=result + "two ";
				break;
			case '3':
				result=result+ "three ";
				break;
			case '4':
				result=result+"four ";
				break;
			case '5':
				result=result+"five ";
				break;

			case '6':
				result=result+"six ";
				break;

			case '7':
				result=result+"seven ";
				break;

			case '8':
				result=result+"eight ";
				break;

			case '9':
				result=result+"nine ";
				break;

			case '0':
				result=result+"nine ";
				break;

			default:
				break;
			}
		}
		System.out.println(result);
	}
}
