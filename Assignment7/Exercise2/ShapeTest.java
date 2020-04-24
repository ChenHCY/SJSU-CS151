//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-2
//Date: 2020/04/20

package Exercise2;

public class ShapeTest 
{
	public static void main(String[] args) 
	{
		System.out.println("HW7 Exercise2: Make a call to both max() and min() methods for the Shape arryList.");
		System.out.println();
		
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
		shapes.remove (new Hexagon(4));
		
		System.out.println("#### The details of the shape with largest area are: " + shapes.max().computeArea() + " from the " 
								+shapes.max().toString());
		
		System.out.println("#### The details of the shape with smallest area are: " + shapes.min().computeArea() + " from the"
								+ shapes.min().toString());
		
		new Thread() {
		public void run() {
		      shapes.compute();
		   }
		}.start();

		new Thread() {
		public void run() {
		      shapes.compute();
		   }
		}.start();	
	}
}