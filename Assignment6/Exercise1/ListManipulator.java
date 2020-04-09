//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-1
//Date: 2020/04/05

package Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class ListManipulator 
{
	//1. ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending)
	public static void functionSort(int arr[])
	{
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) 
            sortList.add(new Integer(arr[i]));
		
		System.out.print("------1. After Sorting the arrayList was:-------- \n");
		Collections.sort(sortList);// Collection and sort the arrayList
        System.out.print(sortList + "\n"); 
	}
	
	//2. ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	public static void functionSwap(int arr[])
	{
		ArrayList<Integer> swapLargestSmallest = new ArrayList<Integer>();
		int minIndex = 0, maxIndex = 0;
		 
		 for (int i = 0; i < arr.length; i++) 
		 {
			 swapLargestSmallest.add(new Integer(arr[i]));
	     }
	 
		 for (int i = 1; i < swapLargestSmallest.size(); ++i) 
		 {
		        if (arr[i] < arr[minIndex])
		            minIndex = i;
		        if (arr[i] > arr[maxIndex])
		            maxIndex = i;
		 }
		 System.out.print("2. Max Number: " + arr[maxIndex] + ", Min Number: " + arr[minIndex] + ". After Swap the Largest Smallest was: \n");
		 
		 Collections.swap(swapLargestSmallest, maxIndex, minIndex);
		 System.out.print(swapLargestSmallest + "\n"); 
	}
	
	//3. void table(ArrayList<Integer> myLst)
	public static void table(int arr[])
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		TreeMap<Integer, Integer> occurs = new TreeMap<Integer, Integer>();		
		
		 for (int i = 0; i < arr.length; i++) 
		 {
			 myList.add(new Integer(arr[i]));
	     }
	 
		for (Integer i : myList) 
		{ 
            Integer j = occurs.get(i); 
            occurs.put(i, (j == null) ? 1 : j + 1); 
        } 
		
		//sort elements value
		TreeMap<Integer, Integer> sortOccurs = new TreeMap<Integer, Integer>();
		sortOccurs.putAll(occurs);
		
		System.out.println("------3. The arrayList void table was: --------");
		// displaying the occurrence of elements in the arrayList 
        for (Integer val : sortOccurs.keySet()) 
        { 
            System.out.println("Element " + val + " "  + "occurs: " + sortOccurs.get(val) + " times"); 
        }
    } 
}
