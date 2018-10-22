package DSAssignment;


public class StudentStack {
	private int size;
	private int top;
	private Student[] a;
	
	public StudentStack(int s)
	{
		size=s;
		top=-1;
		a=new Student[size];
	}

	public boolean IsFull()
	{
		return top==size-1;
	}

	public boolean IsEmpty()
	{
		return top==-1;
	}

	public Student peek()
	{
		return a[top];
	}
	
	public void push(Student item){
		if(IsFull())
			System.out.println("can't insert the value");
		else
		{	
			top++;
			a[top]=item;
			System.out.println("item has been inserted");
		}
	}
	public Student pop(){
		Student deleted=null;
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
		Student s1=new Student("john",1,23);
		Student s2=new Student("bann",2,56);
		Student s3=new Student("asha",3,45);
		Student s4=new Student("sonu",4,54);
		Student s5=new Student("anuu",5,66);
		
		StudentStack ss=new StudentStack(5);
		ss.push(s1);
		ss.push(s2);
		ss.push(s3);
		ss.push(s4);
		ss.push(s5);
		ss.display();

//		s.push(6);

		Student popped=ss.pop();
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
