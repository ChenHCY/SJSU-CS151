//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class Executive extends Employee
{
	//For an executive, the pay is simply their yearly compensation plus the yearly bonus.
	private int yearlySalary;
	private int yearlyBonus;
	private double totalPay;

	public Executive(String firstName, String lastName, int age, int socialSecurityNumber) 
	{
		super(firstName, lastName, age, socialSecurityNumber);
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
		this.yearlyBonus = yearlyBonus;
	}
	
	public int getYearlyBonus()
	{
		return yearlyBonus;
	}
	
	public double getTotalPay()
	{
		return totalPay;
	}
	
	public void computePay() 
	{
		totalPay = yearlySalary + yearlyBonus;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "[Executive]" + "The pay can recived was $" + this.totalPay);
	}
	
}
