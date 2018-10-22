/* WRITE A JAVA PROGRAM TO DISPLAY NUMBERS FROM 1 TO 100*/

package JavaBasics;

public class Numbers {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			System.out.print(i +" ");
			if(i%10==0)
				System.out.println();
		}
		
	}

}
