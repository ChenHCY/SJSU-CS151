//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-5
//Date: 2020/03/17

package Exercise5;

public class EmployeeTest 
{
	public static void main(String[] args) throws TooManyHoursWorkedException 
	{
		Employee e1 = new Employee("Joe", "Smith", 101, 35);
		
		System.out.print("1. When the employee worked 40 hours: \n");
		e1.computepay(40);
		e1.introduce();
		System.out.println();
		
		System.out.print("2. When the employee worked 23 hours: \n");
		e1.computepay(23);
		e1.introduce();
		System.out.println();
		
		System.out.print("3. When the employee worked 1 hours: \n");
		e1.computepay(1);
		e1.introduce();
		System.out.println();
		
		System.out.print("4. When the employee worked 0 hours: \n");
		e1.computepay(0);
		e1.introduce();
		System.out.println();
		
		System.out.print("5. When the employee worked -5 hours: \n");
		e1.computepay(-5);
		e1.introduce();
		System.out.println();
		
		System.out.print("6. When the employee worked 45 hours: \n");
		e1.computepay(45);
		e1.introduce();
	}

}
