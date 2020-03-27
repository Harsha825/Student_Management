package studentManagement;

import java.util.Scanner;

public class studentDatabase 
{
	public static void main(String[] args) 
	{	
		//Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		student[] students = new student[numOfStudents];
		
		//Create n number of new students
		for (int i = 0; i < students.length; i++)
		{
			students[i] = new student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
	}
}
