package JavaBasics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("Given Number is Even");
		else
			System.out.println("Given Number is Odd");
		
	}

}
