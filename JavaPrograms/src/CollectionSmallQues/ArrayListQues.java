/*1. add array elements to arrayList
  2. delete all elements form arraylist 
  */

package CollectionSmallQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListQues {

	public static void main(String[] args) {
		int[] a=new int[] {5,6,7,3,2,1};
		ArrayList list=new ArrayList();

		//list.addAll(Arrays.asList(a)); NOT A GOOD IDEA - GOOD FOR STRINGS AND OTHER OBJECT CLASS

		for(int ele: a)
		{
			list.add(ele);
		}

		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		//2.Delete all elements from the list
		System.out.println("After deleting all elements from the arraylist");
					list.clear();
		System.out.println(list);

	}
}

