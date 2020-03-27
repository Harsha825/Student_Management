package studentManagement;

import java.util.Scanner;

public class student 
{
	
	private String firstName;
	private String lastName;
	private String courses = "";
	private String studentID;
	
	private int year;
	
	private int tuitionBalance = 0;
	private static int costofCourse = 600;
	private static int id = 1000;
	
	//constructor for name and year of student
	public student() 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3- Junior\n4 - Senior\nEnter student grad year: ");
		this.year = in.nextInt();
		setStudentID();
	}
	
	//generate id
	private void setStudentID()
	{
		//year + ID
		id++;
		this.studentID =  year + "" + id;
	}
	
	//enroll in classes
	public void enroll() 
	{
		//create a loop, user hits 0 when done enrolling
		do 
		{
		System.out.print("Enter a course to entroll, press Q to quit: ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q"))
			{
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costofCourse;
			}
		else 
			{
				break;
			}
		}
		while(true);
	}
	
	//view balance
	public void viewBalance() 
	{
		System.out.println("Your Balance is: $" + tuitionBalance);
	}
	//pay tuition
	public void payTuition()
	{
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//show status
	public String toString()
	{
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + year + 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
