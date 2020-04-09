//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-2
//Date: 2020/04/05
package Exercise2;

import java.util.LinkedList;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		Course cs151 = new Course("CS 151","T/TH","6-7:15pm", "Object-Oriented Design for Java", "Computer Science Department");
		Course cs147 = new Course("CS 147","M/W","10:30-11:45pm", "Computer Architecture", "Computer Science Department");
		Course engl1A = new Course("ENGL 1A","W/F","10-11:15am", "First-Year Writing in College", "English Department");
		Course anth25 = new Course("ANTH 25","M","8:11am", "Human life Context", "Department of Anthropology");
		
		// Course Name "ascending"
		System.out.print("[A]. Student Information with Course Name (ascending): \n");
		Student student1 = new Student("John", "Smith", 20, 3.6, "computer Science", "School of Computer Science");
		student1.addCourse(cs151);
		student1.addCourse(cs147);
		student1.addCourse(engl1A);
		student1.addCourse(anth25);
		student1.removeCourse(cs147);
		
		student1.printInfo();
		student1.sortCourse("ascending");
		System.out.println(); 
		
		//Course Name "descending"
		System.out.print("[B]. Student Information with Course Name (descending): \n");
		Student student2 = new Student("Bob", "Joy", 21, 3.7, "computer Science", "School of Computer Science");
		student2.addCourse(cs151);
		student2.addCourse(cs147);
		student2.addCourse(engl1A);
		student2.addCourse(anth25);
		
		student2.printInfo();
		student2.sortCourse("descending");

	}

}
