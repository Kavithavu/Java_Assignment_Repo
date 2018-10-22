package Assignment3;

public class FinalizeTest {

	public void finalize()
	{
		System.out.println("Garbage collected");
	}
	public static void main(String[] args) {
		FinalizeTest f1=new FinalizeTest();
		f1=null;
		System.gc();

	}

}
