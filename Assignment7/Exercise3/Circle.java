//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-3
//Date: 2020/04/20

package Exercise3;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius) 
	{
        this.radius = radius;
    }

	//the getter and setter
	public double getRadius() {return radius;}
	public void setRadius(double radius) { this.radius = radius;}
	 
	public double computeArea() 
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString()
	{
		return String.format(super.toString() + "Cricle " + "The Radius: " + radius + "\n" 
				                + "[The Shape Area]: "  + computeArea() + "\n");
	}

}
