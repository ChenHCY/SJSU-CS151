//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 2 - Exercise 4
//Date: 2020/02/18

package Exercise4;

public class ProductTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product product1 = new Product("Ball-1", 10.5, "Soccerball", 103);
		product1.setName("Ball-1");
		product1.setPrice(10.5);
		product1.setQuantity(103);
		product1.setDescription("Soccerball");
		
		Product product2 = new Product("Ball-2", 10.5, "Basketball", 156);
		product2.setName("Ball-2");
		product2.setPrice(20.5);
		product2.setQuantity(156);
		product2.setDescription("Basketball");
		
		Product product3 = new Product("Ball-3", 10.5, "Volleyball", 203);
		product3.setName("Ball-3");
		product3.setPrice(45.5);
		product3.setQuantity(203);
		product3.setDescription("Volleyball");
		
		System.out.format("\n%-20s%-20s%-24s%-20s\n", "The product name", "Product price", "Product description", "Maximum quantity");
		System.out.print ("=======================================================================================================\n");
		System.out.print(product1.toString());
		System.out.print("\n");
		System.out.print(product2.toString());
		System.out.print("\n");
		System.out.print(product3.toString());
	}

}
