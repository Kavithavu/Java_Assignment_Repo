/*4.write a program to generate 10 random numbers. */
package Assignment2;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
    Random t=new Random();
    for(int i=0;i<10;i++)
    {
    	System.out.println(t.nextInt());
    }
		
	}

}
