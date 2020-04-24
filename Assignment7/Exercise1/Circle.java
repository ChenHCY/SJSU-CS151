//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class Circle implements Shape
{
	private double radius;
	
	public Circle(double radius) 
	{
        this.radius = radius;
    }

	//the getter and setter
	public double getRadius() {return radius;}
	public void setRadius(double radius) { this.radius = radius;}
	 
	@Override
	public Double computeArea() 
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString()
	{
		return String.format("[Cricle] with The Radius: " + radius + "\n");
	}

}