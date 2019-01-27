public class Circle extends Shape
{
	protected double radius;
	public Circle()
	{
	super();
	this.radius=2.0;
	}

	public Circle(double radius)
	{
	super();
	this.radius=radius;
	}

	public Circle(double radius,String color,boolean filled)
	{
	super(color,filled);
	this.radius=2.0;
	}
    public void setRadius(double radius)
    {
    	this.radius=radius;

	}
      public double getRadius()
       {
	   return radius;
      }

       public double getArea()
      {
      return(3.14*radius*radius);
      }
      public double getPerimeter()
      {
      	return(2*3.14*radius);
      }
      public String toString()
      {
      	return getColor()+"\t"+getFilled()+"\t"+radius+"\t"+getArea()+"\t"+getPerimeter();

      }
}