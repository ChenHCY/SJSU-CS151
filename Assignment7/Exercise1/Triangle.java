//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class Triangle implements Shape
{
	public double base;
	public double height;
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	//the setter
	public void setBase(double base) {this.base = base;}
	public void setHeight(double height) {this.height = height;}
		
	//the getter
	public double getBase() {return base;}
	public double getHeight() {return height;}

	@Override
	public Double computeArea() 
	{
		return 0.5 * base * height;
	}
	
	@Override
	public String toString()
	{
		return String.format("[Triangle] with The Base is " + base + " And The Height: " + height + "\n");
	}
}
