package CollectionStage2Assignment;

public class StudentColl2 implements Comparable<StudentColl2>{
	
	private String name;
	private int regno;
	
	public StudentColl2(String name,int rn) 
	{
		this.name=name;
		this.regno=rn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", regno=" + regno + "";
	}

	@Override
	public int compareTo(StudentColl2 ob) {
		int ret =(this.getName()).compareTo(ob.getName());
		if (ret == 0){
			ret =(this.getRegno()) - (ob.getRegno());
		}
		return ret;
	}

//	@Override
//	public int compareTo(StudentColl2Name o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
