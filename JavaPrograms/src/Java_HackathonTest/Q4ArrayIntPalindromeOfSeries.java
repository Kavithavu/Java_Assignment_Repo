/*Given an array of integers check the Palindrome of the series*/

package Java_HackathonTest;

import java.util.Scanner;

public class Q4ArrayIntPalindromeOfSeries {

	private static int IsPalindrome(int item) {
		int rev=0;
		int rem=0;
		int num=item;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==item)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {

		System.out.println("Enter size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter" +size+ "Elements of an array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Palindrome  of the Series");
		for(int i=0;i<size;i++)
		{
			if(IsPalindrome(arr[i])==1)
			{
				System.out.println(arr[i]);
			}
		}
	}


}
