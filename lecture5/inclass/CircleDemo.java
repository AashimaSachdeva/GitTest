import java.util.*;
class CircleDemo
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		c.radius=2;
		c.displayArea();
		System.out.print("enter radius");
		Circle c1= new Circle();
		Scanner sc=new Scanner(System.in);
		c1.radius= sc.nextDouble();
	    System.out.print("area with user entered radius"+c1.radius);                                                                                                     
		
	}
}