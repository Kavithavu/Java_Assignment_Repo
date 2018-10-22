package CollectionStage2Assignment;

import java.util.Comparator;

public class StudentColl2Name implements Comparator<StudentColl2>{
	
	public String name;

	@Override
	public int compare(StudentColl2 o1, StudentColl2 o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
	}

}
