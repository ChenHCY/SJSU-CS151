//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-4
//Date: 2020/03/17

package Exercise4;

public class Course 
{
	private String courseName;
    private String weekDays;
    private String timeStart;
    private String courseDescription;
    private String department;
    
    public Course(String courseName, String weekDays, String timeStart, String courseDescription, String department)
    {
        this.courseName = courseName;
        this.weekDays = weekDays;
        this.timeStart = timeStart;
        this.courseDescription = courseDescription;
        this.department = department;
    }
    
    // class setters:
    public void setCourseName(String courseName){this.courseName = courseName;}
    public void setWeekDays(String weekDays){this.weekDays = weekDays;}
    public void setTimeStart(String timeStart){this.timeStart = timeStart;}
    public void setCourseDescription(String courseDescription){this.courseDescription = courseDescription;}
    public void setDepartment(String department){this.department = department;} 
    
    // class getters:
    public String getCourseName(){return courseName;}
    public String getWeekDays(){return weekDays;}
    public String getTimeStart(){return timeStart;}
    public String getCourseDescription(){return courseDescription;}
    public String getDepartment(){return department;} 
    
    
    public void printSchedule()
    {
        System.out.println("[Department " + department+ "] "+ this.courseName + " " + this.weekDays + " at " + this.timeStart + ".\n"
        	                 	+"The course Description: " + courseDescription);
    }
    
}
