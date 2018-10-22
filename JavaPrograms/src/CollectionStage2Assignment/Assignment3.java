/*3 Create student class with name(String type) and regno (int type) attributes. use any collection to Store 5 student information.
 *  sort students using name(only unique student objects should be printed 
(Ex s1(aa,11) s2(aa,12) s3(aa,11) s4(bb,12) then s1(aa,11) s2(aa,12) s4(bb,12) should be printed.
*/

package CollectionStage2Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment3 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		StudentColl2 s1=new StudentColl2("aa",11);
		StudentColl2 s2=new StudentColl2("aa",12);
		StudentColl2 s3=new StudentColl2("aa",11);
		StudentColl2 s4=new StudentColl2("bb",12);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println("Elements after sorting");
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		TreeSet set=new TreeSet(list);
//		System.out.println("After sorting");
//		ArrayList list=new ArrayList(set);
//		Collections.sort(list,new StudentColl2Name());
//		Iterator it1=set.iterator();
//		while(it1.hasNext())
//		{
//			System.out.println(it1.next());
//		}
	}

}
