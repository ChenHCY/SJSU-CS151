//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-2
//Date: 2020/04/20

package Exercise2;

import java.util.ArrayList;

public abstract class Shape 
{
	static ArrayList<Shape> shapeList = new ArrayList<Shape>();

	//the shapeList setter
	public void setStringList(ArrayList<Shape> shapeList)
	{
	    this.shapeList = shapeList;
	}
	//the shapeList getter
	public ArrayList<Shape> getShapeList() 
	{
	    return shapeList;
	}

	public void max()
	{
		Shape largest = null;
		for(Shape shape: shapeList) 
		{
			if (largest == null || shape.computeArea() > largest.computeArea())
			{
				largest = shape;
			}
		}
		 System.out.println("#### The details of the shape with largest area are :" + largest);		
	}
	
	public void min()
	{
		Shape smallest = null;
		for(Shape shape: shapeList) 
		{
			if (smallest == null || shape.computeArea() < smallest.computeArea())
			{
				smallest = shape;
			}
		}
		 System.out.println("#### The details of the shape with largest area are :" + smallest);		
	}
	
    @Override
    public String toString ()
    {
    	return String.format("[Shape Name]: ");
    }
    
    public abstract double computeArea();
    
    public void compute()
    {
    	System.out.println(toString());

    }
}
