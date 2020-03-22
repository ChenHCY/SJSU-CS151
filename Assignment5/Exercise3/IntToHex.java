//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-3
//Date: 2020/03/17

package Exercise3;

import java.util.Scanner;

public class IntToHex 
{
	public static void main(String[] args) 
	{
		 System.out.print("CS-151 Homework 5 Exercise-3.\n");
		 Scanner number = new Scanner(System.in);
		 System.out.print("Please enter an integer value: ");
		 int integerValue = number.nextInt();
		 
		// Used the method toHexString()
		String hexadecimalNumber = Integer.toHexString(integerValue);
		System.out.println("[The an integer value was " + integerValue + "] and changed to hexadecimal number was: " + hexadecimalNumber);
	}

}
