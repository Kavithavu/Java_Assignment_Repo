package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add("aana");
		list.add(10);
		list.add(30);
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		//descendingIterator() is available in only linkedlist 
		Iterator it=list.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
