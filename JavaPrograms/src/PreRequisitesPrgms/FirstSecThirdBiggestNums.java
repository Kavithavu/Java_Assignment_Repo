/*3. Write Java program to find first big, second big and third biggest number (Take user input, use
scanner function)*/
package PreRequisitesPrgms;

import java.util.Scanner;

public class FirstSecThirdBiggestNums {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter integers to be compared");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();

		int fBig = 0, sBig = 0, tBig = 0;

		if (a > b) {
			if (a > c) {
				fBig = a;
				if (b > c) {
					sBig = b;
					tBig = c;
				} else {
					sBig = c;
					tBig = b;
				}

			} else {
				fBig = c;
				sBig = a;
				tBig = b;
			}
		} else if (b > c) {
			fBig = b;
			if (a > c) {
				sBig = a;
				tBig = c;
			} else {
				sBig = c;
				tBig = a;
			}
		} else {

			fBig = c;
			sBig = b;
			tBig = a;
		}

		System.out.println("fBig=" + fBig);
		System.out.println("sBig=" + sBig);
		System.out.println("tBig=" + tBig);
	}

}
