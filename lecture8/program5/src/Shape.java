 abstract public class Shape
{
	protected String color;
	protected boolean filled;
	public Shape()
	{
	this.color="red";
	this.filled=true;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color)
	{
	this.color=color;
	}
	public void setFilled(boolean filled)
	{
	this.filled=filled;
	}
	public String getColor()
	{
	return color;
	}
	public boolean getFilled()
	{
	return filled;
	}
	 abstract public double getArea();
	 abstract public double getPerimeter();
	abstract public String toString();
}
	


