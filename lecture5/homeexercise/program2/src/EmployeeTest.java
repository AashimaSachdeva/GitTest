import java.util.*;
class EmployeeAddressTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		Employee e1 = new Employee();
		double ySalary = e1.calcYearlySalary();
		System.out.println("Yearly Salary (befor raise):"+ySalary);
		e1.displayInfo();

		System.out.println("Enter the details of employee");
		String fName = scan.nextLine();
		String lName = scan.nextLine();
		double mSalary = scan.nextDouble();
		Employee e2 = new Employee(fName,lName,mSalary);
		ySalary = e2.calcYearlySalary();
		System.out.println("Yearly Salary (befor raise):"+ySalary);
		e2.displayInfo();

		System.out.println("Enter the address of employee");
		String fLine = scan.nextLine();
		String sLine = scan.nextLine();
		int pCode = scan.nextInt();
		Address a1 = new Address(fLine,sLine,pCode);
		a1.display();


	}
}