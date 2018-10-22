package JavaBasics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector list=new Vector();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		//vector is thread safe and synchronized. enumeration is available in only vectors 
		Enumeration ee=list.elements();
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
	}

}
