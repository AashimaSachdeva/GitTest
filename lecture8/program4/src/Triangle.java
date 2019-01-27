class Triangle extends Shape
{
	Triangle()
	{
	super();
	this.length=1.0;
	this.breadth=2.0;
	}
	double displayArea()
	{
	return(0.5*length*breadth);
	}
}