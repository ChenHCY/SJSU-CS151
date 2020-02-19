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
		Dog A1 = new Dog("Snooby", 12, "Domesticated");
		Cat A2 = new Cat("Gary", 7, "Domesticated");
		Racoon A3 = new Racoon("Berry", 6, "Domesticated");
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
	    A1.brak();
	    A1.swim();
	    A1.sleep();
	    A1.eat();
	    A1.greetHuman();
	    A1.sound();
	    System.out.print("\n");
	    
	    A2.setGender("Fmale");
	    A2.setHome("Zoo");
	    A2.setSpeed("8m/s");
	    A2.setType("Mammals");
	    System.out.print("2. " + A2.toString());
	    A2.scratch();
	    A2.swim();
	    A2.sleep();
	    A2.eat();
	    A2.sound();
	    A2.greetHuman();
	    System.out.print("\n");
	    
	    A3.setGender("Male");
	    A3.setHome("forest");
	    A3.setSpeed("13m/s");
	    A3.setType("Mammals");
	    System.out.print("3. " + A3.toString());
	    A3.scratch();
	    A3.sleep();
	    A3.eat();
	    A3.sound();
	    A3.greetHuman();
	    System.out.print("\n");
	    
	    A4.setGender("male");
	    A4.setHome("Ocean");
	    A4.setSpeed("16m/s");
	    A4.setType("Mammals");
	    System.out.print("4. " + A4.toString());	    
	    A4.move();
	    A4.sound();
	    A4.sleep();
	    A4.eat();
	    
	}

}
