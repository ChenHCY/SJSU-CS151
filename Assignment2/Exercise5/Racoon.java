//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Racoon extends Domesticated
{
	public Racoon(String name, int age, String species) 
	{
		super(name, age, species);
	}

	@Override
	public void sound() 
	{
		System.out.print("The sounds was MOW/n");
	}

	public void scratch()
	{
		System.out.print("They can scratch others\n");
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Recoon[move]: " + super.toString());
	 }

}
