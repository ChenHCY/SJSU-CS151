//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-2
//Date: 2020/03/17

package Exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput 
{
	public static void main(String[] args) 
	{
		File myFile = null;
		FileReader myFileReader = null;
		String input = " ";
		
		try {
			myFile = new File("quote.txt");
			myFileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(myFileReader);
			
			System.out.print("The Sentence from the txt file was:\n");
			 while ((input = reader.readLine()) != null) 
			 {
				 System.out.println(input);
			 }
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
