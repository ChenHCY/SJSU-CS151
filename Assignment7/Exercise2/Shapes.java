//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-2
//Date: 2020/04/20

package Exercise2;

import java.util.ArrayList;

public class Shapes extends Thread
{
	private ArrayList<Shape> shapeList;
	
	// constructor
	Shapes()
	{
		shapeList = new ArrayList<Shape>();
	}
	
	public void setStringList(ArrayList<Shape> shapeList)
	{
	    this.shapeList = shapeList;
	}
	//the shapeList getter
	public ArrayList<Shape> getShapeList() 
	{
	    return shapeList;
	}
	
	//the add and the remove
	public void add(Shape a)
	{
	    shapeList.add(a);
	}
	public void remove(Shape r)
	{
	    shapeList.remove(r);
	}
	//the Max area part
	public Shape max()
	{
		Shape largest = null;
		for(Shape shape: shapeList) 
		{
			if (largest == null || shape.computeArea() > largest.computeArea())
			{
				largest = shape;
			}
		}	
		return largest;
	}
	// the Min area part
	public Shape min()
	{
		Shape smallest = null;
		for(Shape shape: shapeList) 
		{
			if (smallest == null || shape.computeArea() < smallest.computeArea())
			{
				smallest = shape;
			}
		}	
		 return smallest;
	}
	
	@Override
    public String toString ()
    {
		String result = "";
    	for(Shape s: this.shapeList)
    	{
    		result = result + s.toString() + "\n";
    	}
    	return result;
    }
	
	public synchronized void compute()
	{
		System.out.println("Areas of the shapes in the list:");
		for (Shape s : shapeList)
		{
			System.out.println("The Area is: " + s.computeArea());
		}
	}
}
