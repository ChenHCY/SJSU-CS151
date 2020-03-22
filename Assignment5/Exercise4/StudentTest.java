//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-4
//Date: 2020/03/17
package Exercise4;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student("John", "Smith", 20, 3.6, "computer Science", "School of Computer Science");
		Student student2 = new Student("Bob", "Joy", 21, 3.7, "computer Science", "School of Computer Science");

		student1.printInfo();
		System.out.print("\n");
		student2.printInfo();
	}
}
