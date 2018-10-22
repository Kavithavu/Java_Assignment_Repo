/*Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. */
package Java_HackathonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q5UniqAndDuplicateOfArray {

	public static void main(String[] args) {
		System.out.println("Enter size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter" +size+ "elements of an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0;i<size;i++)
		{
			int count=1;
			while((i+1)<=arr.length-1 && arr[i]==arr[i+1])
			{
				count++;
				i++;
			}
			if(count == 1)
				System.out.println("Unique element is " +arr[i]);
			else
				System.out.println("Repeated number is " +arr[i] + " count" +count);

		}
	}
}

