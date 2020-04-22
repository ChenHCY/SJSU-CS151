//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class Hexagon extends Shape
{
	private double sides;
	
	public Hexagon(double sides) 
	{
        this.sides = sides;
    }

	//the getter and setter
	public double Sides() {return sides;}
	public void setSides(double sides) { this.sides = sides;}

	public double computeArea() 
	{
		return (6*(sides * sides)) / (4 * Math.tan(Math.PI / 6));
	}

	@Override
	public String toString()
	{
		return String.format(super.toString() + "Hexagon " + "The Sides: " + sides + "\n" 
				                + "[The Shape Area]: "  + computeArea() + "\n");
	}

}
