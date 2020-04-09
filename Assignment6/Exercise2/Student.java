//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-2
//Date: 2020/04/05
package Exercise2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student 
{
	private String firstName;
	private String lastName;
	private int age;
	private Double gpa;
	private String major;
	private String department;
	private String sorting;
	private LinkedList<Course> courses;
	
	Student(String fn, String ln, int age, Double gpa, String major, String department)
	 {
	        this.firstName = fn;
	        this.lastName = ln;
	        this.age = age;
	        this.gpa = gpa;
	        this.major = major;
	        this.department = department;
	        
	        Comparator<Course> CoursesComparator = new Comparator<Course>() 
	        {
	        	@Override
	        	public int compare(Course c1, Course c2) 
	        	{
	        		return c1.getCourseName().compareTo(c2.getCourseName());
	        	}
	        };
	        
	        this.courses = new LinkedList<Course>();
	 }
	
	// class getters:
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}
    public Double getGPA(){return this.gpa;}
    public String getMajor(){return this.major;}
    public String getDepartment(){return this.department;}
    public String getSorting(){return this.sorting;}
    
    // class setters:
    public void setFirstName(String fn){this.firstName = fn;}
    public void setLastName(String ln){this.lastName = ln;}
    public void setAge(int age){this.age = age;}
    public void setGPA(Double gpa){this.gpa = gpa;}
    public void setMajor(String major){this.major = major;}
    public void setDepartment(String department){this.department = department;}
    public void setSorting(String sorting){this.sorting = sorting;}
    
    public void addCourse(Course a)
    {
    	this.courses.add(a);
    }
    
    public void removeCourse(Course r)
    {
    	this.courses.remove(r);
    }
    
    public void printInfo()
    {
    	System.out.println(getFirstName() + " " + getLastName() + ", " + getAge() + " years old." + " [Student GPA]: "+ getGPA() + "\n" 
    	                      +"Student Major: "+ getMajor() + ", Student Department: " + getDepartment() + "\n");
    }
    
    public void sortCourse(String sorting) 
    {
    	if(sorting.equals("ascending"))
    	{
    		Collections.sort(this.courses);
    	}
    	else if(sorting.equals("descending"))
    	{
    		Collections.sort(this.courses);
    		Collections.reverse(this.courses);		
    	}
    	
    	int i = 1;
    	for(Course c : this.courses)
    	{
    		System.out.print(i + ". "); 
    		i++;
    		c.printSchedule();
    	}
    }
}
