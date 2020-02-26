//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class FullTimeSalaryEmployee extends Employee
{
	private int yearlySalary;
	private int yearlyBonus;
	private double totalPay;

	
	public FullTimeSalaryEmployee(String firstName, String lastName, int age, int socialSecurityNumber) 
	{
		super(firstName, lastName, age, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	public void setYearlySalary(int yearlySalary)
	{
		this.yearlySalary = yearlySalary;
	}
	
	public int getYearlySalary()
	{
		return yearlySalary;
	}
	
	public void setYearlyBonus(int yearlyBonus)
	{
		this.yearlyBonus = yearlySalary;
	}
	
	public int getYearlyBonus()
	{
		return yearlyBonus;
	}
	
	public double getTotalPay()
	{
		return totalPay;
	}
	
	public void computePay(int workTime) 
	{
		totalPay = (yearlySalary / 52) * workTime + yearlyBonus;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "[Full-time Salaried Employees]" +"The pay can recived was $" + getTotalPay());
	}
	
}
