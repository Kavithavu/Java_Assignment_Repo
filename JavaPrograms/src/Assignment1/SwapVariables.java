package Assignment1;

public class SwapVariables {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("Values Before Swapping a=" +a+ " b=" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values after Swapping a=" +a+ "  b=" +b );
	}

}
