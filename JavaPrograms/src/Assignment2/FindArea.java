/*1.Write a program to find area of circle, triangle using overloading methods*/

package Assignment2;

import java.util.Scanner;

public class FindArea {
	public static double area(double r)
	{
		double res;
		res=3.142*r*r;
		return res;

	}

	public static double area(double b,double h)
	{
		double res;
		res=(b*h)/2;
		return res;

	}

	public static void main(String[] args) {
		double r,b,h,res;
		System.out.println("1:Find the area of circle. 2:Find area of triangle");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter the radius of the circle");
			r=sc.nextInt();
			res=area(r);
			System.out.println("Area of Circle=" +res);
		}
		else
		{
			System.out.println("Enter the value of base");
			b=sc.nextInt();
			System.out.println("Enter the value of Height");
			h=sc.nextInt();
			res=area(b,h);
			System.out.println("Area of triangle=" +res);
		}
	}

}
