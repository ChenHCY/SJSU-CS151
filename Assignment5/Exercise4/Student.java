//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-4
//Date: 2020/03/17
package Exercise4;

public class Student 
{
	private String firstName;
	 private String lastName;
	 private int age;
	 private Double gpa;
	 private String major;
	 private String department;
	 private Course cs151;
	 private Course cs147;
	 private Course engl1A;
	 private Course anth25;
	 
	 Student(String fn, String ln, int age, Double gpa, String major, String department)
	 {
	        this.firstName = fn;
	        this.lastName = ln;
	        this.age = age;
	        this.gpa = gpa;
	        this.major = major;
	        this.department = department;

	        // this assignment does not specify how the courses are set for a student;
	        // while hard-coding courses inside the Student constructor is not generally a good idea,
	        // the point of this exercise is for you to use a local inner class, so I will accept this as a solution;
	        // also, would be better implemented with a collection but we have not covered those in class yet;
	        // while courses is not declared as a static attribute, instantiating it to hard-coded values here in the 
	        // constructor has the same effect, as each instance of Student will have the same courses:
	        this.cs151 = new Course("CS 151","T/TH","6-7:15pm", "Object-Oriented Design for Java", "Computer Science Department");
	        this.cs147 = new Course("CS 147","M/W","10:30-11:45pm", "Computer Architecture", "Computer Science Department");
	        this.engl1A = new Course("ENGL 1A","W/F","10-11:15am", "First-Year Writing in College", "English Department");
	        this.anth25 = new Course("ANTH 25","M","8:11am", "Human life Context", "Department of Anthropology");
	    }
	 
	// class getters:
	    public String getFirstName(){return this.firstName;}
	    public String getLastName(){return this.lastName;}
	    public int getAge(){return this.age;}
	    public Double getGPA(){return this.gpa;}
	    public String getMajor(){return this.major;}
	    public String getDepartment(){return this.department;}
	    
	    // class setters:
	    public void setFirstName(String fn){this.firstName = fn;}
	    public void setLastName(String ln){this.lastName = ln;}
	    public void setAge(int age){this.age = age;}
	    public void setGPA(Double gpa){this.gpa = gpa;}
	    public void setMajor(String major){this.major = major;}
	    public void setDepartment(String department){this.department = department;}
	    
	 // class functionality:
	    public void printInfo()
	    {
	    	System.out.println(getFirstName() + " " + getLastName() + ", " + getAge() + " years old." + " [Student GPA]: "+ getGPA() + "\n" 
	    	                      +"Student Major: "+ getMajor() + ", Student Department: " + getDepartment() + "\n");
	        System.out.print("1. "); 
	        cs151.printSchedule();
	        System.out.print("2. ");
	        cs147.printSchedule();
	        System.out.print("3. ");
	        engl1A.printSchedule();
	        System.out.print("4. ");
	        anth25.printSchedule();
	    }
}
