//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

public class Racoon extends Domesticated
{
    private String scratch;
    
	public Racoon(String name, int age, String species, String scratch) 
	{
		super(name, age, species);
		this.scratch = scratch;
	}

	@Override
	public void sound() 
	{
		System.out.print("MOW");
	}

	public String getScratch()
	{
		return scratch;
	}
	
	 @Override
	 public String toString()
	 {
		 return String.format("Recoon[" + getScratch() + "]: " + super.toString());
	 }

}
