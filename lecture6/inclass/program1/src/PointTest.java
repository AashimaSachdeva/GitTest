import java.util.*;
class PointTest
{
	public static void main(String args[])
	{
	float x1,y1;
	float x2,y2;
	float dist;

	Scanner scan=new Scanner(System.in);
	System.out.print("enter value of x1");
	x1=scan.nextFloat();

	System.out.print("enter value of x2");
	x2=scan.nextFloat();

	System.out.print("enter value of y1");
	y1=scan.nextFloat();

	System.out.print("enter value of y2");
	y2=scan.nextFloat();
	

	Point p1 = new Point();
	p1.setValuex(x1);
	p1.setValuex(y1);

	Point p2 = new Point();
	p2.setValuex(x2);
	p2.setValuex(y2);

	dist = p1.calculateDistance(p2);
	System.out.println("The distance between the two points is: "+String.format("%7.2f",dist));
	}
}
