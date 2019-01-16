import java.util.*;
public class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();
		Employee employees[]=new Employee[num];//declaring array
		int counter;     
		for (counter=0;counter<num;counter++)
		{
			employees[counter] = new Employee();
			System.out.print("Enter the name of Employee:");
			employees[counter].name = scan.nextLine();
			scan.nextLine();
			System.out.println("Enter the Year of Joining:");
			employees[counter].yearOfJoining = scan.nextInt();
			System.out.println("Enter the address of Employee:");
			scan.nextLine();
			employees[counter].address = scan.nextLine();
		}
		System.out.println("Name\t\tYear\t\tAddress");
		for (counter=0;counter<num;counter++)
		{
			employees[counter].displayInfo();
		}
	}
}