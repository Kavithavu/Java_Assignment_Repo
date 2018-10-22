package DSAssignment;

public class Student {

	private String name;
	private int id;
	private int marks;
	
	public Student(String nm,int id,int marks)
	{
		this.name=nm;
		this.id=id;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "name="+this.name+" id="+this.id+" and marks="+this.marks;
	}

}
