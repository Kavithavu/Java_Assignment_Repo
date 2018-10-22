/*Q26. WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 
 * After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
 */
package Java_HackathonTest;

import java.util.Scanner;

public class Q26MergeSort {

	public static void main(String[] args) {
		int[] a = {1,2,4,6,9,10,0,0,0,0};
		int[] b = {3, 5,7,8};

		for (int j = 0; j < b.length; j++) {
			int bItem = b[j];
			for (int i = 0; i < a.length; i++) {
				int aItem = a[i];
				if(bItem < aItem) {

					for (int k = a.length -1; k > i; k--) {
						a[k] = a[k-1];
					}
					a[i]=bItem;
					break;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
