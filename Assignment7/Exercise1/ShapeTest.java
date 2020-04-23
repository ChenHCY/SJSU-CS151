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
		Shapes shapes = new Shapes();
		//1. Triangle
		shapes.add(new Triangle(4.5,4));
		shapes.add(new Triangle(3,5.5));
		
		//2. Circle
		shapes.add (new Circle(5));
		shapes.add (new Circle(3.5));
		
		//3. Rectangle
		shapes.add (new Rectangle(5, 7));
		shapes.add (new Rectangle(3.5, 8.5));
		
		//4. Hexagon
		shapes.add (new Hexagon(8));
		shapes.add (new Hexagon(5.5));
		shapes.add (new Hexagon(4));
		shapes.remove (7);
		
	/*	int i = 1;
		for(Shape s : shapeList)
    	{
    		System.out.print(i + ". "); 
    		i++;
    		s.compute();
    	}
	}*/
	
	new Thread() {
   	public void run() {
	      shapes.compute();
	   }
	}.start()
	
	new Thread() {
   	public void run() {
	      shapes.compute();
	   }
	}.start()
}
