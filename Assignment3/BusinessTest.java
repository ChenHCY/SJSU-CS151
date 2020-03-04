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
		System.out.print("**[A. The Company Executive list]:***************************************** \n");
		System.out.print("\n");
			
		Address E1 = new Address();
		Executive EX1 = new Executive("Bob", "Jim", 18, 1001);
		E1.setCity("San Jose");
		E1.setState("CA");
		E1.setStreetName("S 11st street");
		E1.setZipCode(98119);
		E1.setStreetNumber(89);
		EX1.setEmployeeId("EX-01");
		EX1.setlevelOfEducation("Master");
		EX1.setspecoalAccomo("NO");
		EX1.setYearlyBonus(8000);
		EX1.setYearlySalary(380000);
		EX1.computePay();
		System.out.print("1. ");
		EX1.introduce();
		System.out.print("[Address]: ");
		E1.Dispaly();
		System.out.print("\n");
		
		Address E2 = new Address();
		Executive EX2 = new Executive("Sam", "Time", 26, 1002);	
		E2.setCity("San Jose");
		E2.setState("CA");
		E2.setStreetName("N 68st street");
		E2.setZipCode(92269);
		E2.setStreetNumber(669);
		EX2.setEmployeeId("EX-02");
		EX2.setlevelOfEducation("Master");
		EX2.setspecoalAccomo("NO");
		EX2.setYearlyBonus(5000);
		EX2.setYearlySalary(520000);
		EX2.computePay();
		System.out.print("2. ");
		EX2.introduce();
		System.out.print("[Address]: ");
		E2.Dispaly();
		System.out.print("\n");
				
		System.out.print("**[B. The Company Full-time Salaried Employees list]:***************************************** \n");
		System.out.print("\n");
		Address F1 = new Address();
		FullTimeSalaryEmployee FS1 = new FullTimeSalaryEmployee("Kit", "Amy", 24, 2001);
		F1.setCity("San, Jose");
		F1.setState("CA");
		F1.setStreetName("W 16th strret");
		F1.setStreetNumber(669);
		F1.setZipCode(96335);
		FS1.setEmployeeId("FS-2001");
		FS1.setlevelOfEducation("Undergraduate Degree");
		FS1.setspecoalAccomo("Yes");
		FS1.setYearlySalary(30000);
		FS1.setYearlyBonus(2000);
		FS1.computePay(4);
		System.out.print("1. ");
		FS1.introduce();
		System.out.print("[Address]: ");
		F1.Dispaly();
		System.out.print("\n");
		
		Address F2 = new Address();
		FullTimeSalaryEmployee FS2 = new FullTimeSalaryEmployee("Him", "Lmy", 28, 2002);
		F2.setCity("San, Cruz");
		F2.setState("CA");
		F2.setStreetName("E 169th strret");
		F2.setStreetNumber(42);
		F2.setZipCode(94561);
		FS2.setEmployeeId("FS-2002");
		FS2.setlevelOfEducation("Undergraduate Degree");
		FS2.setspecoalAccomo("NO");
		FS2.setYearlySalary(45000);
		FS2.setYearlyBonus(2000);
		FS2.computePay(3);
		System.out.print("2. ");
		FS2.introduce();
		System.out.print("[Address]: ");
		F2.Dispaly();
		System.out.print("\n");
		
		System.out.print("**[C. The Company Full-time Hourly Employees list]:***************************************** \n");
		System.out.print("\n");
		Address H1 = new Address();
		FullTimeHourlyEmployee FH1 = new FullTimeHourlyEmployee("Lk", "Bit", 19, 3001);
		H1.setCity("San Jose");
		H1.setState("CA");
		H1.setStreetName("Willmams Street");
		H1.setStreetNumber(779);
		H1.setZipCode(96654);
		FH1.setEmployeeId("FH-3001");
		FH1.setlevelOfEducation("Undergraduate Degree");
		FH1.setspecoalAccomo("NO");
		FH1.setHourlyPay(100);
		FH1.setOverTimePay(200);
		FH1.computePay(43);
		System.out.print("1. ");
		FH1.introduce();
		System.out.print("[Address]: ");
		H1.Dispaly();
		System.out.print("\n");
		
		Address H2 = new Address();
		FullTimeHourlyEmployee FH2 = new FullTimeHourlyEmployee("Ak", "Jit", 21, 3002);
		H2.setCity("San Jose");
		H2.setState("CA");
		H2.setStreetName("Willmams Street");
		H2.setStreetNumber(779);
		H2.setZipCode(96654);
		FH2.setEmployeeId("FH-3002");
		FH2.setlevelOfEducation("Undergraduate Degree");
		FH2.setspecoalAccomo("NO");
		FH2.setHourlyPay(100);
		FH2.setOverTimePay(200);
		FH2.computePay(38);
		System.out.print("2. ");
		FH2.introduce();
		System.out.print("[Address]: ");
		H1.Dispaly();
		System.out.print("\n");
		
		System.out.print("**[D. The Company Part-time Hourly Employees list]:***************************************** \n");
		System.out.print("\n");
		Address P1 = new Address();
		PartTimeHourlyEmployee PH1 = new PartTimeHourlyEmployee("Kitch", "Aml", 18, 4001);
		P1.setCity("San jose");
		P1.setState("CA");
		P1.setStreetName("Jim Street");
		P1.setStreetNumber(66);
		P1.setZipCode(96334);
		PH1.setlevelOfEducation("Master");
		PH1.setspecoalAccomo("NO");
		PH1.setHourlyPay(60);
		PH1.computePay(30);
		System.out.print("1. ");
		PH1.introduce();
		System.out.print("[Address]: ");
		P1.Dispaly();
		System.out.print("\n");
		
		Address P2 = new Address();
		PartTimeHourlyEmployee PH2 = new PartTimeHourlyEmployee("Kim", "Boy", 19, 4002);
		P2.setCity("San jose");
		P2.setState("CA");
		P2.setStreetName("Amy Street");
		P2.setStreetNumber(696);
		P2.setZipCode(96465);
		PH2.setlevelOfEducation("Master");
		PH2.setspecoalAccomo("NO");
		PH2.setHourlyPay(60);
		PH2.computePay(30);
		System.out.print("2. ");
		PH2.introduce();
		System.out.print("[Address]: ");
		P2.Dispaly();
		System.out.print("\n");
		
		System.out.print("**[E. The Company Hourly Paid Contractors list]:***************************************** \n");
		System.out.print("\n");
		Address c1 = new Address();
		Contractor C1 = new Contractor("Ace", "EL", 27, 5001);
		c1.setCity("San Jose");
		c1.setState("CA");
		c1.setStreetNumber(556);
		c1.setStreetName("S 28th Street");
		c1.setZipCode(96348);
		C1.setEmployeeId("CO-5001");
		C1.setlevelOfEducation("Undergraduate Degree");
		C1.setspecoalAccomo("NO");
		C1.setHourlyPay(180.5);
		C1.setOverTimePay(400);
		C1.computePay(40);
		System.out.print("1. ");
		C1.introduce();
		System.out.print("[Address]: ");
		c1.Dispaly();
		System.out.print("\n");

		Address c2 = new Address();
		Contractor C2 = new Contractor("Aty", "Jack", 24, 5002);
		c2.setCity("San Jose");
		c2.setState("CA");
		c2.setStreetNumber(556);
		c2.setStreetName("W 18th Street");
		c2.setZipCode(96987);
		C2.setEmployeeId("CO-5002");
		C2.setlevelOfEducation("Undergraduate Degree");
		C2.setspecoalAccomo("NO");
		C2.setHourlyPay(150.5);
		C2.setOverTimePay(300);
		C2.computePay(42);
		System.out.print("2. ");
		C2.introduce();
		System.out.print("[Address]: ");
		c2.Dispaly();
		System.out.print("\n");
		
		System.out.print("**[F. The Company Customers/Clients list]:***************************************** \n");
		System.out.print("\n");
		Address U1 = new Address();
		Customer CU1 = new Customer("Cat", "AP", 34, 6001);
		U1.setCity("LA");
		U1.setState("CA");
		U1.setStreetName("Josh Street");
		U1.setStreetNumber(447);
		U1.setZipCode(50063);
		CU1.setCustomerId("CU-6001");
		CU1.setDirectDeposit("YES");
		CU1.setlevelOfEducation("Master");
		CU1.setPaymentMethod("Credit Card");
		CU1.setPreferredMethod("Credit Card");
		CU1.setspecoalAccomo("NO");
		CU1.makePayment();
		System.out.print("1. ");
		CU1.introduce();
		System.out.print("[Address]: ");
		U1.Dispaly();
		System.out.print("\n");
		
		Address U2 = new Address();
		Customer CU2 = new Customer("Frank", "Keeny", 29, 6002);
		U2.setCity("San Jose");
		U2.setState("CA");
		U2.setStreetName("E 19th Street");
		U2.setStreetNumber(112);
		U2.setZipCode(92663);
		CU2.setCustomerId("CU-6002");
		CU2.setDirectDeposit("NO");
		CU2.setlevelOfEducation("Undergraduate Degree");
		CU2.setPaymentMethod("Cash");
		CU2.setPreferredMethod("Cash Check");
		CU2.setspecoalAccomo("NO");
		CU2.makePayment();
		System.out.print("2. ");
		CU2.introduce();
		System.out.print("[Address]: ");
		U1.Dispaly();
		System.out.print("\n");	
	}

}
