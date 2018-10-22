package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudObj {

	public static void main(String[] args) {

//		ArrayList<Students> list=new ArrayList<Students>();
//		list.add=new Students("kana",12,56);
//		list.add("banu",23,89);
//		Students s3=new Students("cona",2,67);
//		Students s4=new Students("aana",5,78);
		
		 ArrayList<Students> arraylist = new ArrayList<Students>();
		   arraylist.add(new Students("Chaitanya", 26,64));
		   arraylist.add(new Students("Rahul", 24,78));
		   arraylist.add(new Students("Ajeet", 32,89));

		   //Collections.sort((List<T>) arraylist);
		   for(Students str: arraylist){
				System.out.println(str);
		   }
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//		
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		while()
//		Collections.sort(list);
		
	}

}
