public class Rectangle extends Shape
{
	double width;
	double length;
	public Rectangle()
	{
	super();
	this.length=1.0;
	this.width=2.0;
	}
	public Rectangle(double width,double lenght)
	{
		super();
		this.length=length;
		this.width=width;
	}
	public Rectangle(double width,double lenght,boolean filled,String color)
	{
		super( color, filled);
		this.length=length;
		this.width=width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getArea()
	{
    return ((width*length));
	}

	public double getPerimeter()
	{
		return ((2*(length+width)));
	}

	public String toString()
	{
		return getColor()+"\t\t"+getFilled()+"\t\t"+getLength()+"\t\t"+getWidth()+"\t\t"+getArea()+"\t\t"+getPerimeter();
	}
}


