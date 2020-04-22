//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-1
//Date: 2020/04/20

package Exercise1;

public class ShapeTest extends Shape
{
	public static void main(String[] args) 
	{
		//1. Triangle
		shapeList.add(new Triangle(4.5,4));
		shapeList.add(new Triangle(3,5.5));
		
		//2. Circle
		shapeList.add (new Circle(5));
		shapeList.add (new Circle(3.5));
		
		//3. Rectangle
		shapeList.add (new Rectangle(5, 7));
		shapeList.add (new Rectangle(3.5, 8.5));
		
		//4. Hexagon
		shapeList.add (new Hexagon(8));
		shapeList.add (new Hexagon(5.5));
		shapeList.add (new Hexagon(4));
		shapeList.remove (7);
		
		int i = 1;
		for(Shape s : shapeList)
    	{
    		System.out.print(i + ". "); 
    		i++;
    		s.compute();
    	}
	}
}
