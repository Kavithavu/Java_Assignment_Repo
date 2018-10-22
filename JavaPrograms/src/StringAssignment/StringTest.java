/*1. Find the position of the given character in a given string
2. Replace given character with * in a given string
3. Find the number of words in a given string
4. Find number of characters in a given string
5. Check the given word is present in a given string
6. Convert the fallowing to string
i) Int
ii) Char
iii) boolean
7. Convert string to array of character
8. Find the length of the given string
9. Convert all characters to upper case in a given string ( b. lower case )
10. Find the character in a given position in a given string*/
package StringAssignment;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch='s';
		System.out.println("Enter the character ");
		ch=sc.next().charAt(0);
		System.out.println(str.indexOf(ch));

		System.out.println(str.replace(ch, '*'));

		//3. Find the number of words in a given string
		String[] words=str.split(" ");
		int length=words.length;
		System.out.println("Number of words in string:" +length);

		//4. Find number of characters in a given string
		char[] chars=str.toCharArray();
		int len=chars.length;
		System.out.println("Number of characters in a given string:" +len);

		//5. Check the given word is present in a given string
		System.out.println("Enter the word to be checked");
		String chk=sc.next();
		if(str.contains(chk))
			System.out.println("String is present");
		else
			System.out.println("String not present");

		//6.Convert int,char,boolean to string
		int a=5;
		String str1=" ";
		str=Integer.toString(a);
		System.out.println(str1);

		char ch1='u';
		String stringchar=Character.toString(ch1);
		System.out.println("Conversion of character to string is: " +stringchar);

		boolean value=true;
		String boolval=Boolean.toString(value);
		System.out.println("Conversion of boolean to string is: " +boolval);

		//7. Convert string to array of character
		char[] ch2=str.toCharArray();
		for(int i=0;i<ch2.length;i++)
			System.out.println("Data at ["+i+"]="+ch2[i]);

		//8. Find the length of the given string
		System.out.println("The length of the string is:" +str.length());

		//9. Convert all characters to upper case in a given string ( b. lower case )
		System.out.println("Upper case of the given string:"  +str.toUpperCase());
		System.out.println("Upper case of the given string:"  +str.toLowerCase());

		//10. Find the character in a given position in a given string
		System.out.println("Enter the position of the character to be found");
		int pos=sc.nextInt();
		char p=str.charAt(pos);
		System.out.println("Character present at position " + pos + "  is " +p);

	}

}

