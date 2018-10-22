/*1.implement stack with all operations to add to the stack
	a) integer elements
	b) character elements
	c) string elements
	d) student objects(each student object contains name,id and marks attributes)
 */
package DSAssignment;

public class MyStack {
	private int[] a;
	private int top;
	private int size;

	public MyStack(int sp)
	{
		size=sp;
		a=new int[size];
		top=-1;
	}

	public boolean IsFull()
	{
		return top==size-1;
	}

	public boolean IsEmpty()
	{
		return top==-1;
	}

	public int peek()
	{
		return a[top];
	}

	public void push(int item)
	{
		if(IsFull())
			System.out.println("Stack is full cannot push");
		else
		{
			a[++top]=item;
			System.out.println("Item has been inserted");
		}
	}

	public int pop()
	{
		int deleted=-1;
		if(IsEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			deleted=a[top];
			top--;
		}
		return deleted;

	}

	public void Display()
	{
		System.out.println("Contents of stack");
		int temp=top;
		while(temp>-1)
		{
			System.out.println(a[temp]);
			temp--;
		}

	}


	public static void main(String[] args) {
		MyStack sp=new MyStack(5);
		sp.push(7);
		sp.push(9);
		sp.push(5);
		sp.push(4);
		sp.push(8);
		sp.Display();
		int it=sp.pop();
		System.out.println(it);
		sp.Display();
		sp.pop();
		sp.pop();
		sp.pop();
		sp.Display();
	}

}
