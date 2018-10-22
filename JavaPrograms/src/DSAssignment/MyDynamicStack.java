package DSAssignment;

public class MyDynamicStack {

	private int[] a;
	private int size;
	private int top;

	public MyDynamicStack(int s)
	{
		size=s;
		a=new int[size];
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

	public int peek()
	{
		return a[top];
	}

	public int pop()
	{
		int deleted=-1;
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

	public void push(int item)
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
		int temp=top;
		while(temp>-1)
		{
			System.out.println(a[temp]);
			temp--;
		}

	}

	private void increaseSize() {
		int[] b=new int[size*2];
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		a=b;
		size=size*2;
	}

	public static void main(String[] args) {

		MyDynamicStack ds=new MyDynamicStack(5);
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.Display();
		ds.push(6);
		ds.push(8);
		ds.Display();
		int a=ds.peek();
		System.out.println("top element:" +a);
		ds.pop();
		ds.Display();
	}

}
