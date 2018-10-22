//4.find factorial of given number using  single stack

package DSAssignment;

import java.util.Scanner;

public class FactorialStack {

	private int size;
	private int[] a;
	private int top;

	public FactorialStack(int s) {
		size=s;
		a=new int[size];
		top=-1;
	}

	public boolean IsFull()
	{
		return (top==size-1);
	}

	public boolean IsEmpty()
	{
		return top==-1;
	}

	public void push(int item)
	{
		if(IsFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				++top;
				a[top]=item;
				item--;
			}
		}
	}
	
	public void display(int num)
	{
		int temp=top;
		int fact=1;
		while(temp>-1) {
			fact=fact*a[temp];
		  temp--;
		}
		System.out.println("Factorial of " +num+ " is: " +fact);
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		FactorialStack fs=new FactorialStack(num);
		fs.push(num);
		fs.display(num);

	}

}
