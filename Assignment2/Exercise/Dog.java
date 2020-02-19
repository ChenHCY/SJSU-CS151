//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Dog extends Domesticated
{
    
	public Dog(String name, int age, String species) 
	{
		super(name, age, species);
	}
	
	public void brak()
	{
		System.out.print("Their bark is WANG\n");
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Dog[move]: " + super.toString());
	 }


}
