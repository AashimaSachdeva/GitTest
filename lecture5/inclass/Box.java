/* Author : Aashima
Version : 1.0.0
Purpose : to create class box which contains methods and variables and constructors*/


class Box                                                        
{
	double width;
	double height;
	double depth;
	void setDim(float w,float h,float d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box() //non parameterized constructor
	{
		width=1;
		height=1;
		depth=1;
	}
	Box(double w, double h, double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	Box(double w,double d)
	{
		width=w; 
		height=1;
		depth=d;
	}
	double volume()
	{
		double vol=width*height*depth;
		return vol;
	}
	}
