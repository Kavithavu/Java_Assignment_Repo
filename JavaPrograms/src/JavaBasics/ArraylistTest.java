package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistTest {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(40);
		list.add(20.5);
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println(list);
}
}
