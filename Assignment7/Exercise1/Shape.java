//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

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

    @Override
    public String toString ()
    {
    	return String.format("[Shape Name]: ");	
    }
    
    public void compute()
    {
    	System.out.println(toString());

    }
}
