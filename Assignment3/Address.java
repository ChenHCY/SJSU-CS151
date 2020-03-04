//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;
class Address
{
	private int streetNumber;
	private String streetName;
	private String city;
	private int zipCode;
	private String state;
	
	public Address()
	{
		streetNumber = 0;
		streetName = " ";
		city = " ";
		zipCode = 0;
		state = " ";
	}
	
	public void setStreetNumber(int streetNumber)
	{
		this.streetNumber = streetNumber;
	}
	public int getStreetNumber()
	{
		return streetNumber;
	}
	
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	public String getStreetName()
	{
		return streetName;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
	
	 public void Dispaly() 
	 {
		 System.out.print(getStreetNumber() + " " + getStreetName() + ", " + getCity() + ", " + getZipCode() + ", " + getState() + ". " + "\n");
	 }
}