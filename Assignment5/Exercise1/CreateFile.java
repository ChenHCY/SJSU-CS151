//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-1
//Date: 2020/03/17
package Exercise1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFile 
{
	public static void main(String[] args) throws IOException 
	{
		boolean enter = true;
		File myNewFile = null;
		FileWriter myFileWriter = null;
		
		String A = " ";
		System.out.print("Please Enter your line and Enter '@q' was quit: ");
		while (enter){
			try{
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				//create a new file and output text to it:
				myNewFile = new File("command_line_input.txt");
				myFileWriter = new FileWriter(myNewFile, true);
				BufferedWriter bf = new BufferedWriter(myFileWriter);
			
				A = reader.readLine();
				if (A.equals("@q"))
				{
					enter = false;
					bf.close();
					break;
				}
				else
				{
					bf.write(A + "\n");
					bf.close();
				}			
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
  }
}
