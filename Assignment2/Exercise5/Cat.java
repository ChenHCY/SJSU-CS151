//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Cat extends Domesticated
{
    private String scratch;
    
	public Cat(String name, int age, String species, String scratch) 
	{
		super(name, age, species);
		this.scratch = scratch;
	}

	@Override
	public void sound() 
	{
		System.out.print("MEOW");
	}

	public String getScratch()
	{
		return scratch;
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Cat[" + getScratch() + "]: " + super.toString());
	 }

}
