//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 3
//Date: 2020/02/17

package Exercise3;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee A1 = new Employee("John", "Smith", 26);
		A1.setEmployeeStatus("a contracor employee");
		A1.setSocialSecurityNumber(10001);
		A1.setStartDate("2001/02/03");
		A1.setAddress("South 1st ST");
		A1.setGender("Male");
		A1.setWeight(102.5);
		A1.setWorkTime(30);
		A1.setPersonalPay(60);
		A1.calculatePay(60, 30);
		A1.setEmployeeId(101);
		System.out.print("1. " + A1.toString());
		System.out.print("\n");
		
		Employee A2 = new Employee("Lisa", "Gray", 36);
		A2.setEmployeeStatus("a full-time employee");
		A2.setSocialSecurityNumber(10002);
		A2.setStartDate("2006/08/03");
		A2.setAddress("South 22nd ST");
		A2.setGender("Fmale");
		A2.setWeight(98.5);
		A2.setWorkTime(2);
		A2.setPersonalPay(110000);
		A2.calculatePay(110000, 2);
		A2.setEmployeeId(102);
		System.out.print("2. " + A2.toString());
		System.out.print("\n");
		
		Employee A3 = new Employee("Timothy", "Briggs", 25);
		A3.setEmployeeStatus("a full-time employee");
		A3.setSocialSecurityNumber(10003);
		A3.setStartDate("2016/08/03");
		A3.setAddress("South 32nd ST");
		A3.setGender("Male");
		A3.setWeight(118.5);
		A3.setWorkTime(4);
		A3.setPersonalPay(80000);
		A3.calculatePay(80000, 4);
		A3.setEmployeeId(103);
		System.out.print("3. " + A3.toString());
		System.out.print("\n");

		Employee A4 = new Employee("George", "Wallace", 24);
		A4.setEmployeeStatus("a part-time employee");
		A4.setSocialSecurityNumber(10004);
		A4.setStartDate("2017/08/03");
		A4.setAddress("South 11st ST");
		A4.setGender("Male");
		A4.setWeight(119.5);
		A4.setWorkTime(25);
		A4.setPersonalPay(20);
		A4.calculatePay(20, 25);
		A4.setEmployeeId(104);
		System.out.print("4. " + A4.toString());
		System.out.print("\n");
		
		Employee A5 = new Employee("Amy", "Student", 29);
		A5.setEmployeeStatus("a contracor employee");
		A5.setSocialSecurityNumber(10005);
		A5.setStartDate("2019/08/03");
		A5.setAddress("South 12nd ST");
		A5.setGender("Male");
		A5.setWeight(149.5);
		A5.setWorkTime(45);
		A5.setPersonalPay(45);
		A5.calculatePay(45, 45);
		A5.setEmployeeId(105);
		System.out.print("5. " + A5.toString());
	}

}
