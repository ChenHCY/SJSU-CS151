//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-1
//Date: 2020/04/05
package Exercise1;

public class Tester extends ListManipulator
{
	public static void main(String[] args) 
	{
		int array[] = {1, 2, 7, 3, 5, 9, 10, 25, 28, 34, 40, 6, 19, 40, 11, 1}; // The basic arrayList

		// 1. print out the ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending)
		functionSort(array); 
		System.out.print("\n");
		
		// 2. print out the ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
		functionSwap(array);
		System.out.print("\n");
		
		// 3. print out the void table(ArrayList<Integer> myLst)
		voidTable(array);
	}

}
