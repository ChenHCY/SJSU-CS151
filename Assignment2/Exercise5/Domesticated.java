//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Domesticated extends Animal
{
	private String species;

	public Domesticated(String name, int age, String species) 
	{
		super(name, age);
		this.species = species;
	}

	public void walk()
	{
		System.out.print("They can use 2 legs walk on the land.");
	}
	
	public void greetHuman()
	{
		System.out.print("They can play with human.");
	}
	
	public void swim()
	{
		System.out.print("Some of them can swimming in the water.");
	}
	
	@Override
	public void move() 
	{
		System.out.print("They used 4 legs to move.");
	}

	@Override
	public void sound() 
	{
	}

	@Override
	public void eat() 
	{
		System.out.print("Human give them food eat.");
	}

	@Override
	public void sleep() 
	{
		System.out.print("They everday sleep lots of time.");
	}
	
	@Override
	public String toString() 
	{
		return String.format("Domesticated [soecies = " + this.species + "], " + super.toString());
	}
	

}
