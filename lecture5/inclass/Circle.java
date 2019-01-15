class Circle
{
	double radius;
	double findArea()
	{
		return radius *radius*3.14158;
	}
	
	void displayArea()
	{
		System.out.print("area="+findArea());
	}
}