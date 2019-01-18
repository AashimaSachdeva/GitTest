/* Author : Aashima
Version : 1.0.0
Purpose :	Write a program to calculate the distance between two points (x1, y1) and (x2, y2). 
All numbers and return values should be of type double*/

class Point
{
	private float x;
	private float y;
	
	Point()
	{
	this.x=0;
	this.y=0;
	}

	Point(float x,float y)
	{
	this.x=x;
	this.y=y;
	}
	void setValuex(float x)
	{
	this.x=x;
	}
	void setValuey(float y)
	{
	this.y=y;
	}
	float getValuex()
	{
	return x;
	}
	float getValuey()
	{
	return y;
	}
	float calculateDistance(Point p2)
	{
	float dist = (float) Math.sqrt(Math.pow((getValuex()-p2.getValuex()),2)+Math.pow((getValuey()+p2.getValuey()),2));
	return dist;
	}

	}