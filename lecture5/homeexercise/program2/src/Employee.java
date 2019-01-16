/* Author : Aashima
Version : 1.0.0
Purpose : Repeating question 3 of in-class practice questions with Address defined as
 a separate class and used in Employee. Address class should include the following
 instance variables: First Line and Second Line and Pin code. Constructor and other member function 
 definitions of class Employee should be modified accordingly.*/


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