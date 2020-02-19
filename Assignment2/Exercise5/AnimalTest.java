//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 5
//Date: 2020/02/18

package Exercise5;

import java.util.ArrayList;

public class AnimalTest 
{
	public static void main(String[] args) 
	{
		Dog A1 = new Dog("Snooby", 12, "Domesticated", "bark");
		Cat A2 = new Cat("Gary", 7, "Domesticated", "scratch");
		Racoon A3 = new Racoon("Berry", 6, "Domesticated", "scratch");
		Whale  A4 = new Whale("TT", 15);

	    ArrayList<Animal> arl = new ArrayList<Animal>();
	    arl.add(A1);
	    arl.add(A2);
	    arl.add(A3);
	    arl.add(A4);
	    
	    A1.setGender("Male");
	    A1.setHome("Zoo");
	    A1.setSpeed("10m/s");
	    A1.setType("Mammals");
	    System.out.print("1. " + A1.toString());
	    System.out.print("\n");
	    
	    A2.setGender("Fmale");
	    A2.setHome("Zoo");
	    A2.setSpeed("8m/s");
	    A2.setType("Mammals");
	    System.out.print("2. " + A2.toString());
	    System.out.print("\n");
	    
	    A3.setGender("Male");
	    A3.setHome("forest");
	    A3.setSpeed("13m/s");
	    A3.setType("Mammals");
	    System.out.print("3. " + A3.toString());
	    System.out.print("\n");
	    
	    A4.setGender("male");
	    A4.setHome("Ocean");
	    A4.setSpeed("16m/s");
	    A4.setType("Mammals");
	    System.out.print("4. " + A4.toString());
	    
	}

}
