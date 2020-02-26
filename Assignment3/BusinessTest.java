//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 3
//Date: 2020/02/25

//Lab Description: Design and implement a class hierarchy representing individuals involved in a business.
package Exercise1;

public class BusinessTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("*****Lab Description: Design and implement a class hierarchy representing individuals involved in a business***** \n");
		System.out.print("**[A. The Company Executive list]:** \n");
		System.out.print("\n");
		Executive EX1 = new Executive("Bob", "Jim", 18, 1001);	
		EX1.setCity("San Jose");
		EX1.setState("CA");
		EX1.setStreetName("S 11st street");
		EX1.setZipCode(98119);
		EX1.setStreetNumber(89);
		EX1.setEmployeeId("EX-01");
		EX1.setlevelOfEducation("Master");
		EX1.setspecoalAccomo("NO");
		EX1.setYearlyBonus(8000);
		EX1.setYearlySalary(380000);
		EX1.computePay();
		System.out.print("1. ");
		EX1.introduce();
		System.out.print("\n");
		
		Executive EX2 = new Executive("Sam", "Time", 26, 1002);	
		EX2.setCity("San Jose");
		EX2.setState("CA");
		EX2.setStreetName("N 68st street");
		EX2.setZipCode(92269);
		EX2.setStreetNumber(669);
		EX2.setEmployeeId("EX-02");
		EX2.setlevelOfEducation("Master");
		EX2.setspecoalAccomo("NO");
		EX2.setYearlyBonus(5000);
		EX2.setYearlySalary(520000);
		EX2.computePay();
		System.out.print("2. ");
		EX2.introduce();
		System.out.print("\n");
		
		System.out.print("**[B. The Company Full-time Salaried Employees list]:** \n");
		System.out.print("\n");
		FullTimeSalaryEmployee FS1 = new FullTimeSalaryEmployee("Kit", "Amy", 24, 2001);
		FS1.setCity("San, Jose");
		FS1.setState("CA");
		FS1.setStreetName("W 16th strret");
		FS1.setStreetNumber(669);
		FS1.setZipCode(96335);
		FS1.setEmployeeId("FS-2001");
		FS1.setlevelOfEducation("Undergraduate Degree");
		FS1.setspecoalAccomo("Yes");
		FS1.setYearlySalary(30000);
		FS1.setYearlyBonus(2000);
		FS1.computePay(4);
		System.out.print("1. ");
		FS1.introduce();
		System.out.print("\n");
		
		FullTimeSalaryEmployee FS2 = new FullTimeSalaryEmployee("Him", "Lmy", 28, 2002);
		FS2.setCity("San, Cruz");
		FS2.setState("CA");
		FS2.setStreetName("E 169th strret");
		FS2.setStreetNumber(42);
		FS2.setZipCode(94561);
		FS2.setEmployeeId("FS-2002");
		FS2.setlevelOfEducation("Undergraduate Degree");
		FS2.setspecoalAccomo("NO");
		FS2.setYearlySalary(45000);
		FS2.setYearlyBonus(2000);
		FS2.computePay(3);
		System.out.print("2. ");
		FS2.introduce();
		System.out.print("\n");
		
		System.out.print("**[C. The Company Full-time Hourly Employees list]:** \n");
		System.out.print("\n");
		FullTimeHourlyEmployee FH1 = new FullTimeHourlyEmployee("Lk", "Bit", 19, 3001);
		FH1.setCity("San Jose");
		FH1.setState("CA");
		FH1.setStreetName("Willmams Street");
		FH1.setStreetNumber(779);
		FH1.setZipCode(96654);
		FH1.setEmployeeId("FH-3001");
		FH1.setlevelOfEducation("Undergraduate Degree");
		FH1.setspecoalAccomo("NO");
		FH1.setHourlyPay(100);
		FH1.setOverTimePay(200);
		FH1.computePay(43);
		System.out.print("1. ");
		FH1.introduce();
		System.out.print("\n");
		
		FullTimeHourlyEmployee FH2 = new FullTimeHourlyEmployee("Ak", "Jit", 21, 3002);
		FH2.setCity("San Jose");
		FH2.setState("CA");
		FH2.setStreetName("Willmams Street");
		FH2.setStreetNumber(779);
		FH2.setZipCode(96654);
		FH2.setEmployeeId("FH-3002");
		FH2.setlevelOfEducation("Undergraduate Degree");
		FH2.setspecoalAccomo("NO");
		FH2.setHourlyPay(100);
		FH2.setOverTimePay(200);
		FH2.computePay(38);
		System.out.print("2. ");
		FH2.introduce();
		System.out.print("\n");
		
		System.out.print("**[D. The Company Part-time Hourly Employees list]:** \n");
		System.out.print("\n");
		PartTimeHourlyEmployee PH1 = new PartTimeHourlyEmployee("Kitch", "Aml", 18, 4001);
		PH1.setCity("San jose");
		PH1.setState("CA");
		PH1.setStreetName("Jim Street");
		PH1.setStreetNumber(66);
		PH1.setZipCode(96334);
		PH1.setlevelOfEducation("Master");
		PH1.setspecoalAccomo("NO");
		PH1.setHourlyPay(60);
		PH1.computePay(30);
		System.out.print("1. ");
		PH1.introduce();
		System.out.print("\n");
		
		PartTimeHourlyEmployee PH2 = new PartTimeHourlyEmployee("Kim", "Boy", 19, 4002);
		PH2.setCity("San jose");
		PH2.setState("CA");
		PH2.setStreetName("Amy Street");
		PH2.setStreetNumber(696);
		PH2.setZipCode(96465);
		PH2.setlevelOfEducation("Master");
		PH2.setspecoalAccomo("NO");
		PH2.setHourlyPay(60);
		PH2.computePay(30);
		System.out.print("2. ");
		PH2.introduce();
		System.out.print("\n");
		
		System.out.print("**[E. The Company Hourly Paid Contractors list]:** \n");
		System.out.print("\n");
		Contractor C1 = new Contractor("Ace", "EL", 27, 5001);
		C1.setCity("San Jose");
		C1.setState("CA");
		C1.setStreetNumber(556);
		C1.setStreetName("S 28th Street");
		C1.setZipCode(96348);
		C1.setEmployeeId("CO-5001");
		C1.setlevelOfEducation("Undergraduate Degree");
		C1.setspecoalAccomo("NO");
		C1.setHourlyPay(180.5);
		C1.setOverTimePay(400);
		C1.computePay(40);
		System.out.print("1. ");
		C1.introduce();
		System.out.print("\n");

		Contractor C2 = new Contractor("Aty", "Jack", 24, 5002);
		C2.setCity("San Jose");
		C2.setState("CA");
		C2.setStreetNumber(556);
		C2.setStreetName("W 18th Street");
		C2.setZipCode(96987);
		C2.setEmployeeId("CO-5002");
		C2.setlevelOfEducation("Undergraduate Degree");
		C2.setspecoalAccomo("NO");
		C2.setHourlyPay(150.5);
		C2.setOverTimePay(300);
		C2.computePay(42);
		System.out.print("2. ");
		C2.introduce();
		System.out.print("\n");
		
		System.out.print("**[F. The Company Customers/Clients list]:** \n");
		System.out.print("\n");
		Customer CU1 = new Customer("Cat", "AP", 34, 6001);
		CU1.setCity("LA");
		CU1.setState("CA");
		CU1.setStreetName("Josh Street");
		CU1.setStreetNumber(447);
		CU1.setZipCode(50063);
		CU1.setCustomerId("CU-6001");
		CU1.setDirectDeposit("YES");
		CU1.setlevelOfEducation("Master");
		CU1.setPaymentMethod("Credit Card");
		CU1.setPreferredMethod("Credit Card");
		CU1.setspecoalAccomo("NO");
		CU1.makePayment();
		System.out.print("1. ");
		CU1.introduce();
		System.out.print("\n");
		
		Customer CU2 = new Customer("Frank", "Keeny", 29, 6002);
		CU2.setCity("San Jose");
		CU2.setState("CA");
		CU2.setStreetName("E 19th Street");
		CU2.setStreetNumber(112);
		CU2.setZipCode(92663);
		CU2.setCustomerId("CU-6002");
		CU2.setDirectDeposit("NO");
		CU2.setlevelOfEducation("Undergraduate Degree");
		CU2.setPaymentMethod("Cash");
		CU2.setPreferredMethod("Cash Check");
		CU2.setspecoalAccomo("NO");
		CU2.makePayment();
		System.out.print("2. ");
		CU2.introduce();
		System.out.print("\n");		
	}

}
