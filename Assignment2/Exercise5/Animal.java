//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public abstract class Animal 
{
	private String name;
	private String type;
	private int age;
	private String gender;
	private String home;
	private String speed;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int age()
	{
		return age;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}
	
	 public void setGender(String gender)
	 {
		 this.gender = gender;
	 }   
	 public String getGender()
	 {
		 return gender;	
	 }
	 
	 public void setHome(String home)
	 {
		 this.home = home;
	 }
	 public String getHome()
	 {
		 return home;
	 }
	 
	 public void setSpeed(String speed)
	 {
		 this.speed = speed;
	 }
	 public String getSpeed()
	 {
		 return speed;
	 }
	 
	 public abstract void move();
	 
	 public abstract void sound();
	 
	 public abstract void eat();
	 
	 public abstract void sleep();
	 
	 @Override
	 public String toString() 
	 {
		 return String.format("Animal[name = " + this.name + ", Age = " + this.age + ", Type of the animal: " + getType() + "]\n") 
	                + String.format("Gender: " + getGender() + ", Which environment it lives in: " + getHome() + ", Speed: " + getSpeed() + ".\n");
	 }
}
