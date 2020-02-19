//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 1
//Date: 2020/02/17

package Exercise1;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student student = new Student("John", "Smith", 20);
		
		student.setGpa(3.6);
		student.setMajor("Computer Science");
		student.setDepartment("School of Computer Science");

		student.printSchedule();
	}

}
