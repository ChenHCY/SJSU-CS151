//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Cat extends Domesticated
{
	public Cat(String name, int age, String species) 
	{
		super(name, age, species);
	}

	public void Scratch()
	{
		System.out.print("They can scratch others\n");
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Cat[move]: " + super.toString());
	 }

}
