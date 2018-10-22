package DSAssignment;

public class StringStack {
	private int size;
	private int top;
	private String[] a;
	
	public StringStack(int s)
	{
		size=s;
		top=-1;
		a=new String[size];
	}

	public boolean IsFull()
	{
		return top==size-1;
	}

	public boolean IsEmpty()
	{
		return top==-1;
	}

	public String peek()
	{
		return a[top];
	}
	
	public void push(String item){
		if(IsFull())
			System.out.println("can't insert the value");
		else
		{	
			top++;
			a[top]=item;
			System.out.println("item has been inserted");
		}
	}
	public String pop(){
		String deleted=" ";
		if(IsEmpty())
			System.out.println("no more element left in the stack");
		else{
			deleted=a[top];
			top--;
		}
		return deleted;
	}

	public void display(){
		System.out.println("content of stack:");
		int temp=top;
		while(temp>-1){
			System.out.println(a[temp]);
			temp--;
		}
	}


	
	public static void main(String[] args) {
		StringStack ss=new StringStack(5);
		
		ss.push("abc");
		ss.push("dce");
		ss.push("fgh");
		ss.push("ijk");
		ss.push("lmn");
		ss.display();

//		s.push(6);

		String popped=ss.pop();
		System.out.println("deleted element is="+popped);
		System.out.println("after popping");
		ss.display();
//
		
		ss.pop();
		ss.pop();
		ss.pop();
		ss.pop();
		System.out.println("after popping");
		ss.display();
		ss.pop();

	}

}
