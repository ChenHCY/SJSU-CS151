//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Dog extends Domesticated
{
    private String bark;
    
	public Dog(String name, int age, String species, String bark) 
	{
		super(name, age, species);
		this.bark = bark;
	}
	
	@Override
	public void sound() 
	{
		System.out.print("WANG");
	}
	
	public String getBark()
	{
		return bark;
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Dog[" + getBark() + "]: " + super.toString());
	 }


}
