package CollectionSmallQues;

import java.util.Comparator;

public class StudentName implements Comparator<Student>{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getName()).compareTo(o2.getName());
	}

}
