/*print all the subset in a given array
	example {2,3,4}
	o/p is 
	{}
	{2}
	{3}
	{4}
	{2,3}
	{2,4}
	{3,4}
	{2,3,4}
 */
package Assignment5;

import java.util.Arrays;

public class SubsetOfArray {

	public static void main(String[] args) {
		int[] source = {2,3,4};
		printSubsets(source);

	}

	private static void printSubsets(int[] source) {

		int n=source.length;
		// Run a loop for printing all 2^n 
		// subsets one by obe 
		for (int i = 0; i < (1<<n); i++) 
		{ 
			System.out.print("{ "); 

			// Print current subset 
			for (int j = 0; j < n; j++) 

				// (1<<j) is a number with jth bit 1 
				// so when we 'and' them with the 
				// subset number we get which numbers 
				// are present in the subset and which 
				// are not 
				if ((i & (1 << j)) > 0) 
					System.out.print(source[j] + " "); 

			System.out.println("}"); 
		} 
	} 
}

