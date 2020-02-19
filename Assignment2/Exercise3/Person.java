//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 3
//Date: 2020/02/17

package Exercise3;

public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	private int socialSecurityNumber;
	private String address;
	private String gender;
    private double Weight;
	
    public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		age = 0;
	}
    
    public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
    public void setSocialSecurityNumber(int socialSecurityNumber)
    {
    	this.socialSecurityNumber = socialSecurityNumber;
    }  
    public int getSocialSecurityNumber()
    {
    	return socialSecurityNumber;
    }    
    
    public void setAddress(String address)
    {
    	this.address = address;
    }    
    public String getAddress()
    {
		return address;	
    }
    
    public void setGender(String gender)
    {
    	this.gender = gender;
    }   
    public String getGender()
    {
		return gender;	
    }
    
    public void setWeight(double weight)
    {
    	this.Weight = weight;
    }
    
    public double getWeight()
    {
    	return Weight;
    }
    
    @Override
	public String toString()
	{
    	return String.format(getFirstName() + " " + getLastName() + ", " + getAge() + " years old, "+ "Social Security Number: " +getSocialSecurityNumber()
               +  ", Address: " + getAddress() + ", Gender: " + getGender() + ", Weight: " + getWeight() + " KG.");
	}

	private void introduce() 
	{
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
}
