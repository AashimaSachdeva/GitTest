/* Author : Aashima
Version : 1.0.0
Purpose : Create a class Employee that includes the following: name, 
year of joining, salary, address. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities by displaying the 
output as follows for:
Name        Year of joining        Address
Ram           1994                64C Vasant Kunj 110070
Sam            2000                68D Dwarka 110037
Ana            1999                26B R.K Puram 110022 */

class Employee
{
	String name;
	String address;
	int yearOfJoining;
	Employee()
	{
		name="Aashima";
		address="Sachdeva";
		yearOfJoining=2018;
	}
	void displayInfo()
	{
		System.out.println(this.name+"\t\t"+this.yearOfJoining+"\t\t"+this.address+"\n");
	}
}