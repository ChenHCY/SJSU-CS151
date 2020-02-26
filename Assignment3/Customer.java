//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

package Exercise1;

public class Customer extends Person
{
	private String paymentMethod;
	private String directDeposit;
    private String customerId;
    private String preferredMethod;
    private String LikeMethod;
	
	
	public Customer(String firstName, String lastName, int age, int socialSecurityNumber) 
	{
		super(firstName, lastName, age, socialSecurityNumber);
		setPaymentMethod(paymentMethod);
		setDirectDeposit(directDeposit);
	}
	
	public void setPaymentMethod(String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}
	
	public String getPaymentMethod()
	{
		return paymentMethod;
	}
	
	public void setDirectDeposit(String directDeposit) 
	{
		this.directDeposit = directDeposit;
	}
	public String getDirectDeposit()
	{
		return directDeposit;
	}
	
	public void setCustomerId(String customerId)
	{
		 this.customerId = customerId;
    }
	
	public String getCustomerId()
	{
		return customerId;
    }
	
	public void setPreferredMethod(String preferredMethod)
	{
		this.preferredMethod = preferredMethod;
	}
	public String getPreferredMethod()
	{
		return preferredMethod;
	}
	
	public void makePayment()
	{
		LikeMethod = "[The preferred method of payment for the customer was]: " + preferredMethod;
	}
	
	@Override
	public String toString()
	{
		return String.format(super.toString() + "[Customers/Clients ID Number]: " + getCustomerId() + ", [The payment method preference]: " + getPaymentMethod() + "\n" 
		                      + "[Direct deposit or not]: " + getDirectDeposit() + ", " + this.LikeMethod);
	}

}
