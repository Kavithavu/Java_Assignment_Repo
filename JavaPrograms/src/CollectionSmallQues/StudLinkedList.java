/*3. add 5 student object[name,id,marks] to linkedlist and sort using their names*/
package CollectionSmallQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StudLinkedList {

	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		
		Student ob1=new Student("zeeyan",12,45);
		Student ob2=new Student("ron",11,78);
		Student ob3=new Student("banu",10,90);
		Student ob4=new Student("janu",9,70);
		Student ob5=new Student("aana",5,67);
		
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		list.add(ob5);
		
		Collections.sort(list, new StudentName());
//		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
