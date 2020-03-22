//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-5
//Date: 2020/03/17

package Exercise5;

public class Employee 
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double hourlyPay;
	private double totalPay;
	
	// class constructors:
    Employee(String firstName, String lastName, int employeeId, double hourlyPay)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.hourlyPay = hourlyPay;
    }
 
    // class setters:
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}
    public void setHourlyPay(double hourlyPay) {this.hourlyPay = hourlyPay;}
   
    // class getters:
    public String getFirstName(){return firstName;}
    public String getLastName(){return this.lastName;}
    public int getEmployeeId(){return this.employeeId;}
    public double getHourlyPay() {return this.hourlyPay;} 
    
    static int performDivision(int x)
    {
    	int result = x - 0;
		return result;
    }
    
    
    public double computepay(int unitsWorked) throws TooManyHoursWorkedException
    {
    	if (unitsWorked < 0)
    	{
    		throw new NumberFormatException("NumberFormatException occured.");
    	} else if (unitsWorked > 40){
    		throw new TooManyHoursWorkedException("TooManyHoursWorkedException occured.\n The workTime was over 40 hours.");
    	} else {
    		totalPay = hourlyPay * unitsWorked;  // hourly pay times number of hours worked
    	}	
    	return totalPay;
    }
    
 // class functionality:
    @Override
    public String toString()
    {
    	return getFirstName() + " " + getLastName() + "; The Employee ID: " + this.employeeId + ", The houlry pay = $" + this.hourlyPay + "/hr," 
               + " And can recived $" + this.totalPay + " for one month.";
    	
    }

    public void introduce(){
    	System.out.println(this.toString());
    }
}
