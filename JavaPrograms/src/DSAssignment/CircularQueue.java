package DSAssignment;

public class CircularQueue {

	public int size;
	public int a[];
	public int front;
	public int rear;
	public int currentsize;

	public CircularQueue(int s)
	{
		this.size=s;
		a=new int[size];
		front=0;
		rear=-1;
		currentsize=0;
	}

	public boolean isEmpty()
	{
		if(currentsize==0)
			return true;
		else
			return false;
	}

	public boolean isFull()
	{
		if(currentsize==size)
			return true;
		else
			return false;
	}

	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queueue is full");
		}
		else
		{
			rear=(rear+1)%size;
			a[rear]=item;
			currentsize++;
		}

	}

	public int dequeue()
	{
		int item=-1;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			item=a[front];
			front=(front+1)%size;
			currentsize--;
		}
		return item;
	}

	public void display()
	{
		System.out.println("Contents of queue are:");
		for(int i=front;i<=rear;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		CircularQueue cq=new CircularQueue(4);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.display();
		cq.dequeue();
		cq.display();
		cq.enqueue(7);
		cq.display();
	}

}
