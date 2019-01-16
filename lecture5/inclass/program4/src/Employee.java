/* Author : Aashima
Version : 1.0.0
Purpose :3.	Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, ask the user to re-enter a positive value. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/


class Employee
{
	String firstName;
	String lastName;
	double monthlySalary;
	Employee()
	{
		firstName="Aashima";
		lastName="Sachdeva";
		monthlySalary=100;
	}
	Employee(String fName, String lName, double mSalary)
	{
		firstName=fName;
		lastName=lName;
		monthlySalary=mSalary;
	}
	double calcYearlySalary()
	{
		return (12*this.monthlySalary);
	}
	double calcRaise()
	{
		return (1.10*this.calcYearlySalary());
	}
	void displayInfo()
	{
		System.out.println("Employee details:\n"+this.firstName+" "+this.lastName+"\nYearly Salary (after raise):"+this.calcRaise());
	}
}