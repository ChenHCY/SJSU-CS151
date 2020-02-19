//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 4
//Date: 2020/02/18

package Exercise4;

public class Product 
{
	private String name;
	private double price;
	private String description;
	private int maxQuantity;
	
	public Product(String name, double price, String description, int maxQuantity) 
	{
		this.name = name;
		this.price = price;
		this.description = description;
		this.maxQuantity = maxQuantity;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public int getQuantity() 
	{
		return maxQuantity;
	}
	
	public void setQuantity(int maxQuantity) 
	{
		this.maxQuantity = maxQuantity;
	}
	
	@Override
	public String toString()
	{
		return getName() + "                " + getPrice() + "              " + getDescription() + "              " + getQuantity();
	}
}
