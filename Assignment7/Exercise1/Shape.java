//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

import java.util.ArrayList;

public abstract class Shapes 
{
	private ArrayList<Shape> shapeList;
	
	// constructor
	Shapes()
	{
		shapeList = new ArrayList<Shape>();
	}

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
	
	//the add and the remove
	public void add(Shape a)
    	{
    	    shapeList.add(a);
    	}
    	public void remove(Shape r)
    	{
    	   shapeList.remove(r);
    	}

    @Override
    public String toString ()
    {
    	return String.format("[Shape Name]: ");	
    }
    
    public void compute()
    {
    	//System.out.println(toString());
	for(...){
		s.computeArea();
	}
    }
}
