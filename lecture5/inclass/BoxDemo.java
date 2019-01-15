
	/* Author : Aashima
Version : 1.0.0
Purpose : to create another class used to print the dimensions and volume of the box*/


class BoxDemo
{
	public static void main(String args[])
{
//  parameterised constructors
	Box a = new Box();
	Box b = new Box(1,2,3);
	Box c = new Box(1,3);
	double vol=a.volume();
	System.out.println(vol);
	vol = b.volume();
	System.out.println(vol);
	vol = c.volume();
	System.out.println(vol);

	}
}