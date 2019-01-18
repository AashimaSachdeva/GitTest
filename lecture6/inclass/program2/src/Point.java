/* Author : Aashima
Version : 1.0.0
Purpose :2.	Write a program to calculate the distance between two points (x1, y1) and (x2, y2). 
All numbers and return values should be of type doublewith a static method definition for calculating the distance between two points.*/
class Point
{
	private static float x;
	private static float y;

	Point()
	{
		this.x=0;
		this.y=0;
	}

	Point (float x,float y)
	{
		this.x=x;
		this.y=y;
	}

	public void setValueX(float x)
	{
		this.x=x;
	}
	public void setValueY(float y)
	{
		this.y=y;
	}
	public static float getValueX()
	{
		return x;
	}

	public static float getValueY()
	{
		return y;
	}

	public static float calcDistance(Point p2)
	{
		float dist = (float) Math.sqrt(Math.pow((getValueX()-p2.getValueX()),2)+Math.pow((getValueY()+p2.getValueY()),2));
		return dist;
	}
}