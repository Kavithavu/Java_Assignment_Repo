/*Q 62. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be based on var k.
 *  Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4] 
 */
package Java_HackathonTest;

public class Q62Reverse3 {

	public static void main(String[] args) {
		int a[] = { 2, 12, 8, 6, 5, 1, 2, 10, 3, 2 };
		reverseArray(a,3);
		display(a);

	}

	public static void display(int a[]) {
		for (int a1 : a) {
			System.out.print(a1 + ",");
		}
	}

	public static void reverseArray(int a[],int count)
	{
		for (int i=0;i<count;i++) {

			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;;
		}

	}

}
