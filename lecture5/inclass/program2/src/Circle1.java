/* Author : Aashima
Version : 1.0.0
Purpose :Create a class Circle with instance variable radius and member functions:
a)	area( ) b) circumference( ) c) display( ). Write a test application 
named CircleTest that demonstrates class Circle’s capabilities. */
class Circle1
{
	
	double radius;

	Circle1() //non parameterized constructor
	{
		radius=1;
	}
	Circle1(int radius)
	{
		this.radius=radius;
	}

	double findArea()
	{
		return radius *radius*3.14158;
	}
	
	 double findCircumference()
    {
    	return 2*3.14158*radius;
    }
    void display()
	{
		System.out.print("area="+findArea());
		System.out.print("circumference="+findCircumference());
	}
}

