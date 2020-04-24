//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-3
//Date: 2020/04/20

package Exercise3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest
{
	public static void main(String[] args)  throws IOException 
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
		shapes.remove (new Hexagon(4));
		
		for(int i = 1; i <= shapes.getShapeList().size(); i++)
		{
			try{
				FileOutputStream fs = new FileOutputStream("obj"+i+".ser");  
				ObjectOutputStream os = new ObjectOutputStream(fs);  
				os.writeObject(shapes.getShapeList().indexOf(i)); 
				fs.close();
				os.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}
		
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