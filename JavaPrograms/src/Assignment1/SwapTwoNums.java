package Assignment1;

import java.util.Scanner;

public class SwapTwoNums {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter the value of a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Before Swap: a=" +a+ " and b=" +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap: a=" +a+ " and b=" +b);
		
	}

}
