//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class Person
{
	private String firstName;
	private String lastName;
	private int age;
	private int socialSecurityNumber;
	private Address address;
	private String levelOfEducation;
	private String specoalAccomo; //needs special accommodations or not
	
	public Person()
	{
		address = new Address();
	}
	
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
	 
	 public Address getAddress() 
	 {
		return address;
	 }
	 
	 public void setAddress(Address address) 
	 {
		 this.address = address;
	 }

	 @Override
	 public String toString() 
	 {
		 return String.format(getFirstName() + " " + getLastName() + ": " + getAge() + " years old, "+ "[The Social Security Number]: " +getSocialSecurityNumber()
         + "\n" + "[Level of education]: " + getlevelOfEducation() + ", [Did needs special accommodations (Yes or not)]: " + getspecoalAccomo() +  "\n");
	 }
	 
	 void introduce() 
	 {
		 // TODO Auto-generated method stub
		 System.out.println(this.toString());
	 }	
}
