package JavaBasics;

public class StudentStack {

		int maxSize;
		long[] stackArray;
		int top;
		
		public StudentStack(int s) 
		{
			  maxSize = s;
		      stackArray = new long[maxSize];
		      top = -1;
		   }

		public void push(long j) {
		      stackArray[++top] = j;
		   }
		   public long pop() {
		      return stackArray[top--];
		   }
		   public long peek() {
		      return stackArray[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public boolean isFull() {
		      return (top == maxSize - 1);
		   }
		   
		   public static void main(String[] args) {
			   StudentStack st=new StudentStack(5);
			   st.push(1);
			   st.push(2);
			   st.push(3);
			   st.push(4);
			   st.push(5);
			   
			   while (!st.isEmpty()) {
			         long value = st.pop();
			         System.out.print(value);
			         System.out.print(" ");
			      }
			      System.out.println("");
			   
	}

}
