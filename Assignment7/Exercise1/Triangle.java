//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class Triangle extends Shape
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
	
	public double computeArea() 
	{
		return 0.5 * base * height;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "Triangle " +"The Base: " + base + " The Height: " + height + "\n" 
				                + "[The Shape Area]: "  + computeArea() + "\n");
	}
}
