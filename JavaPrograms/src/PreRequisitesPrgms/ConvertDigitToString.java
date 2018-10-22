/*9. Convert digits to string (i/p →1253 →One Two five three)*/

package PreRequisitesPrgms;

import java.util.Scanner;

public class ConvertDigitToString {

	public static void main(String[] args) {
		ConvertDigitToString w=new ConvertDigitToString();
		System.out.println("Enter the number to be converted");
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		char[] ch=number.toCharArray(); 
		String result=" ";
		for(int i=0;i<ch.length;i++)
		{
			switch (ch[i]) {
			case '1':result=result+" One";
				break;
			case '2':result=result+" Two";
			break;
			case '3':result=result+" Three";
			break;
			case '4':result=result+" Four";
			break;
			case '5':result=result+" Five";
			break;
			case '6':result=result+" Six";
			break;
			case '7':result=result+" Seven";
			break;
			
			case '8':result=result+" Eight";
			break;
			case '9':result=result+" Nine";
			break;
			default:
				break;
			}
		}
		System.out.println(result);
	}

}