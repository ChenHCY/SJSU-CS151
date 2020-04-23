//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-3
//Date: 2020/04/20

package Exercise3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest extends Shape
{
	public static void main(String[] args) throws IOException 
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
		
		for(int i = 1; i <= shapeList.size(); i++){
			try{
				FileOutputStream fs = new FileOutputStream("obj"+i+".ser");  
				ObjectOutputStream os = new ObjectOutputStream(fs);  
				os.writeObject(shapeList.indexOf(i)); 
				fs.close();
				os.close();
			}catch(IOException e){
				System.out.println(e);
			}
		
		int i = 1;
		for(Shape s : shapeList)
    	{
    		System.out.print(i + ". "); 
    		i++;
    		s.compute();
    	}
	}
}

