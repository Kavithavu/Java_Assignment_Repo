package Assignment1;

import java.util.Scanner;

public class PrimeNumsInTheRange {

	public static void main(String[] args) {
		int start,end,flag=0;
		System.out.println("Enter the starting point num");
		Scanner sc=new Scanner(System.in);
		start=sc.nextInt();
		System.out.println("Enter the end point num");
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			
			if(flag==1)
			{
				System.out.println(i);
			}
		}
		
	}

}
