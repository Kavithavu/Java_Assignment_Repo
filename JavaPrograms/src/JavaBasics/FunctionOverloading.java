package JavaBasics;

import java.util.Scanner;

public class FunctionOverloading {

	public static void main(String[] args) {
		 int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("1:Add Two NUmber");
      a=sc.nextInt();
      System.out.println("Enter the value of B:");
      b=sc.nextInt();
      addNumber(a,b);
      System.out.println("Enter the value of C:");
      c=sc.nextInt();
      addnumber(a,b,c);
		
	}
	
	public static void addNumber(int a,int b)
	{
		int res;
		res=a+b;
		System.out.println("The sum of two numbers is:" +res);
	}
	public static void addnumber(int a,int b,int c)
	{
		int res;
		res=a+b+c;
		System.out.println("The sum of Three numbers is:" +res);
	}
}
