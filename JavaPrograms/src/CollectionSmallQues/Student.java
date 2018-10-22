package CollectionSmallQues;

public class Student{
	private String Name;
	private int Id;
	private int marks;

	public Student(String name,int id,int marks)
	{
		this.Name=name;
		this.Id=id;
		this.marks=marks;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Name=" + Name + ", Id=" + Id + ", marks=" + marks;
	}

}
