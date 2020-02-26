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
	
	 @Override
	 public String toString() 
	 {
		return String.format(getStreetNumber() + " " + getStreetName() + ", " + getCity() + ", " + getZipCode() + ", " + getState() + ". ");
	 }
}

public abstract class Person extends Address
{
	private String firstName;
	private String lastName;
	private int age;
	private int socialSecurityNumber;
	private Address address;
	private String levelOfEducation;
	private String specoalAccomo; //needs special accommodations or not
	
	public Person(String firstName, String lastName, int age, int socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		age = 0;
		this.socialSecurityNumber = socialSecurityNumber;
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
	
	public int getSocialSecurityNumber()
    {
    	return socialSecurityNumber;
    }    
	
	 public void setlevelOfEducation(String levelOfEducation)
	 {
		 this.levelOfEducation = levelOfEducation;
	 }
	 public String getlevelOfEducation()
	 {
		 return levelOfEducation;
	 }
	 
	 public void setspecoalAccomo(String specoalAccomo)
	 {
		 this.specoalAccomo = specoalAccomo;
	 }
	 public String getspecoalAccomo()
	 {
		 return specoalAccomo;
	 }
	 
	 public String getAddress() 
	 {
		return super.toString();
	 }
	 
	 public void setAddress(Address address) 
	 {
		this.address = address;
	 }	 

	 @Override
	 public String toString() 
	 {
		 return String.format(getFirstName() + " " + getLastName() + ": " + getAge() + " years old, "+ "[The Social Security Number]: " +getSocialSecurityNumber()
         +  ", [Address]: " + getAddress() + "\n" + "[Level of education]: " + getlevelOfEducation() + ", [Did needs special accommodations (Yes or not)]: " + getspecoalAccomo() + "\n");
	 }
	 
	 void introduce() 
	 {
		 // TODO Auto-generated method stub
		 System.out.println(this.toString());
	 }	
}
