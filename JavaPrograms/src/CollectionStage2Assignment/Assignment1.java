//1 Create student class with name(String type) and regno (int type) attributes. 
//use any collection to Store 5 student information. (no duplicates).

package CollectionStage2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment1 {

	public static void main(String[] args) {
		HashSet<StudentColl2> set=new HashSet<StudentColl2>();
		
		StudentColl2 s1=new StudentColl2("john", 45);
		StudentColl2 s2=new StudentColl2("manu", 12);
		StudentColl2 s3=new StudentColl2("sonu", 89);
		StudentColl2 s4=new StudentColl2("banu", 34);
		StudentColl2 s5=new StudentColl2("aana", 990);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Sorted hashset elements ");
		ArrayList list=new ArrayList(set);
		Collections.sort(list,new StudentColl2Name());
		Iterator it1=list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
//		Collections.sort(set,new StudentColl2Name());
//		TreeSet ts=new TreeSet(set);
//		System.out.println(ts);
		
	}

}
