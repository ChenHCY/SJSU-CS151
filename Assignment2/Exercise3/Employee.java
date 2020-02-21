//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 3
//Date: 2020/02/17

package Exercise3;

public class Employee extends Person
{
	private int employeeId; //employee id
	private String employeeStatus; //employee status (contractor, full time, part-time)
	private String startDate;
	private int totalPay;
	private int personalPay;
	private int workTime;
	private String time;
	private String pay;

	public Employee(String firstName, String lastName, int age) 
	{
		super(firstName, lastName, age);
		setEmployeeStatus(employeeStatus);
		setEmployeeId(employeeId);
		setStartDate(startDate);
	}

	public void setEmployeeStatus(String employeeStatus) 
	{
		this.employeeStatus = employeeStatus;
	}
    public String getEmployeeStatus()
    {
    	return employeeStatus;
    }
	
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
	public String getStartDate()
	{
		return startDate;
	}
	
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}
	public int getEmployeeId()
	{
		return employeeId;	
	}
	
	public void setPersonalPay(int personalPay)
	{
		this.personalPay = personalPay;
	}
	
	public int getPersonalPay()
	{
		return personalPay;
	}
	
	public int getTotalPay()
	{
		return totalPay;
	}
	
	public void setWorkTime(int workTime)
	{
		this.workTime = workTime;
	}
	public int getWorkTime()
	{
		return workTime;
	}
	
	public void calculatePay(int personalPay, int workTime)
	{
		if(this.employeeStatus == "a full-time employee")
		{
			totalPay = personalPay / 52 * workTime;
			pay = getPersonalPay() + "/yr";
			time =  getWorkTime() +" Weeks";
		}

		if(this.employeeStatus == "a part-time employee" || this.employeeStatus == "a contracor employee")
		{
			totalPay = personalPay * workTime;
			pay = getPersonalPay() + "/hr,";
			time = getWorkTime() + " Hours";
		}
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + " Employee ID: " + getEmployeeId() +" Person is " + this.getEmployeeStatus() + ", \n")
	                 + String.format("the pay is $" + this.pay + " should get paid or working " + this.time + ", And can recived " + getTotalPay() + ".\n");	
	}
}
