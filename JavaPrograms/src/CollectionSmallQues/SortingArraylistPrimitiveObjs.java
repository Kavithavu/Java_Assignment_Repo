package CollectionSmallQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingArraylistPrimitiveObjs {

	public static void main(String[] args) {

		//ARRAYLIST WITH PRIMITIVES
		ArrayList list=new ArrayList();
		list.add(3);
		list.add(9);
		list.add(1);
		list.add(0);
		Collections.sort(list);
		Iterator it=list.iterator();
		System.out.println("The sorted array is:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
		//ARRAYLIST WITH OBJECTS SORTING
		ArrayList list1=new ArrayList();
		Student s1=new Student("suman", 1, 89);
		Student s2=new Student("aruna", 2, 85);
		Student s3=new Student("banu", 15, 90);
		Student s4=new Student("john", 13, 50);
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		Collections.sort(list1, new StudentName());
//		System.out.println("The sorted array is:" +list1);
		Iterator it1=list1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
	

}
