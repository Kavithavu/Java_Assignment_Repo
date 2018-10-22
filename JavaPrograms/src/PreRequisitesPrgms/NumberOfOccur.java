package PreRequisitesPrgms;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccur {

	private static void count(int[] arr) {
		Arrays.sort(arr);
		int sum = 0, counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] == arr[arr.length - 1]) {
				System.out.println(arr[0] + ": " + counter + " times");
				break;
			} else {
				if (i == (arr.length - 1)) {
					sum += arr[arr.length - 1];
					counter++;
					System.out.println((sum / counter) + " : " + counter + " times");
					break;
				} else {
					if (arr[i] == arr[i + 1]) {
						sum += arr[i];
						counter++;
					} else if (arr[i] != arr[i + 1]) {
						sum += arr[i];
						counter++;
						System.out.println((sum / counter) + " : " + counter + " times");
						sum = 0;
						counter = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + i + "th element of array");
			arr[i] = sc.nextInt();

		}
		count(arr);
	}
}

