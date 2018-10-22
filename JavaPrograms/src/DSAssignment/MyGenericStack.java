package DSAssignment;

import java.util.Iterator;

public class MyGenericStack<G extends Object> {

	private int size;
	private G[] a;
	private int top;
	
	public MyGenericStack(int sp)
	{
		size=sp;
		a=(G[])new Object[size];
		top=-1;
	}

	
	public boolean Isfull()
	{
		return top==size-1;
	}

	public boolean IsEmpty()
	{
		return top==-1;
	}

	public G peek()
	{
		return a[top];
	}

	public G pop()
	{
		G deleted=null;
		if(IsEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			deleted=a[top];
			top--;
		}
		return deleted;
	}

	public void push(G item)
	{
		if(Isfull())
		{
			System.out.println("Stack Overflow");
			increaseSize();

		}
			a[++top]=item;
	}

	public void Display()
	{
		System.out.println("Contents of stack");
//		Iterator<G> it=new Iterator<MyGenericStack.G>() {
//		};

	}

	private void increaseSize() {
		G[] b=(G[]) new Object[size*2];
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		a=b;
		size=size*2;
	}
	
	public static void main(String[] args) {
		MyGenericStack<String> stringStack = new MyGenericStack<String>(2);
		stringStack.push("codesjava");
		MyGenericStack<Integer> integerStack = new MyGenericStack<Integer>(2);
		integerStack.push(13);

	}

}
