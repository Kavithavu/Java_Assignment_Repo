package Assignment1;

import java.util.Scanner;

public class LargestOfThreeNums {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter 3 Numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("A is Biggest Number");
		else if(b>c)
			System.out.println("B is Biggest Number");
		else 
			System.out.println("C is Biggest NUmber");
		
	}

}
