package PreRequisitesPrgms;

import java.util.Scanner;

public class SwapVarsWithoutThirdVar {

	public static void main(String[] args) {
		System.out.println("Enter values of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap: a=" +a+ " and b=" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a=" +a+ " and b=" +b);
	}

}
