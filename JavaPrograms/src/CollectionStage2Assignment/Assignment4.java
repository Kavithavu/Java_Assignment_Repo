/*4> Consider student class with name and sem attribute and Library class with libNum and totalBooks attributes. 
 * Store 5 Library objects as key and Student object as value in TreeMap object and print the content
 */

package CollectionStage2Assignment;

import java.util.TreeMap;

public class Assignment4 {
	static StudentColl2 s1=new StudentColl2("anu",1);
	StudentColl2 s2=new StudentColl2("banu",2);
	StudentColl2 s3=new StudentColl2("aana",3);
	StudentColl2 s4=new StudentColl2("chinnu",4);
	StudentColl2 s5=new StudentColl2("dianna",5);
	
	Library l1=new Library(1,10);
	Library l2=new Library(2,15);
	Library l3=new Library(3,20);
	Library l4=new Library(4,30);
	Library l5=new Library(5,50);

	
	public static void main(String[] args) {
		TreeMap map=new TreeMap();
//		map.put(l1, s1);
		
	}

}
