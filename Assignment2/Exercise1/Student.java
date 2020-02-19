//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 1
//Date: 2020/02/17

package Exercise1;

public class Student 
{
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;

	
	public Student(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		age = 0;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void printSchedule()
	{
		System.out.println(getFirstName() + " " + getLastName() + ", " + getAge() + " years old, "+ getGpa() + " gpa, " 
	                             + getMajor() + " major, " + getDepartment() + " department.");
		System.out.println();		
	}
}
