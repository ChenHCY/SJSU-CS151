//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Whale extends Animal
{

	public Whale(String name, int age) 
	{
		super(name, age);
	}

	@Override
	public void move() 
	{
		System.out.print("They swimming.");
	}

	@Override
	public void sound() 
	{
		System.out.print("Their sounds are very high.");
	}

	@Override
	public void eat() 
	{
		System.out.print("They eat fish.");
	}

	@Override
	public void sleep() 
	{
		System.out.print("They sleep 7 hours one day.");
	}

	 @Override
	 public String toString() 
	 {
		 return String.format("Recoon[Swim]: " + super.toString()); 
	 }
}
