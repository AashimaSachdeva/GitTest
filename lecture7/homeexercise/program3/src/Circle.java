public class Circle extends Shape
{
	double radius;
  public Circle()
	{
		super();
		radius=1.0;
	}

	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}

	public Circle(double radius,boolean filled,String color)
	{
		super(color,filled);
		this.radius=radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{  
	return (3.14*radius*radius);
	}

	public double getPerimeter()
	{
	return (2*3.14*radius);
}

	public String toString()
	{
		return getValueColor()+"\t"+getValueFilled()+"\t"+radius+"\t"+getArea()+"\t"+getPerimeter();
	}
}
