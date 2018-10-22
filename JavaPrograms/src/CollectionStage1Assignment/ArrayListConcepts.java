/*
convert array content to list content
convert list content to array
sort arraylist
compare two lists for equality--->equal or not equal
compare two list and print only common elements
store 5 student objects in arraylist.sort them using name
sort hashset
find the frequency of each character in the string
using hashMap
using frequency method
 */

package CollectionStage1Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import CollectionSmallQues.Student;
import CollectionSmallQues.StudentName;

public class ArrayListConcepts {

	public static void main(String[] args) {

		//		convert array content to list content

		int[] a=new int[] {2,4,6,5,1};
		ArrayList list=new ArrayList();

		for(int i: a)
		{
			list.add(i);
		}
		//		System.out.println(list);
		System.out.println("Conversion of array to arraylist");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//		convert list content to array
	ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("sonu");
		arr1.add("banu");
		arr1.add("conu");
		arr1.add("janu");

		String[] str=new String[arr1.size()];
		arr1.toArray(str);
		System.out.println("Created Array content");
		for(String st: str)
		{
			System.out.println(st);
		}

		//convert list to array
//		ArrayList arr4=new ArrayList();
//		arr4.add(1);
//		arr4.add(2);
//		arr4.add(3);
//		arr4.add(4);
//
//		String[] str3=new String[arr1.size()];
//		arr1.toArray(str3);
//		System.out.println("Created Array content");
//		for(String st: str3)
//		{
//			System.out.println(st);
//		}
//		
		//Sort ArrayList
		System.out.println("Sorted Arraylist is:");
		Collections.sort(arr1);
		Iterator it1=arr1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}

		
		
		//compare two lists for equality--->equal or not equal
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("sonu");
		arr2.add("monu");
		arr2.add("deepa");
		arr2.add("janu");
		ArrayList<String> arr3=new ArrayList<String>();
		
		System.out.println("Comparison of two arraylists is:");
		
		for(String str1:arr1)
			arr3.add(arr2.contains(str1) ? "yes": "NO");
			System.out.println(arr3);

		
	//		compare two list and print only common elements
			arr2.retainAll(arr1);
			System.out.println(arr2);
			
			
//	store 5 student objects in arraylist.sort them using name	
			
			Student s1=new Student("anu",20, 80);
			Student s2=new Student("chinnu",10, 60);
			Student s3=new Student("diya",30, 50);
			Student s4=new Student("banu",50, 78);
			Student s5=new Student("janu",40, 90);
			
			ArrayList<Student> as=new ArrayList<Student>();
			as.add(s1);
			as.add(s2);
			as.add(s3);
			as.add(s4);
			as.add(s5);

			Collections.sort(as,new StudentName());
			Iterator it2=as.iterator();
			while(it2.hasNext())
			{
				System.out.println(it2.next());
			}
			
	}

}
