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
		Shape shape = new Shape();
		//1. Triangle
		shape.add(new Triangle(4.5,4));
		shape.add(new Triangle(3,5.5));
		
		//2. Circle
		shape.add (new Circle(5));
		shape.add (new Circle(3.5));
		
		//3. Rectangle
		shape.add (new Rectangle(5, 7));
		shape.add (new Rectangle(3.5, 8.5));
		
		//4. Hexagon
		shape.add (new Hexagon(8));
		shape.add (new Hexagon(5.5));
		shape.add (new Hexagon(4));
		shape.remove (7);
		
		int i = 1;
		for(Shape s : shapeList)
    	{
    		System.out.print(i + ". "); 
    		i++;
    		s.compute();
    	}
	}
}
