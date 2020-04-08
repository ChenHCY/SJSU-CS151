//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 6 Exercise-3
//Date: 2020/04/05

package Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("Joe", "Smith", 40);
		Person p2 = new Person("Amy", "Gold", 32);
		Person p3 = new Person("Tony", "Stork", 21);
		Person p4 = new Person("Sean", "Irish", 24);
		Person p5 = new Person("Tina", "Brock", 28);
		Person p6 = new Person("Lenny", "Heap", 18);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		System.out.println("----------------------------Before Sorting-----------------------------------------");
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println(); 
		
//1. based on their first name (ascending)
		System.out.println("1. Sorting based on their first name: (ascending)---------------------------------- ");		
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2) 
			{
				int flag1 = o1.getFirstName().compareTo(o2.getFirstName()); // this is ascending
				return flag1;
			}
		});
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println(); 
		
//2. based on their first name (descending)
		System.out.println("2. Sorting based on their first name: (descending)----------------------------------- ");
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2) 
			{		
				int flag2 = o2.getFirstName().compareTo(o1.getFirstName()); // this is descending
				return flag2;
			}
		});
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println(); 
		
//3. based on their first name (ascending)
		System.out.println("3. Sorting based on their age: (ascending)----------------------------------- ");
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2) 
            {
				int age1 = o1.getAge();
				int age2= o2.getAge();
				int n = age1 - age2;
				return n;
            }
		});	
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println(); 
		
//4. based on their first name (descending)
		System.out.println("4. Sorting based on their age: (descending)----------------------------------- ");
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2) 
            {
				int age1 = o1.getAge();
				int age2= o2.getAge();
				int n = age2 - age1;
				return n;
            }
		});	
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println(); 
		
//5. based on the length of their last name (ascending)	
		System.out.println("5. Sorting based on the length of their last name (ascending)----------------------------------- ");
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2)
            {
				 return o1.getLastName().length() < o2.getLastName().length() ? -1 : 1;
            }
		});
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println();
	
//5. based on the length of their last name (descending)
		System.out.println("6. Sorting based on the length of their last name (descending)----------------------------------- ");
		Collections.sort(list, new Comparator<Person>() 
		{
			@Override
            public int compare(Person o1, Person o2)
            {
				 return o1.getLastName().length() > o2.getLastName().length() ? -1 : 1;
            }
		});
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getFirstName() + "," + list.get(i).getLastName() + " " + list.get(i).getAge());
		}
		System.out.println();
	}
}
