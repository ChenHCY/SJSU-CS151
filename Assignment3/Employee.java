//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class Employee extends Person
{
	private String employeeId;

	public Employee(String firstName, String lastName, int age, int socialSecurityNumber) 
	{
		super(firstName, lastName, age, socialSecurityNumber);
		setEmployeeId(employeeId);
	}
	
	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId; 
	}
	
	public String getEmployeeId()
	{
		return employeeId;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "[Employee ID Number]: " + getEmployeeId() + "\n");
	}
}
