package CollectionStage1Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class sortHashSet {

	public static void main(String[] args) {

		HashSet hashset=new HashSet();
		hashset.add(8);
		hashset.add(81);
		hashset.add(2);
		hashset.add(90);
		hashset.add(1);
		
		System.out.println("HashSet elements before sorting");
		Iterator it= hashset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("HashSet elements after sorting");
		
		TreeSet mytreeset=new TreeSet();
		mytreeset.addAll(hashset);
		System.out.println(mytreeset);
		
	}

}
