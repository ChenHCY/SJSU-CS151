//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class Contractor extends Employee
{
	private double hourlyPay;
	private double overTimePay;
	private double totalPay;

	public Contractor(String firstName, String lastName, int age, int socialSecurityNumber) 
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
	
	public void setOverTimePay(double overTimePay)
	{
		this.overTimePay = overTimePay;
	}
	public double getOvertimePay()
	{
		return overTimePay;
	}
	
	public double getTotalPay()
	{
		return totalPay;
	}
	
	public void computePay(int workTime) 
	{
		if(workTime <= 40)
		{
			totalPay = hourlyPay * workTime;
		}
		else
		{
			totalPay = (hourlyPay * 40) + (overTimePay * (workTime - 40));
		}
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() +"[Hourly Paid Contractors]" + "The pay can recived was $" + getTotalPay());
	}
}