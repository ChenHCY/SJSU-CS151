//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class PartTimeHourlyEmployee extends Employee
{
	private double hourlyPay;
	private double totalPay;

	public PartTimeHourlyEmployee(String firstName, String lastName, int age, int socialSecurityNumber) 
	{
		super(firstName, lastName, age, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public void setHourlyPay(double hourlyPay)
	{
		this.hourlyPay = hourlyPay;
	}

	public double getHourlyPay()
	{
		return hourlyPay;
	}
	
	public double getTotalPay()
	{
		return totalPay;
	}
	
	public Double computePay(int workTime) 
	{
		if (workTime <= 40)
		{
			totalPay = (hourlyPay * workTime);
			return totalPay;
		}
		else
		{
			return (double) -1;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "[Part-time Hourly Employees, ]" + "The pay can recived was $" + getTotalPay());
	}

}
