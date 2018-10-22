package Assignment1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int  num=sc.nextInt();
		if(num%2==0)
			System.out.println("Given Number is Even");
		else
			System.out.println("Given Number is Odd");
	}

}
