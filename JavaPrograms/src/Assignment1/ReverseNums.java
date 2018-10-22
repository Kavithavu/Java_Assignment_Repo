package Assignment1;

import java.util.Scanner;

public class ReverseNums {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int revnum=0;
		while(num!=0) {
			revnum=revnum*10;
			revnum=revnum+(num%10);
			num=num/10;
		}
		System.out.println(revnum);
	}

}
