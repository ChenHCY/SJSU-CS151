//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-2
//Date: 2020/04/20

package Exercise2;

public class Hexagon implements Shape
{
	private double sides;
	
	public Hexagon(double sides) 
	{
        this.sides = sides;
    }

	//the getter and setter
	public double Sides() {return sides;}
	public void setSides(double sides) { this.sides = sides;}

	@Override
	public Double computeArea() 
	{
		return (6*(sides * sides)) / (4 * Math.tan(Math.PI / 6));
	}

	@Override
	public String toString()
	{
		return String.format("[Hexagon] with The Side is " + sides + "\n" );
	}

}