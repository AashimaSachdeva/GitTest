class Rectangle extends Shape
{
	double width;
	double length;

	Rectangle()
	{
		super();
		this.length=1.0;
		this.width=1.0;
	}

	Rectangle(double width,double length)
	{
		super();
		this.length=length;
		this.width=width;
	}

	Rectangle(double width,double length,boolean filled,String color)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
	}

	void setWidth(double width)
	{
		this.width = width;
	}

	double getWidth()
	{
		return width;
	}

	void setLength(double length)
	{
		this.length = length;
	}

	double getLength()
	{
		return length;
	}

	double getArea()
	{
    return ((width*length));
	}

	double getPerimeter()
	{
		return ((2*(length+width)));
	}

	public String toString()
	{
		return getValueColor()+"\t\t"+getValueFilled()+"\t\t"+getLength()+"\t\t"+getWidth()+"\t\t"+getArea()+"\t\t"+getPerimeter();
	}
}
