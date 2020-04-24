//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-3
//Date: 2020/04/20

package Exercise3;

public class Rectangle implements Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	
	//the getters 
	public double getLength() { return length; }
	public double getWidth() { return width;}
	
	//the setter
	public void setLength(double length) { this.length = length; }
	public void setWidth(double width) {this.width = width;}
	
	@Override
	public Double computeArea()
	{
		return length * width;
	}
	
	@Override
	public String toString()
	{
		return String.format("[Rectangle] with The length is " + length + " And The width: " + width + "\n" );
	}
}
