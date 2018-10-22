package CollectionSmallQues;

import java.util.Comparator;

public class StudentId implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.getId()-o2.getId());
	}

}
