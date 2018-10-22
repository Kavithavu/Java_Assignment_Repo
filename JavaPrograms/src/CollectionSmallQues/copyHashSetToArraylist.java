//COPY HASHSET ELEMENTS TO ARRAYLIST 
package CollectionSmallQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class copyHashSetToArraylist {

	public static void main(String[] args) {

		HashSet set=new HashSet();
		set.add(4);
		set.add(51);
		set.add(13);
		set.add(2);
		set.add(1);
		
		System.out.println("Copied elements from hashset to arraylist: ");
		ArrayList list=new ArrayList(set);
		
		Iterator it =list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Sorted HashSet elements are");
		TreeSet mytreeset=new TreeSet();
		mytreeset.addAll(set);
		System.out.println(mytreeset);
	}

}
