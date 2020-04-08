//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-3
//Date: 2020/04/05

package Exercise3;

public class Person 
{
	 // class attributes:
    private String firstName;
    private String lastName;
    private int age;
    
    Person(String fn, String ln, int age)
    {
    	 this.firstName = fn;
         this.lastName = ln;
         this.age = age;
    }
    
    // class getters:
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}
    
 // class setters:
    public void setFirstName(String fn){this.firstName = fn;}
    public void setLastName(String ln){this.lastName = ln;}
    public void setAge(int age){this.age = age;}
    
 // class functionality:
    @Override
    public String toString()
    {
    	return this.firstName +" "+ this.lastName+", "+ this.age + " \n";
    }

    public void introduce(){
    	System.out.println(this.toString());
    }
}
