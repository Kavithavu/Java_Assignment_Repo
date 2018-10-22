package JavaBasics;

import java.util.Scanner;

public class Student {
	String Name;
	int id;
	int marks;
	
	public static void main(String[] args) {
		Student[] s=new Student[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Students info ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Name");
			s[i].Name="jiji";
			System.out.println("Enter id");
			s[i].id=12;
			System.out.println("Enter Marks");
			s[i].marks=67;
		}
		
		for(Student st:s)
		{
			System.out.println(s);
		}

	}

}
