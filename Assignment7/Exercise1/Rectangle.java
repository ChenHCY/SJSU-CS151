//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class Rectangle extends Shape
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
	
	public double computeArea()
	{
		return length * width;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "Rectangle " +"The length: " + length + " The width: " + width + "\n" 
				                + "[The Shape Area]: "  + computeArea() + "\n");
	}
	

}
