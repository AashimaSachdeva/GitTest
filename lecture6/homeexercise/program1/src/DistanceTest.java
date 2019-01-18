import java.util.*;
class DistanceTest
{
	public static void main(String args[])
	{
	float f1,i1;
	float f2,i2;
	float dist;

	Scanner scan=new Scanner(System.in);
	System.out.print("enter value of f1");
	f1=scan.nextFloat();

	System.out.print("enter value of f2");
	f2=scan.nextFloat();

	System.out.print("enter value of i1");
	i1=scan.nextFloat();

	System.out.print("enter value of i2");
	i2=scan.nextFloat();

	Distance d1 =new Distance(f1,i1);
	Distance d2 = new Distance(f2,i2);
	Distance d = new Distance();
	d.sum(d1,d2);
}
}