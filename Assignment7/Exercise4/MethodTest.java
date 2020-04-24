//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 7 Exercise-4
//Date: 2020/04/20

package Exercise4;

import java.util.ArrayList;

public class MethodTest 
{
	public static < T > int count(ArrayList< T > myList)
	{
		return(myList.size());
	}

	public static void main(String[] args) 
	{ 
		System.out.println("HW7 Exercise4: Implement a generic method called count() to count the number of elements in a list of generic elements.");
		System.out.println();
		
		//the 5 String elements
		ArrayList <String> array1 = new ArrayList<>();
		array1.add("BOB");
		array1.add("Jime");
		array1.add("Alex");
		array1.add("Tian");
		array1.add("Kiin");
		
		//the 6 integer elements
		ArrayList <Integer> array2 = new ArrayList<>();
		array2.add(8);
		array2.add(9);
		array2.add(8);
		array2.add(18);
		array2.add(5);
		array2.add(11);
		
		//the 8 double elements
		ArrayList <Double> array3 = new ArrayList<>();
		array3.add(8.9);
		array3.add(9.7);
		array3.add(18.4);
		array3.add(11.54);
		array3.add(5.25);
		array3.add(14.36);
		array3.add(15.25);
		array3.add(24.36);
		
		
		System.out.println("1. the number elements of String arrayList was " + count(array1));
		System.out.println();
		
		System.out.println("2. the number elements of Integer arrayList was " + count(array2));
		System.out.println();
		
		System.out.println("3. the number elements of Double arrayList was " + count(array3));
		System.out.println();
		
	}	
}
