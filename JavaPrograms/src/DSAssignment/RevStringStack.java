//5. reverse the given string using stack

package DSAssignment;

import java.util.Scanner;

public class RevStringStack {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public RevStringStack(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1; 
	} 


	public void push(char j) {
		stackArray[++top] = j;
	} 
	public char pop() {
		return stackArray[top--];
	} 
	public char peek() {
		return stackArray[top];
	} 
	public boolean isEmpty() { 
		return (top == -1);
	} 
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int stackSize = input.length();
		RevStringStack theStack = new RevStringStack(stackSize);

		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			theStack.push(ch);
		} 
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			System.out.print(ch);
		} 
	}


}
