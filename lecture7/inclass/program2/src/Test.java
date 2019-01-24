import java.util.*;
public class Test
{
	public static void main(String args[])
	{
	int choice;
	System.out.print("enter 2 for bike and 4 for car");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 2:
	Bike b=new Bike();
	b.display();
	break;
	//we can use car or vehicle but not bike since car extende vehicle but not bike and c is pointing towards object of class car
	case 4:
	Vehicle c=new Car();
	c.display();
	break;
	default:
	Vehicle v=new Vehicle();
	v.display();

	}
	}
}