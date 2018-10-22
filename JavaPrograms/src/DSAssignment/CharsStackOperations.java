package DSAssignment;

public class CharsStackOperations {

	private int size;
	private char[] a;
	private int top;

	public CharsStackOperations(int s) {
		size=s;
		a=new char[size];
		top=-1;
	}
	public boolean isFull(){

		return top==size-1;
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public int peek(){
		return a[top];
	}
	public void push(char item){
		if(isFull())
			System.out.println("can't insert the value");
		else
		{	
			top++;
			a[top]=item;
			System.out.println("item has been inserted");
		}
	}
	public char pop(){
		char deleted=' ';
		if(isEmpty())
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
		// TODO Auto-generated method stub
		
		CharsStackOperations s=new CharsStackOperations(5);

			s.push('a');
			s.push('b');
			s.push('c');
			s.push('d');
			s.push('e');
			s.display();

//			s.push(6);

			char popped=s.pop();
			System.out.println("deleted element is="+popped);
			System.out.println("after popping");
			s.display();
//
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			System.out.println("after popping");
			s.display();
			s.pop();


	}

}





