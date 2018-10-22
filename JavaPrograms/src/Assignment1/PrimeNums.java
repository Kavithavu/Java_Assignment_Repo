package Assignment1;

import java.util.Scanner;

public class PrimeNums {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
			System.out.println("Given Number " +num+ " Is Prime Number");
		else
			System.out.println("Given Number " +num+ " Is NOT A Prime Number");
		sc.close();
	}
 
}
