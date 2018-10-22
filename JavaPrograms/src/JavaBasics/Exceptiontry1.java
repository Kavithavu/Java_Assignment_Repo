package JavaBasics;

public class Exceptiontry1 {

	public static void main(String[] args) {
		System.out.println("Divide by zero");
		int a=10;
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hjnj");
	}

}
